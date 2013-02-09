package lotrWeaponsMod.common;

import lotrWeaponsMod.common.commonData.CommonProxy;
import lotrWeaponsMod.common.commonData.ConfigData;
import lotrWeaponsMod.common.commonData.GuiHandler;
import lotrWeaponsMod.common.entities.TileEntityDwarfFurnace;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Block;
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
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = "lotrWeapons", name = "LOTR Weapons", version = "V1.0", dependencies = "required-after:CollectibleGems@V1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class LotrWeapons {
	public static net.minecraft.block.Block DwarfFurnace;
	public static net.minecraft.block.Block AerialMaterial;
	public static net.minecraft.block.Block DwarfFurnaceCasing;
	public static net.minecraft.block.Block CondensedLightCrystal;
	public static net.minecraft.block.Block LightBlock;

	public static Item ElvenAlloy;
	public static Item AerialFuel;
	public static Item ElvenAlloyIngot;
	public static Item LightCrystalShard;
	public static Item CondensedLightBottle;
	public static Item CondensedLightChunk;
	public static Item CondensedCrystal;
	public static Item GlowingPhial;

	public static Item SwordSting;
	public static Item SwordGlamdring;
	public static Item SwordNarsil;
	public static Item MithrilChestplate;

	static EnumToolMaterial enumToolMaterialLight = EnumHelper.addToolMaterial(
			"lightCrystal", 2, 17852, 10F, 15, 20);
	static EnumToolMaterial enumToolMaterialElvenAlloy = EnumHelper
			.addToolMaterial("elvenAlloy", 3, 35704, 15F, 19, 25);

	@Instance("LotrWeapons")
	public static LotrWeapons instance;

	@SidedProxy(clientSide = "lotrWeaponsMod.common.commonData.ClientProxy", serverSide = "lotrWeaponsMod.common.commonData.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		ConfigData.loadConf(event);
	}

	@Init
	public void load(FMLInitializationEvent event) {
		ElvenAlloy = new lotrWeaponsMod.common.items.ElvenAlloy(
				ConfigData.ELVEN_ALLOY);
		ElvenAlloyIngot = new lotrWeaponsMod.common.items.ElvenAlloyIngot(
				ConfigData.ELVEN_ALLOY_INGOT);
		AerialFuel = new lotrWeaponsMod.common.items.AerialFuel(
				ConfigData.AERIAL_FUEL);
		LightCrystalShard = new lotrWeaponsMod.common.items.LightCrystalShard(
				ConfigData.CONDENSED_LIGHT_CRYSTAL_SHARD);
		CondensedLightChunk = new lotrWeaponsMod.common.items.CondensedLightChunk(
				ConfigData.CONDENSED_LIGHT_CHUNK);
		CondensedCrystal = new lotrWeaponsMod.common.items.CondensedCrystal(
				ConfigData.CONDENSED_CRYSTALIZED_LIGHT);
		CondensedLightBottle = new lotrWeaponsMod.common.items.CondensedLightBottle(
				ConfigData.CONDENSED_LIGHT_BOTTLE);
		GlowingPhial = new lotrWeaponsMod.common.tools.GlowingPhial(
				ConfigData.GLOWING_PHIAL);
		SwordSting = new lotrWeaponsMod.common.tools.SwordSting(
				ConfigData.SWORD_STING, enumToolMaterialLight);
		SwordGlamdring = new lotrWeaponsMod.common.tools.SwordGlamdring(
				ConfigData.SWORD_GLAMDRING, enumToolMaterialElvenAlloy);
		SwordNarsil = new lotrWeaponsMod.common.tools.SwordNarsil(
				ConfigData.SWORD_NARSIL, enumToolMaterialElvenAlloy);

		DwarfFurnace = new lotrWeaponsMod.common.blocks.DwarfFurnaceBlock(
				ConfigData.DWARF_FURNACE, false).setHardness(20F)
				.setResistance(300F).setBlockName("dwarf_furnace");
		GameRegistry.registerBlock(DwarfFurnace);
		LanguageRegistry.addName(DwarfFurnace, "Dwarf Furnace");
		AerialMaterial = new lotrWeaponsMod.common.blocks.AerialMaterial(
				ConfigData.AERIAL_MATTER, 4, Material.glass).setHardness(1F)
				.setResistance(0.1F).setBlockName("aerial_material");
		GameRegistry.registerBlock(AerialMaterial);
		LanguageRegistry.addName(AerialMaterial, "Aerial Matter");
		DwarfFurnaceCasing = new lotrWeaponsMod.common.blocks.DwarfFurnaceCasingBlock(
				ConfigData.DWARF_FURNACE_CASING).setHardness(10F)
				.setResistance(10F).setBlockName("dwarf_furnace_casing");
		GameRegistry.registerBlock(DwarfFurnaceCasing);
		LanguageRegistry.addName(DwarfFurnaceCasing, "Dwarf Furnace Casing");
		CondensedLightCrystal = new lotrWeaponsMod.common.blocks.CondensedLightCrystal(
				ConfigData.CONDENSED_LIGHT_CRYSTAL).setHardness(1F)
				.setResistance(1F).setBlockName("condensed_light_block");
		GameRegistry.registerBlock(CondensedLightCrystal);
		LanguageRegistry.addName(CondensedLightCrystal, "Light Crystal");
		LightBlock = new lotrWeaponsMod.common.blocks.LightBlock(
				ConfigData.LIGHT_BLOCK).setBlockName("light_block");
		GameRegistry.registerBlock(LightBlock);
		LanguageRegistry.addName(LightBlock, "Light Block");

		ItemStack goldst = new ItemStack(net.minecraft.item.Item.ingotGold, 1);
		ItemStack compressedsap = new ItemStack(
				modGems.common.CollectibleGems.CompressedSapphire, 1);
		ItemStack diamondst = new ItemStack(net.minecraft.item.Item.diamond, 1);
		ItemStack ametrinest = new ItemStack(
				modGems.common.CollectibleGems.AmetrineGem, 1);
		LanguageRegistry.addName(ElvenAlloy, "Elven Alloy");
		LanguageRegistry.addName(AerialFuel, "Aerial Fuel");
		LanguageRegistry.addName(ElvenAlloyIngot, "Elven Alloy Ingot");
		LanguageRegistry.addName(LightCrystalShard,
				"Condensed Light Crystal Shard");
		LanguageRegistry.addName(CondensedLightChunk, "Condensed Light Chunk");
		LanguageRegistry.addName(CondensedCrystal, "Condensed Light Crystal");
		LanguageRegistry
				.addName(CondensedLightBottle, "Condensed Light Bottle");
		LanguageRegistry.addName(GlowingPhial, "Glowing Phial");
		LanguageRegistry.addName(SwordSting, "Sting");
		LanguageRegistry.addName(SwordGlamdring, "Glamdring");
		LanguageRegistry.addName(SwordNarsil, "Narsil");

		// GameRegistry.addRecipe(new ItemStack(ElvenAlloy, 1), "xyx", "jkj",
		// "xyx", 'x', new ItemStack(net.minecraft.item.Item.ingotGold, 1), 'j',
		// new ItemStack(net.minecraft.item.Item.diamond, 1), 'y', new
		// ItemStack(modGems.common.gems.CompressedSapphire, 1), 'k', new
		// ItemStack(modGems.common.gems.AmetrineGem, 1));
		GameRegistry.addRecipe(new ItemStack(ElvenAlloy, 2), "xyx", "jkj",
				"xyx", 'x', goldst, 'y', compressedsap, 'j', diamondst, 'k',
				ametrinest);
		GameRegistry.addRecipe(new ItemStack(CondensedLightChunk, 1), "xxx",
				"xxx", "xxx", 'x', new ItemStack(LightCrystalShard, 1));
		MinecraftForge.setBlockHarvestLevel(AerialMaterial, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(DwarfFurnace, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(DwarfFurnaceCasing, "pickaxe", 2);
		MinecraftForge
				.setBlockHarvestLevel(CondensedLightCrystal, "pickaxe", 1);
		GameRegistry.addRecipe(new ItemStack(GlowingPhial, 1), "xxx", "xyx",
				"xxx", 'x', new ItemStack(net.minecraft.block.Block.glass),
				'y', new ItemStack(CondensedLightBottle, 1));
		GameRegistry
				.registerWorldGenerator(new lotrWeaponsMod.common.commonData.Generators());
		GameRegistry.addRecipe(new ItemStack(DwarfFurnaceCasing), "xxx", "yyy",
				"zzz", 'x', new ItemStack(net.minecraft.item.Item.brick), 'y',
				new ItemStack(net.minecraft.block.Block.fenceIron), 'z',
				new ItemStack(net.minecraft.block.Block.blockSteel));
		GameRegistry.addShapelessRecipe(new ItemStack(CondensedLightBottle, 1),
				new ItemStack(net.minecraft.item.Item.glassBottle),
				new ItemStack(CondensedCrystal));
		GameRegistry.addRecipe(new ItemStack(SwordSting), "x", "x", "y", 'x',
				new ItemStack(ElvenAlloyIngot), 'y',
				new ItemStack(GlowingPhial));
		GameRegistry.addRecipe(new ItemStack(SwordGlamdring), " x ", " x ",
				"zyz", 'x', new ItemStack(ElvenAlloyIngot), 'y', new ItemStack(
						net.minecraft.item.Item.diamond), 'z', new ItemStack(
						modGems.common.CollectibleGems.AmetrineGem));
		instance = this;
		GameRegistry.registerTileEntity(TileEntityDwarfFurnace.class,
				"dwarfFurnace");
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());

		proxy.registerRenderers();
	}
}