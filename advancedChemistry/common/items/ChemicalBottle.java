package advancedChemistry.common.items;

import java.util.List;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.commonData.ClientProxy;
import advancedChemistry.common.commonData.DamageChemical;
import advancedChemistry.common.commonData.DataStorage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ChemicalBottle extends ItemFood {
	public ChemicalBottle(int par1, int par2) {
		super(par1, 0, false);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setContainerItem(Item.glassBottle);
		this.setCreativeTab(AdvancedChemistry.ChemTab);
		this.setAlwaysEdible();

	}

	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public int getIconFromDamageForRenderPass(int par1, int par2) {
		return par2 > 0 ? 0 : 1;
	}

	@Override
	public String getItemNameIS(ItemStack par1) {
		int var1 = par1.getItemDamage();
		return DataStorage.element[var1].Name + "_bottle";
	}

	@Override
	public void addInformation(ItemStack par1Stack, EntityPlayer par2Player,
			List par3List, boolean par4Bool) {
		int extraInfo = DataStorage.element[par1Stack.getItemDamage()].Stability;
		par3List.add(DataStorage.element[par1Stack.getItemDamage()].Symbol
				+ " - " + par1Stack.getItemDamage());
		switch (extraInfo) {
		case 4:
			par3List.add("WARNING! Low temperature! Avoid contact with skin!");
			break;
		case 5:
			par3List.add("WARNING! Highly corrosive!");
			break;
		case 6:
			par3List.add("WARNING! Alkali metal! Avoid contact with water!");
			break;
		case 7:
			par3List.add("WARNING! Extremely poisonous!");
			break;
		}
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		// switch (DataStorage.element[par1ItemStack.getItemDamage()].Stability)
		// {
		// case 7: case 4: case 5: case 6:
		return EnumAction.drink;
		// default:
		// return null;

		// }

	}

	@Override
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		--par1ItemStack.stackSize;
		// par3EntityPlayer.getFoodStats().addStats(this);
		// this.func_77849_c(par1ItemStack, par2World, par3EntityPlayer);
		switch (DataStorage.element[par1ItemStack.getItemDamage()].Stability) {
		case 7:
			par3EntityPlayer
					.attackEntityFrom(
							new DamageChemical("chemicalpoison",
									DataStorage.element[par1ItemStack
											.getItemDamage()].Name, 1), 200);
			break;
		case 4:
			par3EntityPlayer
					.attackEntityFrom(
							new DamageChemical("lowtemperaturepoison",
									DataStorage.element[par1ItemStack
											.getItemDamage()].Name, 2), 200);
		case 5:
			par3EntityPlayer
					.attackEntityFrom(
							new DamageChemical("corrosionpoison",
									DataStorage.element[par1ItemStack
											.getItemDamage()].Name, 3), 200);
		case 6:
			par3EntityPlayer
					.attackEntityFrom(
							new DamageChemical("alkalipoison",
									DataStorage.element[par1ItemStack
											.getItemDamage()].Name, 4), 200);
			break;
		}
		return par1ItemStack;
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int var4 = 1; var4 <= DataStorage.CurrentChemicals; ++var4) {
			if ((DataStorage.element[var4].Metal == 2)
					|| (DataStorage.element[var4].Metal == 4)) {
				par3List.add(new ItemStack(par1, 1, var4));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
		int var3 = par1ItemStack.getItemDamage();
		return par2 == 0 ? DataStorage.element[var3].SolutionColor : 16777215;
	}

}
