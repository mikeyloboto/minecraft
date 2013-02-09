package advancedChemistry.common.items;

import java.util.List;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.commonData.ClientProxy;
import advancedChemistry.common.commonData.CompoundsRegistry;
import advancedChemistry.common.commonData.DamageChemical;
import advancedChemistry.common.commonData.DataStorage;
import advancedChemistry.common.compounds.Acid;
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

public class AcidBottle extends Item {
	public Acid contains;

	public AcidBottle(int par1, int par2) {
		super(par1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setContainerItem(Item.glassBottle);
		this.setCreativeTab(AdvancedChemistry.ChemTab);

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
		return CompoundsRegistry.acid[var1].name + "_bottle";
	}

	@Override
	public void addInformation(ItemStack par1Stack, EntityPlayer par2Player,
			List par3List, boolean par4Bool) {
		int meta = par1Stack.getItemDamage();
		par3List.add(CompoundsRegistry.acid[meta].getFormula());

	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int var4 = 1; var4 < CompoundsRegistry.AcidicGroups; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
		int var3 = par1ItemStack.getItemDamage();
		return (par2 > 0) ? 16777215 : 14342396;
	}

}
