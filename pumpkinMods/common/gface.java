package pumpkinMods.common;

import pumpkinMods.common.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class gface extends Item {

	public gface(int par1) {
		super(par1);
		maxStackSize = 8;
		setIconIndex(1);
		setItemName("gface");
	}

	public String getTextureFile() {
		return ClientProxy.PUMPTAB_PNG;
	}
}
