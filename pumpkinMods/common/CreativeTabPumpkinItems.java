package pumpkinMods.common;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringTranslate;
import pumpkinMods.common.pumpkinModsBase;

public class CreativeTabPumpkinItems extends CreativeTabs {
	public static String BGIMG = "/pumpkinMods/common/artwork/tab.png";

	public CreativeTabPumpkinItems() {

		super(BGIMG);
		// TODO Auto-generated constructor stub
	}

	public String getTranslatedTabLabel() {
		return StringTranslate.getInstance().translateKey(
				"" + this.getTabLabel());
	}

	public String getTabLabel() {
		return "PumpkinHeads Mods Items";
	}

	@Override
	public ItemStack getIconItemStack() {

		return new ItemStack(pumpkinModsBase.mface);
	}

}
