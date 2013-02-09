package pumpkinMods.common;

import pumpkinMods.common.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class rface extends Item {

	public rface(int par1) {
		super(par1);
		maxStackSize = 8;
		setIconIndex(2);
		setItemName("rface");
	}

	public String getTextureFile() {
		return ClientProxy.PUMPTAB_PNG;
	}
}
