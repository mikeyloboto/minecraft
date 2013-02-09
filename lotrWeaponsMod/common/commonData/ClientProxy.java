package lotrWeaponsMod.common.commonData;

import net.minecraftforge.client.MinecraftForgeClient;
import lotrWeaponsMod.common.commonData.CommonProxy;

public class ClientProxy extends CommonProxy {

	public static String LOTRITEMS_PNG = "/lotrWeaponsMod/common/artwork/items.png";
	public static String LOTRBLOCKS_PNG = "/lotrWeaponsMod/common/artwork/blocks.png";
	public static String LOTRDFGUI_PNG = "/lotrWeaponsMod/common/artwork/gui/dwarf_furnace.png";
	public static String LOTRTOOLS_PNG = "/lotrWeaponsMod/common/artwork/tools.png";

	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(LOTRITEMS_PNG);
		MinecraftForgeClient.preloadTexture(LOTRBLOCKS_PNG);
		MinecraftForgeClient.preloadTexture(LOTRDFGUI_PNG);
		MinecraftForgeClient.preloadTexture(LOTRTOOLS_PNG);

	}
}