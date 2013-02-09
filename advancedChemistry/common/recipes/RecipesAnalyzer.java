package advancedChemistry.common.recipes;

import java.util.*;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.commonData.DataStorage;

import net.minecraft.item.ItemStack;
import net.minecraft.src.*;

public class RecipesAnalyzer {
	private static final RecipesAnalyzer analyzeBase = new RecipesAnalyzer();

	/** The list of smelting results. */
	private Map analyze1 = new HashMap();
	private Map analyze2 = new HashMap();
	private Map analyze3 = new HashMap();
	private Map analyze4 = new HashMap();

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static final RecipesAnalyzer smelting() {
		return analyzeBase;
	}

	public RecipesAnalyzer() {


	}
	public int getModElement(ItemStack stack, int numE1)
	{
		return stack.getItemDamage();
	}
	public int getElementResult(int itemId, int numEl) {
		switch (numEl) {
		case 1:
			if (this.analyze1.containsKey(Integer.valueOf(itemId)))
				return (Integer) this.analyze1.get(Integer.valueOf(itemId));
			else return 0;
		case 2:
			if (this.analyze2.containsKey(Integer.valueOf(itemId)))
				return (Integer) this.analyze2.get(Integer.valueOf(itemId));
			else return 0;
		case 3:
			if (this.analyze3.containsKey(Integer.valueOf(itemId)))
				return (Integer) this.analyze3.get(Integer.valueOf(itemId));
			else return 0;
		case 4:
			if (this.analyze4.containsKey(Integer.valueOf(itemId)))
				return (Integer) this.analyze4.get(Integer.valueOf(itemId));
			else return 0;
		default:
			return 0;
		}
	}

	/**
	 * Adds a smelting recipe.
	 */
	public void addAnalyze(int itemId, int el1, int el2, int el3, int el4) {
		this.analyze1.put(Integer.valueOf(itemId), el1);
		this.analyze2.put(Integer.valueOf(itemId), el2);
		this.analyze3.put(Integer.valueOf(itemId), el3);
		this.analyze4.put(Integer.valueOf(itemId), el4);
	}

	public void addAnalyze(int itemId, int el1, int el2, int el3) {
		addAnalyze(itemId, el1, el2, el3, 0);
	}

	public void addAnalyze(int itemId, int el1, int el2) {
		addAnalyze(itemId, el1, el2, 0, 0);
	}

	public void addAnalyze(int itemId, int el1) {
		addAnalyze(itemId, el1, 0, 0, 0);
	}

}