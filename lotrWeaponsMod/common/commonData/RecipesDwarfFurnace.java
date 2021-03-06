package lotrWeaponsMod.common.commonData;

import java.util.*;

import lotrWeaponsMod.common.LotrWeapons;

import net.minecraft.item.ItemStack;
import net.minecraft.src.*;

public class RecipesDwarfFurnace {
	private static final RecipesDwarfFurnace smeltingBase = new RecipesDwarfFurnace();

	/** The list of smelting results. */
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	private Map metaSmeltingList = new HashMap();

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static final RecipesDwarfFurnace smelting() {
		return smeltingBase;
	}

	private RecipesDwarfFurnace() {
		this.addSmelting(LotrWeapons.ElvenAlloy.shiftedIndex, new ItemStack(
				LotrWeapons.ElvenAlloyIngot), 0.0F);
		this.addSmelting(LotrWeapons.CondensedLightChunk.shiftedIndex,
				new ItemStack(LotrWeapons.CondensedCrystal), 0.0F);
	}

	/**
	 * Adds a smelting recipe.
	 */
	public void addSmelting(int par1, ItemStack par2ItemStack, float par3) {
		this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
		this.experienceList.put(Integer.valueOf(par2ItemStack.itemID),
				Float.valueOf(par3));
	}

	/**
	 * Returns the smelting result of an item. Deprecated in favor of a metadata
	 * sensitive version
	 */
	@Deprecated
	public ItemStack getSmeltingResult(int par1) {
		return (ItemStack) this.smeltingList.get(Integer.valueOf(par1));
	}

	public Map getSmeltingList() {
		return this.smeltingList;
	}

	public float func_77601_c(int par1) {
		return this.experienceList.containsKey(Integer.valueOf(par1)) ? ((Float) this.experienceList
				.get(Integer.valueOf(par1))).floatValue() : 0.0F;
	}

	/**
	 * Add a metadata-sensitive furnace recipe
	 * 
	 * @param itemID
	 *            The Item ID
	 * @param metadata
	 *            The Item Metadata
	 * @param itemstack
	 *            The ItemStack for the result
	 */
	public void addSmelting(int itemID, int metadata, ItemStack itemstack) {
		metaSmeltingList.put(Arrays.asList(itemID, metadata), itemstack);
	}

	/**
	 * Used to get the resulting ItemStack form a source ItemStack
	 * 
	 * @param item
	 *            The Source ItemStack
	 * @return The result ItemStack
	 */
	public ItemStack getSmeltingResult(ItemStack item) {
		if (item == null) {
			return null;
		}
		ItemStack ret = (ItemStack) metaSmeltingList.get(Arrays.asList(
				item.itemID, item.getItemDamage()));
		if (ret != null) {
			return ret;
		}
		return (ItemStack) smeltingList.get(Integer.valueOf(item.itemID));
	}
}