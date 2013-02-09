package kindzadza.common;

import kindzadza.common.commonData.CommonProxy;
import kindzadza.common.commonData.ConfigData;
import kindzadza.common.items.Cak;
import kindzadza.common.items.Chatl;
import kindzadza.common.items.ChatlanPants;
import kindzadza.common.items.EcilopArmor;
import kindzadza.common.items.KC;
import kindzadza.common.items.Luc;
import kindzadza.common.items.Tranklukator;
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "kindzadza", name = "KinDzaDza Mod (Soviet Movie)", version = "1.0", dependencies = "required-after:PumpkinBase@V1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class KinDzaDza {

	public static Item Cak;
	public static Item YellowChatlanPants;
	public static Item MagentaChatlanPants;
	public static Item PacakPants;
	public static EnumArmorMaterial enumArmorMaterialCak = EnumHelper
			.addArmorMaterial("cak", -1, new int[] { 0, 0, 0, 0 }, 0);
	public static EnumArmorMaterial enumArmorChatlanPants = EnumHelper
			.addArmorMaterial("chatlanPants", -1, new int[] { 0, 0, 0, 0 }, 0);
	public static EnumArmorMaterial enumArmorEcilopArmor = EnumHelper
			.addArmorMaterial("ecilopArmor", 2048, new int[] { 3, 8, 5, 2 }, 15);

	public static Item EcilopHelmet;
	public static Item EcilopChest;
	public static Item EcilopLeggins;
	public static Item EcilopBoots;

	public static Item KC;
	public static Item Chatl;
	public static Item Luc;

	public static Item Tranklukator;

	@SidedProxy(clientSide = "kindzadza.common.commonData.ClientProxy", serverSide = "kindzadza.common.commonData.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// loading configs here
		// better create separate class for that
		ConfigData.loadConf(event);
	}

	@Init
	public void load(FMLInitializationEvent event) {

		Cak = new Cak(ConfigData.CAK_ID, 0, 0).setItemName("cak");
		YellowChatlanPants = new ChatlanPants(ConfigData.YELLO_PANTS_ID, 2, 2,
				1).setItemName("yellow_chatlan_pants");
		MagentaChatlanPants = new ChatlanPants(ConfigData.MAGENTA_PANTS_ID, 2,
				2, 2).setItemName("magenta_chatlan_pants");
		PacakPants = new ChatlanPants(ConfigData.PACAK_PANTS_ID, 2, 2, 3)
				.setItemName("pacak_pants");
		EcilopHelmet = new EcilopArmor(ConfigData.ECILOP_HELMET_ID, 0, 0, 4)
				.setItemName("ecilop_helmet");
		EcilopChest = new EcilopArmor(ConfigData.ECILOP_CHESTPLATE_ID, 1, 1, 5)
				.setItemName("ecilop_chestplate");
		EcilopLeggins = new EcilopArmor(ConfigData.ECILOP_LEGGINS_ID, 2, 2, 6)
				.setItemName("ecilop_leggins");
		EcilopBoots = new EcilopArmor(ConfigData.ECILOP_BOOTS_ID, 3, 3, 7)
				.setItemName("ecilop_boots");
		KC = new KC(ConfigData.KC_ID);
		Chatl = new Chatl(ConfigData.CHATL_ID).setItemName("chatl");
		;
		Tranklukator = new Tranklukator(ConfigData.TRANKLUKATOR_ID)
				.setItemName("tranklukator");
		Luc = new Luc(ConfigData.LUC_ID).setItemName("luc");

		LanguageRegistry.addName(YellowChatlanPants, "Yellow Chatlan Pants");
		LanguageRegistry.addName(MagentaChatlanPants, "Magenta Chatlan Pants");
		LanguageRegistry.addName(PacakPants, "Pacak Pants");
		LanguageRegistry.addName(Cak, "Cak");
		LanguageRegistry.addName(EcilopHelmet, "Ecilop Helmet");
		LanguageRegistry.addName(EcilopChest, "Ecilop Chestplate");
		LanguageRegistry.addName(EcilopLeggins, "Ecilop Leggins");
		LanguageRegistry.addName(EcilopBoots, "Ecilop Boots");
		LanguageRegistry.addName(KC, "KC");
		LanguageRegistry.addName(Chatl, "Chatl");
		LanguageRegistry.addName(Tranklukator, "Tranklukator");
		LanguageRegistry.addName(Luc, "Luc");

		GameRegistry.addRecipe(new ItemStack(Cak, 1), "xyx", 'x',
				new ItemStack(Item.goldNugget, 1), 'y', new ItemStack(
						Item.ingotIron));
		GameRegistry.addRecipe(new ItemStack(YellowChatlanPants), "xxx", "z z",
				"z z", 'x', new ItemStack(Item.ingotIron, 1), 'z',
				new ItemStack(Block.cloth, 1, 4));
		GameRegistry.addRecipe(new ItemStack(MagentaChatlanPants), "xxx",
				"z z", "z z", 'x', new ItemStack(Item.ingotGold, 1), 'z',
				new ItemStack(Block.cloth, 1, 2));
		GameRegistry.addRecipe(new ItemStack(PacakPants), "xxx", "z z", "z z",
				'x', new ItemStack(Block.dirt, 1), 'z', new ItemStack(
						Block.cloth, 1));
		GameRegistry.addRecipe(new ItemStack(EcilopHelmet), "xxx", "zyz", 'x',
				new ItemStack(Item.ingotIron, 1), 'z', new ItemStack(
						Item.leather, 1), 'y',
				new ItemStack(Block.thinGlass, 1));
		GameRegistry.addRecipe(new ItemStack(EcilopChest), "x x", "xyx", "xzx",
				'x', new ItemStack(Item.ingotIron, 1), 'z', new ItemStack(
						Item.redstoneRepeater, 1), 'y', new ItemStack(
						Item.diamond, 1));
		GameRegistry.addRecipe(new ItemStack(EcilopLeggins), "xxx", "y y",
				"y y", 'x', new ItemStack(Item.ingotIron, 1), 'y',
				new ItemStack(Block.fenceIron, 1));
		GameRegistry.addRecipe(new ItemStack(EcilopBoots), "y y", "z z", "x x",
				'x', new ItemStack(Item.ingotIron, 1), 'z', new ItemStack(
						Item.leather, 1), 'y', new ItemStack(Block.cloth, 1));
		GameRegistry.addRecipe(new ItemStack(KC, 1), "x", "y", 'x',
				new ItemStack(Item.gunpowder, 1), 'y', new ItemStack(
						Item.stick, 1));
		GameRegistry.addRecipe(new ItemStack(Chatl, 2), " x ", "xyx", " x ",
				'x', new ItemStack(Item.goldNugget, 1), 'y', new ItemStack(
						Block.cobblestone, 1));
		for (int i = 1; i < 51; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(Tranklukator, 1, 0),
					new ItemStack(Tranklukator, 1, i), new ItemStack(Luc, 1));
		}

		proxy.registerRenderers();
	}

}
