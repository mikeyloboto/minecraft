package advancedChemistry.common.tileentity;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.additionalData.AnalyzerResultStore;
import advancedChemistry.common.blocks.BlockAnalyzer;
import advancedChemistry.common.gui.GuiAnalyzer;
import advancedChemistry.common.recipes.RecipesAnalyzer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileAnalyzer extends TileEntity implements IInventory {

	public ItemStack[] inv;
	public AnalyzerResultStore res = new AnalyzerResultStore();
	
	public TileAnalyzer() {
		inv = new ItemStack[1];
	}

	@Override
	public int getSizeInventory() {
		return inv.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return inv[slot];
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		inv[slot] = stack;
		if (stack != null && stack.stackSize > getInventoryStackLimit()) {
			stack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public ItemStack decrStackSize(int slot, int amt) {
		ItemStack stack = getStackInSlot(slot);
		if (stack != null) {
			if (stack.stackSize <= amt) {
				setInventorySlotContents(slot, null);
			} else {
				stack = stack.splitStack(amt);
				if (stack.stackSize == 0) {
					setInventorySlotContents(slot, null);
				}
			}
		}
		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack stack = getStackInSlot(slot);
		if (stack != null) {
			setInventorySlotContents(slot, null);
		}
		return stack;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this
				&& player.getDistanceSq(xCoord + 0.5, yCoord + 0.5,
						zCoord + 0.5) < 64;
	}

	@Override
	public void openChest() {
	}

	@Override
	public void closeChest() {
	}

	@Override
	public void readFromNBT(NBTTagCompound tagCompound) {
		super.readFromNBT(tagCompound);

		NBTTagList tagList = tagCompound.getTagList("Inventory");
		for (int i = 0; i < tagList.tagCount(); i++) {
			NBTTagCompound tag = (NBTTagCompound) tagList.tagAt(i);
			byte slot = tag.getByte("Slot");
			if (slot >= 0 && slot < inv.length) {
				inv[slot] = ItemStack.loadItemStackFromNBT(tag);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound tagCompound) {
		super.writeToNBT(tagCompound);

		NBTTagList itemList = new NBTTagList();
		for (int i = 0; i < inv.length; i++) {
			ItemStack stack = inv[i];
			if (stack != null) {
				NBTTagCompound tag = new NBTTagCompound();
				tag.setByte("Slot", (byte) i);
				stack.writeToNBT(tag);
				itemList.appendTag(tag);
			}
		}
		tagCompound.setTag("Inventory", itemList);
	}

	@Override
	public String getInvName() {
		return "tileAnalyzer";
	}

	/*
	 * all shit is happening here
	 */
	@Override
	public void updateEntity() {
		if (!this.worldObj.isRemote) {
			this.analyzeItem();
		}
		this.onInventoryChanged();

	}

	private void analyzeItem() {
		ItemStack itm = this.getStackInSlot(0);
		if (itm != null) {
			this.res.readiness = true;
			if (itm.getItem() == AdvancedChemistry.bottledChemical
					|| itm.getItem() == AdvancedChemistry.capsuleChemical
					|| itm.getItem() == AdvancedChemistry.containerChemical
					|| itm.getItem() == AdvancedChemistry.Dust
					|| itm.getItem() == AdvancedChemistry.DustC
					|| itm.getItem() == AdvancedChemistry.Ingot
					|| itm.getItem() == AdvancedChemistry.reinforcedContainerChemical) {
				
				
				this.res.res1 = itm.getItemDamage();
				this.res.res2 = 0;
				this.res.res3 = 0;
				this.res.res4 = 0;
				//System.out.println("Test - " + Els[0]);

			} else {
				int input = (Integer) itm.itemID;
				
				
				this.res.res1 = RecipesAnalyzer.smelting().getElementResult(input, 1);
				this.res.res2 = RecipesAnalyzer.smelting().getElementResult(input, 2);
				this.res.res3 = RecipesAnalyzer.smelting().getElementResult(input, 3);
				this.res.res4 = RecipesAnalyzer.smelting().getElementResult(input, 4);
				//System.out.println("Shed - " + input);
			}
			this.res.readiness = true;
		} else
			this.res.readiness = false;
		System.out.println("Shed - " + this.res.readiness);
	}
}