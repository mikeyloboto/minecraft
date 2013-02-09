package kindzadza.common.items;

import kindzadza.common.KinDzaDza;
import kindzadza.common.commonData.ClientProxy;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class EcilopArmor extends ItemArmor implements IArmorTextureProvider {
	private int var1;

	public EcilopArmor(int par1, int par2, int par3, int par4) {
		super(par1, KinDzaDza.enumArmorEcilopArmor, par2, par3);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
		this.setIconIndex(par4);
		var1 = par4;
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		switch (var1) {
		case 4:
		case 5:
		case 7:
			return ClientProxy.ECILOP_1;
		case 6:
			return ClientProxy.ECILOP_2;
		default:
			return null;
		}
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;

	}

}
