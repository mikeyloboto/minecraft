package lotrWeaponsMod.common.commonData;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.*;

public class ConfigData {

	// blocks

	public static int DWARF_FURNACE;
	public static int AERIAL_MATTER;
	public static int DWARF_FURNACE_CASING;
	public static int CONDENSED_LIGHT_CRYSTAL;
	public static int LIGHT_BLOCK;

	// items

	public static int ELVEN_ALLOY;
	public static int ELVEN_ALLOY_INGOT;
	public static int AERIAL_FUEL;
	public static int CONDENSED_LIGHT_CRYSTAL_SHARD;
	public static int CONDENSED_LIGHT_CHUNK;
	public static int CONDENSED_CRYSTALIZED_LIGHT;
	public static int CONDENSED_LIGHT_BOTTLE;
	public static int GLOWING_PHIAL;
	public static int SWORD_STING;
	public static int SWORD_GLAMDRING;
	public static int SWORD_NARSIL;
	public static int MITHRIL_CHESTPLATE;

	// other

	public static int CHUNKS_PER_CLOUD;
	public static int PHIAL_WORKING_ZONE;
	public static int ARRAY_VAL;

	static Configuration conf;

	public static void loadConf(FMLPreInitializationEvent event) {
		conf = new Configuration(event.getSuggestedConfigurationFile());
		conf.load();
		System.out
				.println("PumpkinHeads Mods [LOTR Weapons] - Loading Blocks Configuration");
		loadBlocksConf();
		System.out
				.println("PumpkinHeads Mods [LOTR Weapons] - Loading Items Configuration");
		loadItemsConf();
		System.out
				.println("PumpkinHeads Mods [LOTR Weapons] - Loading Other Configuration");
		loadExtraConf();
		conf.save();
		System.out
				.println("PumpkinHeads Mods [LOTR Weapons] - Configuration Loaded");

	}

	private static void loadExtraConf() {

		CHUNKS_PER_CLOUD = conf.get(Configuration.CATEGORY_GENERAL,
				"ChunksPerCloud", 100).getInt();
		PHIAL_WORKING_ZONE = conf.get(Configuration.CATEGORY_GENERAL,
				"GlowingPhialWorkingZone", 8).getInt();
		ARRAY_VAL = conf.get(Configuration.CATEGORY_GENERAL, "ArrayVal", 30)
				.getInt();

	}

	public static void loadBlocksConf() {

		DWARF_FURNACE = conf.getBlock("DwarfFurnace", 800).getInt();
		AERIAL_MATTER = conf.getBlock("AerialMatter", 801).getInt();
		DWARF_FURNACE_CASING = conf.getBlock("DwarfFurnaceCasing", 802)
				.getInt();
		CONDENSED_LIGHT_CRYSTAL = conf.getBlock("CondensedLightCrystal", 803)
				.getInt();
		LIGHT_BLOCK = conf.getBlock("LightBlock", 804).getInt();
	}

	public static void loadItemsConf() {
		ELVEN_ALLOY = conf.getItem("ElvenAlloy", 15380).getInt();
		ELVEN_ALLOY_INGOT = conf.getItem("ElvenAlloyIngot", 15381).getInt();
		AERIAL_FUEL = conf.getItem("AerialFuel", 15382).getInt();
		CONDENSED_LIGHT_CRYSTAL_SHARD = conf.getItem(
				"CondensedLightCrystalShard", 15383).getInt();
		CONDENSED_LIGHT_CHUNK = conf.getItem("CondensedLightChunk", 15384)
				.getInt();
		CONDENSED_CRYSTALIZED_LIGHT = conf.getItem("CondensedCrystalizedLight",
				15385).getInt();
		CONDENSED_LIGHT_BOTTLE = conf.getItem("CondensedLightBottle", 15386)
				.getInt();
		GLOWING_PHIAL = conf.getItem("GlowingPhial", 15387).getInt();
		SWORD_STING = conf.getItem("SwordSting", 15388).getInt();
		SWORD_GLAMDRING = conf.getItem("SwordGlamdring", 15389).getInt();
		SWORD_NARSIL = conf.getItem("SwordNarsil", 15390).getInt();
		MITHRIL_CHESTPLATE = conf.getItem("MithrilChestplate", 15391).getInt();

	}

}
