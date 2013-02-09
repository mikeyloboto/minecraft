package pumpkinMods.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = "PumpkinBase", name = "PumpkinHeads Base Mod", version = "V1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class pumpkinModsBase {

	public static final CreativeTabs pumpkinTabItems = new CreativeTabPumpkinItems();
	public static final CreativeTabs pumpkinTabBlocks = new CreativeTabPumpkinBlocks();
	public static final CreativeTabs pumpkinTabTools = new CreativeTabPumpkinTools();
	public static Item mface;
	public static Item gface;
	public static Item rface;

	@SidedProxy(clientSide = "pumpkinMods.common.ClientProxy", serverSide = "pumpkinMods.common.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		ConfigData.loadConf(event);

	}

	@Init
	public void load(FMLInitializationEvent event) {

		mface = new mface(ConfigData.MFACE);
		gface = new gface(ConfigData.GFACE);
		rface = new rface(ConfigData.RFACE);
		LanguageRegistry.addName(mface, "Mikey_Loboto");
		LanguageRegistry.addName(gface, "gizr_padukovich");
		LanguageRegistry.addName(rface, "chickenleche");
		proxy.registerRenderers();
		// EntityRegistry.registerModEntity(PumpkinHead.class, "Mikey_Loboto",
		// 1, this, 80, 3, true);
		// EntityRegistry.addSpawn(PumpkinHead.class, 10, 2, 4,
		// EnumCreatureType.monster, BiomeGenBase.beach,
		// BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
		// BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle,
		// BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
		// BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
		// BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		// LanguageRegistry.instance().addStringLocalization("entity.Tutorial_Tutorialmod.Tutorial.name",
		// "Tutorial");
	}
}
