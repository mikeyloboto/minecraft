package advancedChemistry.common.commonData;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	public static String BLOCKS_PNG = "/advancedChemistry/common/artwork/blocks.png";
	public static String ITEMS_PNG = "/advancedChemistry/common/artwork/items.png";
	public static String ANALGUI_PNG = "/advancedChemistry/common/artwork/gui/analyzer.png";

	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
		MinecraftForgeClient.preloadTexture(ANALGUI_PNG);
	}

}