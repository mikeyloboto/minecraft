package advancedChemistry.common.commonData;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.*;

public class ConfigData {

	public static int BOTTLED_CHEMICAL_ID;
	public static int CONTAINER_ID;
	public static int CONTAINERED_CHEMICAL_ID;
	public static int REINFORCED_CONTAINER_ID;
	public static int REINFORCED_CHEMICAL_ID;
	public static int INGOTS_ID;
	public static int CAPSULE_ID;
	public static int CAPSULE_CHEMICAL_ID;
	public static int ACID_ID;
	public static int DUST_ID;
	public static int DUSTC_ID;
	
	public static int ANALYZER;
	public static int SEPARATOR;
	public static int PURIFIER;
	
	static Configuration conf;

	public static void loadConf(FMLPreInitializationEvent event) {
		conf = new Configuration(event.getSuggestedConfigurationFile());
		loadItemsConf();
		loadBlocksConf();
		conf.save();

	}

	private static void loadExtraConf() {

	}

	public static void loadBlocksConf() {
		ANALYZER = conf.getBlock("Analyzer", 850).getInt();
		SEPARATOR = conf.getBlock("Separator", 851).getInt();
		PURIFIER = conf.getBlock("Purifier", 852).getInt();
		

	}

	public static void loadItemsConf() {
		BOTTLED_CHEMICAL_ID = conf.getItem("BottledChemical", 14400,
				"Bottle With Chemical").getInt();
		CONTAINER_ID = conf.getItem("Container", 14401, "Container").getInt();
		CONTAINERED_CHEMICAL_ID = conf.getItem("ContaineredChemical", 14402,
				"Container With Chemical").getInt();
		REINFORCED_CONTAINER_ID = conf.getItem("ReinforcedContainer", 14403,
				"Reinforced Container").getInt();
		REINFORCED_CHEMICAL_ID = conf.getItem("ReinforcedContaineredChemical",
				14404, "Reinforced Container With Chemical").getInt();
		INGOTS_ID = conf.getItem("Ingot", 14405, "Metal Ingots").getInt();
		CAPSULE_ID = conf.getItem("EmptyCapsule", 14406, "Empty Capsule")
				.getInt();
		CAPSULE_CHEMICAL_ID = conf.getItem("FullCapsule", 14407,
				"Capsule with chemical").getInt();
		ACID_ID = conf.getItem("CompBottle", 14408, "Bottled Acid").getInt();
		DUST_ID = conf.getItem("Dust", 14419, "Contaminated Dust").getInt();
		DUSTC_ID = conf.getItem("Dustc", 14420, "Clean Dust").getInt();
			

	}

}
