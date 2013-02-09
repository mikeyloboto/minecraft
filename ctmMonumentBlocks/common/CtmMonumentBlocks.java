package ctmMonumentBlocks.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ctmMonumentBlocks.common.Blocks.CtmBlock;
import ctmMonumentBlocks.common.Blocks.ItemCtmBlock;
import ctmMonumentBlocks.common.commonData.CommonProxy;
import ctmMonumentBlocks.common.commonData.ConfigData;
import ctmMonumentBlocks.common.commonData.CreativeTabCtmBlocks;

//@Mod(modid = "ctmMonumentBlocks", name = "CTM Monument Blocks", version = "Beta 0.1")
//@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CtmMonumentBlocks {
	//public static final CreativeTabs TabCtm = new CreativeTabCtmBlocks();
	public static int blId = ConfigData.CTM_BLOCK_ID;
	public static Block CtmBlock;

	public static String bn = ConfigData.CTM_DEFAULT_NAME;
	private static final String[] multiBlockNames = { "White " + bn,
			"Orange " + bn, "Magenta " + bn, "Light Blue " + bn,
			"Yellow " + bn, "Light Green " + bn, "Pink " + bn,
			"Dark Grey " + bn, "Light Grey " + bn, "Cyan " + bn,
			"Purple " + bn, "Blue " + bn, "Brown " + bn, "Green " + bn,
			"Red " + bn, "Black " + bn };

	//@SidedProxy(clientSide = "ctmMonumentBlocks.common.commonData.ClientProxy", serverSide = "ctmMonumentBlocks.common.commonData.CommonProxy")
	public static CommonProxy proxy;

	//@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		ConfigData.loadConfig(event);
	}

	//@Init
	public void Init(FMLInitializationEvent event) {
		
		CtmBlock = new CtmBlock(blId);
		GameRegistry.registerBlock(CtmBlock/*, ItemCtmBlock.class, "ctmBlock"*/);
		//for (int i = 0; i < 16; i++) {
		//	ItemStack CtmBlockStack = new ItemStack(CtmBlock, 1, 0);
		//	LanguageRegistry.addName(CtmBlockStack,
		//			multiBlockNames[CtmBlockStack.getItemDamage()]);
		//}
		LanguageRegistry.addName(CtmBlock,  "Ctm Block");
		proxy.registerRenderers();
	}
}