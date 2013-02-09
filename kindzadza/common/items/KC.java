package kindzadza.common.items;

import kindzadza.common.commonData.ClientProxy;
import net.minecraft.item.ItemFireball;

public class KC extends ItemFireball {

	public KC(int par1) {
		super(par1);
		this.setItemName("kc");
		this.setIconIndex(8);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

	@Override
	public boolean isFull3D() {
		return true;

	}

}
