package advancedChemistry.common.commonData;

import java.util.Random;

import advancedChemistry.common.AdvancedChemistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringTranslate;
import pumpkinMods.common.pumpkinModsBase;

public class ChemTab extends CreativeTabs {
	public static String BGIMG = "";

	public ChemTab() {

		super(BGIMG);
		// TODO Auto-generated constructor stub
	}

	public String getTranslatedTabLabel() {
		return StringTranslate.getInstance().translateKey(
				"" + this.getTabLabel());
	}

	public String getTabLabel() {
		return "Advanced Chemistry Chemicals";
	}

	@Override
	public ItemStack getIconItemStack() {

		return new ItemStack(AdvancedChemistry.bottledChemical, 1, 2);
	}

}
