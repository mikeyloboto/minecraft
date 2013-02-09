package modGems.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import modGems.common.commonData.ClientProxy;

public class CompressedSapphire extends Item {

	public CompressedSapphire(int id) {
		super(id);

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(12);
		setItemName("compressed_Sapphire");

	}

	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}
