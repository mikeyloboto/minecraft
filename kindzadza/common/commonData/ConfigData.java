package kindzadza.common.commonData;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.*;

public class ConfigData {

	public static int CAK_ID;
	public static int YELLO_PANTS_ID;
	public static int MAGENTA_PANTS_ID;
	public static int PACAK_PANTS_ID;
	public static int ECILOP_HELMET_ID;
	public static int ECILOP_CHESTPLATE_ID;
	public static int ECILOP_LEGGINS_ID;
	public static int ECILOP_BOOTS_ID;
	public static int KC_ID;
	public static int CHATL_ID;
	public static int TRANKLUKATOR_ID;
	public static int LUC_ID;

	static Configuration conf;

	public static void loadConf(FMLPreInitializationEvent event) {
		conf = new Configuration(event.getSuggestedConfigurationFile());
		loadExtraConf();
		conf.save();

	}

	private static void loadExtraConf() {
		CAK_ID = conf.get(Configuration.CATEGORY_GENERAL, "cak", 14350)
				.getInt();
		YELLO_PANTS_ID = conf.getItem("YelloPants", 14351).getInt();
		MAGENTA_PANTS_ID = conf.getItem("MagentaPants", 14352).getInt();
		PACAK_PANTS_ID = conf.getItem("PacakPants", 14353).getInt();
		ECILOP_HELMET_ID = conf.getItem("EcilopHelmet", 14354).getInt();
		ECILOP_CHESTPLATE_ID = conf.getItem("EcilopChestplate", 14355).getInt();
		ECILOP_LEGGINS_ID = conf.getItem("EcilopLeggins", 14356).getInt();
		ECILOP_BOOTS_ID = conf.getItem("EcilopBoots", 14357).getInt();
		KC_ID = conf.getItem("KC", 14358).getInt();
		CHATL_ID = conf.getItem("Chatl", 14359).getInt();
		TRANKLUKATOR_ID = conf.getItem("Tranklukator", 14360).getInt();
		LUC_ID = conf.getItem("Luc", 14361).getInt();

	}

	public static void loadBlocksConf() {

	}

	public static void loadItemsConf() {

	}

}
