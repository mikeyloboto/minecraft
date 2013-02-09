package modGems.common.commonData;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.*;

public class ConfigData {
	public static int AMETRINE_ORE;
	public static int BERYL_STONE;
	public static int SAPPHIRE_ORE;
	public static int ONYX_ORE;
	public static int FOSSIL_STONE;
	public static int AMETHYST_ORE;
	public static int QUARTZ_ORE;
	public static int AMETHYST_BLOCK;
	public static int SAPPHIRE_BLOCK;
	public static int AMETRINE_BLOCK;
	public static int GEM_BOX_BLOCK;
	public static int BLACK_ONYX_BLOCK;
	public static int AMBER_BLOCK;
	public static int CITRINE_BLOCK;
	public static int RED_BERYL_BLOCK;
	public static int AMETHYST_DUST;
	public static int AMETRINE_GEM;
	public static int RED_BERYL_GEM;
	public static int AQUAMARINE_GEM;
	public static int HELIODOR_GEM;
	public static int SAPPHIRE_GEM;
	public static int ONYX_GEM;
	public static int AMBER_GEM;
	public static int CITRINE_GEM;
	public static int AMETHYST_GEM;
	public static int CITRINE_DUST;
	public static int AMETRINE_DUST;
	public static int COMPRESSED_SAPPHIRE;
	public static int SARDONYX_GEM;
	public static boolean AMETRINE_MINEABLE;
	public static boolean USE_PREFIX;
	public static String GEM_PREFIX;

	static Configuration conf;

	public static void loadConf(FMLPreInitializationEvent event) {
		conf = new Configuration(event.getSuggestedConfigurationFile());
		conf.load();
		System.out
				.println("PumpkinHeads Mods [Collectible Gemstones] - Loading Blocks Configuration");
		loadBlocksConf();
		System.out
				.println("PumpkinHeads Mods [Collectible Gemstones] - Loading Items Configuration");
		loadItemsConf();
		System.out
				.println("PumpkinHeads Mods [Collectible Gemstones] - Loading Other Configuration");
		loadExtraConf();
		conf.save();
		System.out
				.println("PumpkinHeads Mods [Collectible Gemstones] - Configuration Loaded");

	}

	private static void loadExtraConf() {
		AMETRINE_MINEABLE = conf.get(Configuration.CATEGORY_GENERAL,
				"AmetrineIsMineable", false).getBoolean(false);
		Property ametrinecomment = conf.get(Configuration.CATEGORY_GENERAL,
				"AmetrineIsMineable", false);
		ametrinecomment.comment = "If set to false Ametrine can only be aquired by combining citrine and amethyst. If true, ametrine ore will spawn in the world";
		USE_PREFIX = conf.get(Configuration.CATEGORY_GENERAL, "UsePrefix",
				false).getBoolean(false);
		Property prefixcomment = conf.get(Configuration.CATEGORY_GENERAL,
				"UsePrefix", false);
		prefixcomment.comment = "If you have same gems in other mod, use this option to add prefix before the name of the item.";
		GEM_PREFIX = conf.get(Configuration.CATEGORY_GENERAL, "ItemPrefix",
				"Collectible Gems").value;
	}

	public static void loadBlocksConf() {
		// int randomBlockID = config.getBlock("RandomBlock", 200).getInt()
		// <-Should be like this
		AMETRINE_ORE = conf.getBlock("AmetrineOre", 756).getInt();
		BERYL_STONE = conf.getBlock("BerylStone", 757).getInt();
		SAPPHIRE_ORE = conf.getBlock("SapphireOre", 758).getInt();
		ONYX_ORE = conf.getBlock("OnyxOre", 759).getInt();
		FOSSIL_STONE = conf.getBlock("FossilStone", 760).getInt();
		AMETHYST_ORE = conf.getBlock("AmethystOre", 761).getInt();
		QUARTZ_ORE = conf.getBlock("QuartzOre", 762).getInt();
		AMETHYST_BLOCK = conf.getBlock("AmethystBlock", 763).getInt();
		SAPPHIRE_BLOCK = conf.getBlock("SapphireBlock", 764).getInt();
		AMETRINE_BLOCK = conf.getBlock("AmetrineBlock", 765).getInt();
		GEM_BOX_BLOCK = conf.getBlock("GemBoxBlock", 766).getInt();
		BLACK_ONYX_BLOCK = conf.getBlock("BlockOnyxBlock", 767).getInt();
		CITRINE_BLOCK = conf.getBlock("CitrineBlock", 768).getInt();
		AMBER_BLOCK = conf.getBlock("AmberBlock", 769).getInt();
		RED_BERYL_BLOCK = conf.getBlock("RedBerylBlock", 770).getInt();

	}

	public static void loadItemsConf() {
		AMETRINE_GEM = conf.getItem("AmetrineGem", 15347).getInt();
		RED_BERYL_GEM = conf.getItem("RedBerylGem", 15348).getInt();
		AQUAMARINE_GEM = conf.getItem("AquamarineGem", 15349).getInt();
		HELIODOR_GEM = conf.getItem("HeliodorGem", 15350).getInt();
		SAPPHIRE_GEM = conf.getItem("SapphireGem", 15351).getInt();
		ONYX_GEM = conf.getItem("OnyxGem", 15352).getInt();
		AMBER_GEM = conf.getItem("AmberGem", 15353).getInt();
		CITRINE_GEM = conf.getItem("CitrineGem", 15354).getInt();
		AMETHYST_GEM = conf.getItem("AmethystGem", 15355).getInt();
		AMETHYST_DUST = conf.getItem("AmethystDust", 15356).getInt();
		CITRINE_DUST = conf.getItem("CitrineDust", 15357).getInt();
		AMETRINE_DUST = conf.getItem("AmetrineDust", 15358).getInt();
		COMPRESSED_SAPPHIRE = conf.getItem("CompressedSapphire", 15359)
				.getInt();
		SARDONYX_GEM = conf.getItem("SardonyxGem", 15360).getInt();

	}

}
