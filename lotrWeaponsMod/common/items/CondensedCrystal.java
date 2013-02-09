package lotrWeaponsMod.common.items;

import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.item.Item;

public class CondensedCrystal extends Item {

	public CondensedCrystal(int par1) {
		super(par1);
		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(5);
		setItemName("condensed_light_crystal");

	}

	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}
}
