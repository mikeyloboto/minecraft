package ctmMonumentBlocks.common.commonData;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigData {
	public static int CTM_BLOCK_ID;
	public static String CTM_DEFAULT_NAME;
	static Configuration conf;

	public static void loadConfig(FMLPreInitializationEvent event) {
		conf = new Configuration(event.getSuggestedConfigurationFile());
		conf.load();
		loadBlocks();
		loadOther();
		System.out.println(CTM_DEFAULT_NAME);
		conf.save();
	}

	private static void loadOther() {
		CTM_DEFAULT_NAME = conf.get(Configuration.CATEGORY_GENERAL,
				"BlockDefName", "Monument Block").value;

	}

	private static void loadBlocks() {
		CTM_BLOCK_ID = conf.getBlock("CtmBlockId", 13380).getInt();
	}
}
