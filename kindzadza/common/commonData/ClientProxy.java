package kindzadza.common.commonData;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	public static String YPANTS_PNG = "/kindzadza/common/artwork/yellowpants.png";
	public static String MPANTS_PNG = "/kindzadza/common/artwork/magentapants.png";
	public static String CAK_PNG = "/kindzadza/common/artwork/cak.png";
	public static String ITEMS_PNG = "/kindzadza/common/artwork/items.png";
	public static String PPANTS_PNG = "/kindzadza/common/artwork/pacakpants.png";
	public static String ECILOP_1 = "/kindzadza/common/artwork/ecilop/ecilop_1.png";
	public static String ECILOP_2 = "/kindzadza/common/artwork/ecilop/ecilop_2.png";

	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(CAK_PNG);
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(YPANTS_PNG);
		MinecraftForgeClient.preloadTexture(MPANTS_PNG);
		MinecraftForgeClient.preloadTexture(PPANTS_PNG);
		MinecraftForgeClient.preloadTexture(ECILOP_1);
		MinecraftForgeClient.preloadTexture(ECILOP_2);

	}
}