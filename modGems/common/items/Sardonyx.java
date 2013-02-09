package modGems.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import modGems.common.commonData.ClientProxy;

public class Sardonyx extends Item {

	public Sardonyx(int id) {
		super(id);

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(13);
		setItemName("sardonyx");

	}

	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}
