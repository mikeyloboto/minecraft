package pumpkinMods.common;

import pumpkinMods.common.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class mface extends Item {

	public mface(int par1) {
		super(par1);
		maxStackSize = 8;
		setIconIndex(0);
		setItemName("mface");
	}

	public String getTextureFile() {
		return ClientProxy.PUMPTAB_PNG;
	}
}
