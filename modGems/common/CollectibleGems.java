package modGems.common;

import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import modGems.common.commonData.CommonProxy;
import modGems.common.commonData.ConfigData;
import modGems.common.commonData.GemBoxRender;
import modGems.common.entity.GemBoxTileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = "CollectibleGems", name = "Collectible Gemstones", version = "V1.0", dependencies = "required-after:PumpkinBase@V1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CollectibleGems {

	public static Block AmetrineOre;
	public static Block BerylStone;
	public static Block SapphireOre;
	public static Block OnyxOre;
	public static Block FossilStone;
	public static Block AmethystOre;
	public static Block QuartzOre;
	public static Block AmethystBlock;
	public static Block SapphireBlock;
	public static Block AmetrineBlock;
	public static Block GemBoxBlock;
	public static Block BlackOnyxBlock;
	public static Block AmberBlock;
	public static Block CitrineBlock;
	public static Block RedBerylBlock;
	public static Item AmethystDust;
	public static Item AmetrineGem;
	public static Item RedBerylGem;
	public static Item AquamarineGem;
	public static Item HeliodorGem;
	public static Item SapphireGem;
	public static Item OnyxGem;
	public static Item AmberGem;
	public static Item CitrineGem;
	public static Item AmethystGem;
	public static Item CitrineDust;
	public static Item AmetrineDust;
	public static Item CompressedSapphire;
	public static Item Sardonyx;

	public static boolean prefixuse;
	public static String prefix;

	@Instance("CollectibleGems")
	public static CollectibleGems instance;

	@SidedProxy(clientSide = "modGems.common.commonData.ClientProxy", serverSide = "modGems.common.commonData.CommonProxy")
	public static CommonProxy proxy;
	public static int renderId;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		ConfigData.loadConf(event);

	}

	@Init
	public void load(FMLInitializationEvent event) {

		prefixuse = ConfigData.USE_PREFIX;
		prefix = ConfigData.GEM_PREFIX + " ";

		AmetrineOre = new modGems.common.ores.AmetrineOre(
				ConfigData.AMETRINE_ORE, 0).setHardness(3F).setResistance(3F)
				.setBlockName("ametrine_ore");
		GameRegistry.registerBlock(AmetrineOre);
		LanguageRegistry.addName(AmetrineOre, "Ametrine Ore");
		BerylStone = new modGems.common.ores.BerylStone(ConfigData.BERYL_STONE,
				1).setHardness(3F).setResistance(3F).setBlockName("beryl");
		GameRegistry.registerBlock(BerylStone);
		LanguageRegistry.addName(BerylStone, "Beryl");
		SapphireOre = new modGems.common.ores.SapphireOre(
				ConfigData.SAPPHIRE_ORE, 2).setHardness(3F).setResistance(3F)
				.setBlockName("sapphire_ore");
		GameRegistry.registerBlock(SapphireOre);
		LanguageRegistry.addName(SapphireOre, "Sapphire Ore");
		OnyxOre = new modGems.common.ores.OnyxOre(ConfigData.ONYX_ORE, 3)
				.setHardness(3F).setResistance(3F).setBlockName("onyx_ore");
		GameRegistry.registerBlock(OnyxOre);
		LanguageRegistry.addName(OnyxOre, "Onyx Ore");
		FossilStone = new modGems.common.ores.FossilStone(
				ConfigData.FOSSIL_STONE, 4).setHardness(3F).setResistance(3F)
				.setBlockName("fossil_stone");
		GameRegistry.registerBlock(FossilStone);
		LanguageRegistry.addName(FossilStone, "Fossils");
		AmethystOre = new modGems.common.ores.AmethystOre(
				ConfigData.AMETHYST_ORE, 5).setHardness(3F).setResistance(3F)
				.setBlockName("amethyst_ore");
		GameRegistry.registerBlock(AmethystOre);
		LanguageRegistry.addName(AmethystOre, "Amethyst Ore");
		QuartzOre = new modGems.common.ores.QuartzOre(ConfigData.QUARTZ_ORE, 6)
				.setHardness(3F).setResistance(3F).setBlockName("quartz_ore");
		GameRegistry.registerBlock(QuartzOre);
		LanguageRegistry.addName(QuartzOre, "Quartz");
		AmethystBlock = new modGems.common.blocks.AmethystBlock(
				ConfigData.AMETHYST_BLOCK, 7, Material.rock).setHardness(5F)
				.setResistance(10F).setBlockName("amethyst_block");
		GameRegistry.registerBlock(AmethystBlock);
		LanguageRegistry.addName(AmethystBlock, "Block of Amethyst");
		SapphireBlock = new modGems.common.blocks.SapphireBlock(
				ConfigData.SAPPHIRE_BLOCK, 8, Material.rock).setHardness(10F)
				.setResistance(10F).setBlockName("sapphire_block");
		GameRegistry.registerBlock(SapphireBlock);
		LanguageRegistry.addName(SapphireBlock, "Block of Sapphire");
		AmetrineBlock = new modGems.common.blocks.AmetrineBlock(
				ConfigData.AMETRINE_BLOCK, 9, Material.rock).setHardness(7F)
				.setResistance(10F).setBlockName("ametrine_block");
		GameRegistry.registerBlock(AmetrineBlock);
		LanguageRegistry.addName(AmetrineBlock, "Block of Ametrine");
		GemBoxBlock = new modGems.common.blocks.GemBoxBlock(
				ConfigData.GEM_BOX_BLOCK, 0).setHardness(3F).setResistance(3F)
				.setBlockName("display_box");
		GameRegistry.registerBlock(GemBoxBlock);
		LanguageRegistry.addName(GemBoxBlock, "Display Box");
		BlackOnyxBlock = new modGems.common.blocks.BlockOnyxBlock(
				ConfigData.BLACK_ONYX_BLOCK, 12, Material.rock).setHardness(5F)
				.setResistance(10F).setBlockName("black_onyx_block");
		GameRegistry.registerBlock(BlackOnyxBlock);
		LanguageRegistry.addName(BlackOnyxBlock, "Black Onyx Block");
		CitrineBlock = new modGems.common.blocks.CitrineBlock(
				ConfigData.CITRINE_BLOCK, 11, Material.rock).setHardness(5F)
				.setResistance(10F).setBlockName("citrine_block");
		GameRegistry.registerBlock(CitrineBlock);
		LanguageRegistry.addName(CitrineBlock, "Block of Citrine");
		AmberBlock = new modGems.common.blocks.AmberBlock(
				ConfigData.AMBER_BLOCK, 13, Material.rock).setHardness(7F)
				.setResistance(10F).setBlockName("amber_block");
		GameRegistry.registerBlock(AmberBlock);
		LanguageRegistry.addName(AmberBlock, "Block of Amber");
		RedBerylBlock = new modGems.common.blocks.RedBerylblock(
				ConfigData.RED_BERYL_BLOCK, 15, Material.rock).setHardness(7F)
				.setResistance(10F).setBlockName("red_beryl_block");
		GameRegistry.registerBlock(RedBerylBlock);
		LanguageRegistry.addName(RedBerylBlock, "Red Beryl Block");

		AmetrineGem = new modGems.common.items.AmetrineGem(
				ConfigData.AMETRINE_GEM);
		RedBerylGem = new modGems.common.items.RedBerylGem(
				ConfigData.RED_BERYL_GEM);
		AquamarineGem = new modGems.common.items.AquamarineGem(
				ConfigData.AQUAMARINE_GEM);
		HeliodorGem = new modGems.common.items.HeliodorGem(
				ConfigData.HELIODOR_GEM);
		SapphireGem = new modGems.common.items.SapphireGem(
				ConfigData.SAPPHIRE_GEM);
		OnyxGem = new modGems.common.items.OnyxGem(ConfigData.ONYX_GEM);
		AmberGem = new modGems.common.items.AmberGem(ConfigData.AMBER_GEM);
		CitrineGem = new modGems.common.items.CitrineGem(ConfigData.CITRINE_GEM);
		AmethystGem = new modGems.common.items.AmethystGem(
				ConfigData.AMETHYST_GEM);
		AmethystDust = new modGems.common.items.AmethystDust(
				ConfigData.AMETHYST_DUST);
		CitrineDust = new modGems.common.items.CitrineDust(
				ConfigData.CITRINE_DUST);
		AmetrineDust = new modGems.common.items.AmetrineDust(
				ConfigData.AMETRINE_DUST);
		CompressedSapphire = new modGems.common.items.CompressedSapphire(
				ConfigData.COMPRESSED_SAPPHIRE);
		Sardonyx = new modGems.common.items.Sardonyx(ConfigData.SARDONYX_GEM);

		GameRegistry.addSmelting(AmetrineOre.blockID,
				new ItemStack(AmetrineGem), 0.1f);
		GameRegistry.addSmelting(SapphireOre.blockID,
				new ItemStack(SapphireGem), 0.1f);
		GameRegistry.addSmelting(OnyxOre.blockID, new ItemStack(OnyxGem), 0.1f);
		GameRegistry.addSmelting(QuartzOre.blockID, new ItemStack(CitrineGem),
				0.1f);
		GameRegistry.addSmelting(AmethystOre.blockID,
				new ItemStack(AmethystGem), 0.1f);
		GameRegistry.addSmelting(AmethystDust.shiftedIndex, new ItemStack(
				AmethystGem), 0.1f);
		GameRegistry.addSmelting(CitrineDust.shiftedIndex, new ItemStack(
				CitrineGem), 0.1f);
		GameRegistry.addSmelting(AmetrineDust.shiftedIndex, new ItemStack(
				AmetrineGem), 0.1f);
		GameRegistry.addSmelting(CompressedSapphire.shiftedIndex,
				new ItemStack(SapphireGem, 4), 0);
		GameRegistry.addSmelting(SapphireBlock.blockID, new ItemStack(
				CompressedSapphire, 9), 0);

		if (prefixuse) {

			LanguageRegistry.addName(RedBerylGem, prefix + "Red Beryl");
			LanguageRegistry.addName(AmberGem, prefix + "Amber");
			LanguageRegistry.addName(AmethystDust, prefix + "Amethyst Dust");
			LanguageRegistry.addName(CitrineDust, prefix + "Citrine Dust");
			LanguageRegistry.addName(AquamarineGem, prefix + "Aquamarine");
			LanguageRegistry.addName(HeliodorGem, prefix + "Heliodor");
			LanguageRegistry.addName(AmetrineDust, prefix + "Ametrine Dust");
			LanguageRegistry.addName(CompressedSapphire, prefix
					+ "Compressed Sapphire");
			LanguageRegistry.addName(Sardonyx, prefix + "Sardonyx");
			LanguageRegistry.addName(AmethystGem, prefix + "Amethyst");
			LanguageRegistry.addName(CitrineGem, prefix + "Citrine");
			LanguageRegistry.addName(OnyxGem, prefix + "Onyx");
			LanguageRegistry.addName(SapphireGem, prefix + "Sapphire");
			LanguageRegistry.addName(AmetrineGem, prefix + "Ametrine");

		} else {
			LanguageRegistry.addName(RedBerylGem, "Red Beryl");
			LanguageRegistry.addName(AmberGem, "Amber");
			LanguageRegistry.addName(AmethystDust, "Amethyst Dust");
			LanguageRegistry.addName(CitrineDust, "Citrine Dust");
			LanguageRegistry.addName(AquamarineGem, "Aquamarine");
			LanguageRegistry.addName(HeliodorGem, "Heliodor");
			LanguageRegistry.addName(AmetrineDust, "Ametrine Dust");
			LanguageRegistry.addName(CompressedSapphire, "Compressed Sapphire");
			LanguageRegistry.addName(Sardonyx, "Sardonyx");
			LanguageRegistry.addName(AmethystGem, "Amethyst");
			LanguageRegistry.addName(CitrineGem, "Citrine");
			LanguageRegistry.addName(OnyxGem, "Onyx");
			LanguageRegistry.addName(SapphireGem, "Sapphire");
			LanguageRegistry.addName(AmetrineGem, "Ametrine");

		}

		ItemStack ametr1 = new ItemStack(AmethystGem);
		ItemStack ametr2 = new ItemStack(CitrineGem);
		ItemStack amet1 = new ItemStack(AmethystGem);
		ItemStack sapp1 = new ItemStack(SapphireGem);

		// GameRegistry.addShapelessRecipe(new ItemStack(AmetrineGem, 1),
		// ametr1, ametr2);
		GameRegistry.addRecipe(new ItemStack(AmethystBlock, 1), "xxx", "xxx",
				"xxx", 'x', amet1);
		GameRegistry.addRecipe(new ItemStack(CompressedSapphire, 1), "xx",
				"xx", 'x', sapp1);
		GameRegistry.addRecipe(new ItemStack(SapphireBlock, 1), "xxx", "xxx",
				"xxx", 'x', new ItemStack(CompressedSapphire, 1));
		GameRegistry.addRecipe(new ItemStack(AmetrineBlock, 1), "xxx", "xxx",
				"xxx", 'x', new ItemStack(AmetrineGem));
		GameRegistry.addRecipe(new ItemStack(AmethystGem, 9), "x", 'x',
				new ItemStack(AmethystBlock));
		GameRegistry.addRecipe(new ItemStack(CitrineBlock, 1), "xxx", "xxx",
				"xxx", 'x', new ItemStack(CitrineGem));
		GameRegistry.addRecipe(new ItemStack(CitrineGem, 9), "x", 'x',
				new ItemStack(CitrineBlock, 1));
		GameRegistry.addRecipe(new ItemStack(AmberBlock, 1), "xxx", "xxx",
				"xxx", 'x', new ItemStack(AmberGem));
		GameRegistry.addRecipe(new ItemStack(AmberGem, 9), "x", 'x',
				new ItemStack(AmberBlock, 1));
		GameRegistry.addRecipe(new ItemStack(RedBerylBlock, 1), "xxx", "xxx",
				"xxx", 'x', new ItemStack(RedBerylGem, 1));
		GameRegistry.addRecipe(new ItemStack(RedBerylGem, 9), "x", 'x',
				new ItemStack(RedBerylBlock));
		GameRegistry.addRecipe(new ItemStack(BlackOnyxBlock, 1), "xxx", "xxx",
				"xxx", 'x', new ItemStack(OnyxGem));
		GameRegistry.addRecipe(new ItemStack(OnyxGem, 9), "x", 'x',
				new ItemStack(BlackOnyxBlock, 1));
		GameRegistry.addRecipe(new ItemStack(GemBoxBlock, 1), "x", 'x',
				new ItemStack(net.minecraft.block.Block.dirt));
		GameRegistry.addShapelessRecipe(new ItemStack(AmetrineDust, 1),
				new ItemStack(AmethystDust, 1), new ItemStack(CitrineDust, 1));
		GameRegistry.addSmelting(AmetrineBlock.blockID, new ItemStack(
				AmetrineGem, 9), 0.5f);
		GameRegistry
				.registerWorldGenerator(new modGems.common.commonData.WorldOreGen());
		MinecraftForge.setBlockHarvestLevel(AmetrineOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BerylStone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SapphireOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(OnyxOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(FossilStone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(AmethystOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(QuartzOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AmethystBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SapphireBlock, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(AmetrineBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlackOnyxBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(CitrineBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AmberBlock, "pickaxe", 2);


		GemBoxRender tileent1 = new GemBoxRender();
		instance = this;
		GameRegistry.registerTileEntity(GemBoxTileEntity.class, "GemBoxEntity");
		proxy.registerRenderers();
	}
}