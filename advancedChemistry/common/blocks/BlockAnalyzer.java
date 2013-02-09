package advancedChemistry.common.blocks;

import java.util.Random;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.commonData.ClientProxy;
import advancedChemistry.common.tileentity.TileAnalyzer;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAnalyzer extends BlockContainer {
	public BlockAnalyzer(int blockId) {
		super(blockId, Material.rock);
		this.setBlockName("blockTutorial");
		this.setCreativeTab(AdvancedChemistry.ChemStuff);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int i, float f, float g, float t) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(AdvancedChemistry.instance, 0, world, x, y, z);
		return true;
	}

	
	@Override
	public String getTextureFile()
	{
		return ClientProxy.BLOCKS_PNG;
	}
	
	@Override
	public int getBlockTextureFromSide(int inp) {
		switch (inp) {
		default:
			return 0;	
		case 1:
			return 1;
		case 0:
			return 2;
		}
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, int i, int j) {
		dropItems(world, x, y, z);
		super.breakBlock(world, x, y, z, i, j);
	}

	// Just a method to drop the items when the block is broken, it has 4 params
	// @param World, just the standared world instance,
	// @param int x, y, z, the blocks x, y, z coords
	// Although this method can be required if chosen to I will not be going
	// into it because its not what this tutorial is about,
	// And its also a long method, if you want to make this method, you are
	// allowed to copy the code and use it or do whatever you wish to do with it
	private void dropItems(World world, int x, int y, int z) {
		Random rand = new Random();

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if (!(tile_entity instanceof IInventory)) {
			return;
		}

		IInventory inventory = (IInventory) tile_entity;

		for (int i = 0; i < inventory.getSizeInventory(); i++) {
			ItemStack item = inventory.getStackInSlot(i);

			if (item != null && item.stackSize > 0) {
				float rx = rand.nextFloat() * 0.6F + 0.1F;
				float ry = rand.nextFloat() * 0.6F + 0.1F;
				float rz = rand.nextFloat() * 0.6F + 0.1F;

				EntityItem entity_item = new EntityItem(world, x + rx, y + ry,
						z + rz, new ItemStack(item.itemID, item.stackSize,
								item.getItemDamage()));

				if (item.hasTagCompound()) {
					entity_item.func_92014_d().setTagCompound((NBTTagCompound) item
							.getTagCompound().copy());
				}

				float factor = 0.5F;

				entity_item.motionX = rand.nextGaussian() * factor;
				entity_item.motionY = rand.nextGaussian() * factor + 0.2F;
				entity_item.motionZ = rand.nextGaussian() * factor;
				world.spawnEntityInWorld(entity_item);
				item.stackSize = 0;
			}
		}
	}

	// A required method from BlockContainer
	// Just creates a new TileEntity on the placement of the block
	// Has 1 param
	// @param World, also just the standard world instance
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileAnalyzer();
	}

}