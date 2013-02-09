package pumpkinMods.common;

import net.minecraftforge.client.MinecraftForgeClient;
import pumpkinMods.common.CommonProxy;

public class ClientProxy extends CommonProxy {

	public static String PUMPITEMS_PNG = "/pumpkinMods/common/artwork/items.png";
	public static String PUMPBLOCKS_PNG = "/pumpkinMods/common/artwork/blocks.png";
	public static String PUMPTAB_PNG = "/pumpkinMods/common/artwork/tab.png";
	public static String PUMPMIKE_PNG = "/pumpkinMods/common/artwork/pheads/Mikey_Loboto.png";
	public static String PUMPGIZR_PNG = "/pumpkinMods/common/artwork/pheads/gizr_padukovich.png";
	public static String PUMPCHIC_PNG = "/pumpkinMods/common/artwork/pheads/chickenleche.png";

	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(PUMPITEMS_PNG);
		MinecraftForgeClient.preloadTexture(PUMPBLOCKS_PNG);
		MinecraftForgeClient.preloadTexture(PUMPTAB_PNG);
		MinecraftForgeClient.preloadTexture(PUMPMIKE_PNG);
		MinecraftForgeClient.preloadTexture(PUMPGIZR_PNG);
		MinecraftForgeClient.preloadTexture(PUMPCHIC_PNG);
	}
}