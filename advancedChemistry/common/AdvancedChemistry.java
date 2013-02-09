package advancedChemistry.common;

import advancedChemistry.common.blocks.BlockAnalyzer;
import advancedChemistry.common.commonData.ChemStuff;
import advancedChemistry.common.commonData.ChemTab;
import advancedChemistry.common.commonData.CommonProxy;
import advancedChemistry.common.commonData.CompoundsRegistry;
import advancedChemistry.common.commonData.ConfigData;
import advancedChemistry.common.commonData.DamageChemical;
import advancedChemistry.common.commonData.DataStorage;
import advancedChemistry.common.commonData.GuiHandler;
import advancedChemistry.common.commonData.RecipesData;
import advancedChemistry.common.items.AcidBottle;
import advancedChemistry.common.items.CapsuleChemical;
import advancedChemistry.common.items.CapsuleEmpty;
import advancedChemistry.common.items.ChemicalBottle;
import advancedChemistry.common.items.ChemicalContainer;
import advancedChemistry.common.items.DustContaminated;
import advancedChemistry.common.items.DustMetalClean;
import advancedChemistry.common.items.EmptyContainer;
import advancedChemistry.common.items.EmptyReinforcedContainer;
import advancedChemistry.common.items.MetalIngot;
import advancedChemistry.common.items.ReinforcedChemicalContainer;
import advancedChemistry.common.tileentity.TileAnalyzer;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "advancedChemistryPumpkin", name = "Advanced Chemistry", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class AdvancedChemistry {

	@Instance("AdvancedChemistry")
	public static AdvancedChemistry instance;
	
	@SidedProxy(clientSide = "advancedChemistry.common.commonData.ClientProxy", serverSide = "advancedChemistry.common.commonData.CommonProxy")
	public static CommonProxy proxy;

	public static final CreativeTabs ChemTab = new ChemTab();
	public static final CreativeTabs ChemStuff = new ChemStuff();

	public static final DamageSource DrinkPoison = new DamageChemical(
			"chemicalpoison", null, 1);

	public static Item bottledChemical;
	public static Item EmptyContainer;
	public static Item EmptyReinforcedContainer;
	public static Item containerChemical;
	public static Item reinforcedContainerChemical;
	public static Item capsuleChemical;
	public static Item EmptyCapsule;
	public static Item Ingot;
	public static Item Acid;
	public static Item Dust;
	public static Item DustC;
	
	public static Block Analyzer;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		ConfigData.loadConf(event);
		DataStorage.initAllElements();
		CompoundsRegistry.registerAcidicGroups();
		CompoundsRegistry.registerAcids();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		bottledChemical = new ChemicalBottle(ConfigData.BOTTLED_CHEMICAL_ID, 0);
		EmptyContainer = new EmptyContainer(ConfigData.CONTAINER_ID);
		EmptyReinforcedContainer = new EmptyReinforcedContainer(
				ConfigData.REINFORCED_CONTAINER_ID);
		containerChemical = new ChemicalContainer(
				ConfigData.CONTAINERED_CHEMICAL_ID, 0);
		reinforcedContainerChemical = new ReinforcedChemicalContainer(
				ConfigData.REINFORCED_CHEMICAL_ID, 0);
		capsuleChemical = new CapsuleChemical(ConfigData.CAPSULE_CHEMICAL_ID, 0);
		EmptyCapsule = new CapsuleEmpty(ConfigData.CAPSULE_ID);
		Ingot = new MetalIngot(ConfigData.INGOTS_ID, 0);
		Acid = new AcidBottle(ConfigData.ACID_ID, 0);
		Dust = new DustContaminated(ConfigData.DUST_ID, 0);
		DustC = new DustMetalClean(ConfigData.DUSTC_ID, 0);
		
		
		Analyzer = new BlockAnalyzer(ConfigData.ANALYZER);
		GameRegistry.registerBlock(Analyzer, "chemical_analyzer");
		LanguageRegistry.addName(Analyzer, "Analyzer");
		
		
		
		

		for (int i = 1; i <= DataStorage.CurrentChemicals; i++) {
			LanguageRegistry.addName(new ItemStack(Ingot, 1, i),
					DataStorage.getIngotString(i));
			LanguageRegistry.addName(new ItemStack(reinforcedContainerChemical,
					1, i), DataStorage.getReinforcedString(i));
			LanguageRegistry.addName(new ItemStack(bottledChemical, 1, i),
					DataStorage.getBottleString(i));
			LanguageRegistry.addName(new ItemStack(containerChemical, 1, i),
					DataStorage.getContainerString(i));
			LanguageRegistry.addName(new ItemStack(capsuleChemical, 1, i),
					DataStorage.getCapsuleString(i));
			LanguageRegistry.addName(new ItemStack(Dust, 1, i),
					DataStorage.getDustString(i));
			LanguageRegistry.addName(new ItemStack(DustC, 1, i),
					DataStorage.getDustCString(i));

		}
		
		for (int i = 1; i < CompoundsRegistry.AcidicGroups; i++) {
			LanguageRegistry.addName(new ItemStack(Acid, 1, i),
					CompoundsRegistry.acid[i].getName());
		}
		
		LanguageRegistry.addName(EmptyCapsule, "Empty Capsule");
		LanguageRegistry.addName(EmptyReinforcedContainer,
				"Empty Reinforced Container");
		LanguageRegistry.addName(EmptyContainer, "Empty Container");
		RecipesData.registerNormalRecipes();
		
		instance = this;

        GameRegistry.registerTileEntity(TileAnalyzer.class, "containerAnalyzer");
        NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
		
		proxy.registerRenderers();
	}

}
