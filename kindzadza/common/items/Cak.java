package kindzadza.common.items;

import kindzadza.common.KinDzaDza;
import kindzadza.common.commonData.ClientProxy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Cak extends ItemArmor implements IArmorTextureProvider {

	public Cak(int par1, int par2, int par3) {
		super(par1, KinDzaDza.enumArmorMaterialCak, par2, par3);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
		this.setIconIndex(0);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		return ClientProxy.CAK_PNG;
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;

	}

}
