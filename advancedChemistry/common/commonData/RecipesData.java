package advancedChemistry.common.commonData;

import advancedChemistry.common.AdvancedChemistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RecipesData {
	public static void registerNormalRecipes() {
		for (int i = 1; i <= DataStorage.CurrentChemicals; i++) {
			if ((DataStorage.element[i].Metal == 2)
					|| (DataStorage.element[i].Metal == 4)) {
				GameRegistry.addRecipe(new ItemStack(
						AdvancedChemistry.containerChemical, 1, i), "xyx",
						"xzx", "xxx", 'x', new ItemStack(Block.glass, 1), 'y',
						new ItemStack(Item.ingotIron), 'z', new ItemStack(
								AdvancedChemistry.bottledChemical, 1, i));
				GameRegistry.addRecipe(new ItemStack(
						AdvancedChemistry.reinforcedContainerChemical, 1, i),
						"xyx", "fzf", "xxx", 'x',
						new ItemStack(Block.glass, 1), 'y', new ItemStack(
								Block.obsidian), 'z', new ItemStack(
								AdvancedChemistry.bottledChemical, 1, i), 'f',
						new ItemStack(Block.fenceIron));
				GameRegistry.addRecipe(new ItemStack(
						AdvancedChemistry.reinforcedContainerChemical, 1, i),
						"xyx", "fzf", "xxx", 'x',
						new ItemStack(Block.glass, 1), 'y', new ItemStack(
								Block.obsidian), 'z', new ItemStack(
								AdvancedChemistry.containerChemical, 1, i),
						'f', new ItemStack(Block.fenceIron));
				GameRegistry.addShapelessRecipe(new ItemStack(
						AdvancedChemistry.containerChemical, 1, i),
						new ItemStack(AdvancedChemistry.EmptyContainer, 1),
						new ItemStack(AdvancedChemistry.bottledChemical, 1, i));
				GameRegistry
						.addShapelessRecipe(new ItemStack(
								AdvancedChemistry.bottledChemical, 1, i),
								new ItemStack(
										AdvancedChemistry.containerChemical, 1,
										i), new ItemStack(Item.glassBottle, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(
						AdvancedChemistry.reinforcedContainerChemical, 1, i),
						new ItemStack(
								AdvancedChemistry.EmptyReinforcedContainer, 1),
						new ItemStack(AdvancedChemistry.bottledChemical, 1, i));
				GameRegistry.addShapelessRecipe(new ItemStack(
						AdvancedChemistry.bottledChemical, 1, i),
						new ItemStack(
								AdvancedChemistry.reinforcedContainerChemical,
								1, i), new ItemStack(Item.glassBottle, 1));
				GameRegistry.addShapelessRecipe(new ItemStack(
						AdvancedChemistry.containerChemical, 1, i),
						new ItemStack(AdvancedChemistry.EmptyContainer, 1),
						new ItemStack(
								AdvancedChemistry.reinforcedContainerChemical,
								1, i));
				GameRegistry
						.addShapelessRecipe(
								new ItemStack(
										AdvancedChemistry.reinforcedContainerChemical,
										1, i),
								new ItemStack(
										AdvancedChemistry.containerChemical, 1,
										i),
								new ItemStack(
										AdvancedChemistry.EmptyReinforcedContainer,
										1));
			}
			if ((DataStorage.element[i].Metal == 1)
					&& (DataStorage.element[i].Stability == 3)) {
				GameRegistry.addRecipe(new ItemStack(AdvancedChemistry.Ingot,
						1, i), "xx", "xx", 'x', new ItemStack(
						AdvancedChemistry.capsuleChemical, 1, i));
				GameRegistry.addShapelessRecipe(new ItemStack(
						AdvancedChemistry.capsuleChemical, 4, i),
						new ItemStack(AdvancedChemistry.Ingot, 1, i),
						new ItemStack(AdvancedChemistry.EmptyCapsule, 1),
						new ItemStack(AdvancedChemistry.EmptyCapsule, 1),
						new ItemStack(AdvancedChemistry.EmptyCapsule, 1),
						new ItemStack(AdvancedChemistry.EmptyCapsule, 1));

			}
			if (DataStorage.element[i].Metal == 1) {
				FurnaceRecipes.smelting().addSmelting(AdvancedChemistry.DustC.shiftedIndex, i, new ItemStack(AdvancedChemistry.Ingot, 1, i), 0.1f);

			}
		}
		GameRegistry.addRecipe(
				new ItemStack(AdvancedChemistry.EmptyCapsule, 1), "x", "y",
				'x', new ItemStack(Item.ingotIron), 'y', new ItemStack(
						Block.glass));
		GameRegistry.addRecipe(new ItemStack(AdvancedChemistry.EmptyContainer,
				1), "xzx", "x x", "xxx", 'z', new ItemStack(Item.ingotIron, 1),
				'x', new ItemStack(Block.glass));
		GameRegistry
				.addRecipe(new ItemStack(
						AdvancedChemistry.EmptyReinforcedContainer, 1), "xzx",
						"f f", "xxx", 'z', new ItemStack(Block.obsidian, 1),
						'x', new ItemStack(Block.glass), 'f', new ItemStack(
								Block.fenceIron));
	}
}
