package kindzadza.common.items;

import kindzadza.common.KinDzaDza;
import kindzadza.common.commonData.ClientProxy;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ChatlanPants extends ItemArmor implements IArmorTextureProvider {
	private int var1;

	public ChatlanPants(int par1, int par2, int par3, int par4) {
		super(par1, KinDzaDza.enumArmorChatlanPants, par2, par3);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
		this.setIconIndex(par4);
		var1 = par4;
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		switch (var1) {
		case 1:
			return ClientProxy.YPANTS_PNG;
		case 2:
			return ClientProxy.MPANTS_PNG;
		case 3:
			return ClientProxy.PPANTS_PNG;
		default:
			return "Error";
		}
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;

	}

}
