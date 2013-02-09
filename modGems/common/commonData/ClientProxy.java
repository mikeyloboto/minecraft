package modGems.common.commonData;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import modGems.common.CollectibleGems;
import modGems.common.commonData.CommonProxy;

;

public class ClientProxy extends CommonProxy {
	public static String ITEMS_PNG = "/modGems/common/artwork/items.png";
	public static String BLOCK_PNG = "/modGems/common/artwork/blocks.png";
	public static String GEMBOX_PNG = "/modGems/common/artwork/gembox.png";

	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(GEMBOX_PNG);

		CollectibleGems.renderId = RenderingRegistry.getNextAvailableRenderId();
		MinecraftForgeClient.registerItemRenderer(
				CollectibleGems.GemBoxBlock.blockID, new GemBoxRender());
	}
}