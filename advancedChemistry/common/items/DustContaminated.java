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

public class DustContaminated extends Item {
	public DustContaminated(int par1, int par2) {
		super(par1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(AdvancedChemistry.ChemTab);
		this.setIconIndex(10);

	}

	@Override
	public String getItemNameIS(ItemStack par1) {
		int var1 = par1.getItemDamage();
		return DataStorage.element[var1].Name + "_dust";
	}

	@Override
	public void addInformation(ItemStack par1Stack, EntityPlayer par2Player,
			List par3List, boolean par4Bool) {
		int extraInfo = DataStorage.element[par1Stack.getItemDamage()].Stability;
		par3List.add(DataStorage.element[par1Stack.getItemDamage()].Symbol);
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int var4 = 1; var4 <= DataStorage.CurrentChemicals; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
		int var3 = par1ItemStack.getItemDamage();
		return par2 == 0 ? DataStorage.element[var3].SolutionColor : 16777215;
	}

}
