package pumpkinMods.common;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringTranslate;
import pumpkinMods.common.pumpkinModsBase;

public class CreativeTabPumpkinTools extends CreativeTabs {
	public static String BGIMG = "/pumpkinMods/common/artwork/tab.png";

	public CreativeTabPumpkinTools() {

		super(BGIMG);
		// TODO Auto-generated constructor stub
	}

	public String getTranslatedTabLabel() {
		return StringTranslate.getInstance().translateKey(
				"" + this.getTabLabel());
	}

	public String getTabLabel() {
		return "PumpkinHeads Mods Tools";
	}

	@Override
	public ItemStack getIconItemStack() {

		return new ItemStack(pumpkinModsBase.rface);
	}

}
