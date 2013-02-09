package lotrWeaponsMod.common.items;

import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AerialFuel extends Item {

	public AerialFuel(int id) {
		super(id);

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(2);
		setItemName("aerial_fuel");

	}

	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}
}
