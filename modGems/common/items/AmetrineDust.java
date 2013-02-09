package modGems.common.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import modGems.common.commonData.ClientProxy;

public class AmetrineDust extends Item {

	public AmetrineDust(int id) {
		super(id);

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(11);
		setItemName("ametrinedust");

	}

	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

}
