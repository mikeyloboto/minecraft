package lotrWeaponsMod.common.items;

import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.item.Item;

public class LightCrystalShard extends Item {

	public LightCrystalShard(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		setIconIndex(3);
		setItemName("light_crystal");

	}

	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}
}
