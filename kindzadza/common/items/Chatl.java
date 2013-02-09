package kindzadza.common.items;

import kindzadza.common.commonData.ClientProxy;
import net.minecraft.item.Item;

public class Chatl extends Item {
	public Chatl(int par1) {
		super(par1);
		this.setIconIndex(9);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
	}

	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

}
