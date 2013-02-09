package lotrWeaponsMod.common.items;

import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.item.Item;

public class CondensedLightBottle extends Item {

	public CondensedLightBottle(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(6);
		setItemName("condensed_light_bottle");

	}

	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}
}
