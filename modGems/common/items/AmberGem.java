package modGems.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import modGems.common.commonData.ClientProxy;

public class AmberGem extends Item {

	public AmberGem(int id) {
		super(id);

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(0);
		setItemName("amber");

	}

	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}
