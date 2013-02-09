package modGems.common.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import modGems.common.commonData.ClientProxy;

public class CitrineGem extends Item {

	public CitrineGem(int id) {
		super(id);

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(4);
		setItemName("citrine");

	}

	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

}
