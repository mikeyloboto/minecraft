package ctmMonumentBlocks.common.commonData;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	public static String CTM_BLOCKS_PNG = "/ctmMonumentBlocks/common/artwork/blocks.png";

	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(CTM_BLOCKS_PNG);

	}

}
