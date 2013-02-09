package advancedChemistry.common.commonData;

import advancedChemistry.common.container.ContainerAnalyzer;
import advancedChemistry.common.gui.GuiAnalyzer;
import advancedChemistry.common.tileentity.TileAnalyzer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	// returns an instance of the Container you made earlier
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileAnalyzer) {
			return new ContainerAnalyzer(player.inventory,
					(TileAnalyzer) tileEntity);
		}
		return null;
	}

	// returns an instance of the Gui you made earlier
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileAnalyzer) {
			return new GuiAnalyzer(player.inventory,
					(TileAnalyzer) tileEntity);
		}
		return null;

	}
}