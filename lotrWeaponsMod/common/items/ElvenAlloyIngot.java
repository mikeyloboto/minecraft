package lotrWeaponsMod.common.items;

import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElvenAlloyIngot extends Item {

	public ElvenAlloyIngot(int id) {
		super(id);

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(1);
		setItemName("elven_alloy_ingot");

	}

	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}
}
