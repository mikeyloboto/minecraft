package lotrWeaponsMod.common.commonData;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import lotrWeaponsMod.common.blocks.ContainerDwarfFurnace;
import lotrWeaponsMod.common.entities.TileEntityDwarfFurnace;

public class GuiHandler implements IGuiHandler {
	// returns an instance of the Container you made earlier
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityDwarfFurnace) {
			return new ContainerDwarfFurnace(player.inventory,
					(TileEntityDwarfFurnace) tileEntity);
		}
		return null;
	}

	// returns an instance of the Gui you made earlier
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityDwarfFurnace) {
			return new GuiDwarfFurnace(player.inventory,
					(TileEntityDwarfFurnace) tileEntity);
		}
		return null;

	}
}