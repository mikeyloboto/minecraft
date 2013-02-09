package lotrWeaponsMod.common.commonData;

import lotrWeaponsMod.common.blocks.ContainerDwarfFurnace;
import lotrWeaponsMod.common.entities.TileEntityDwarfFurnace;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.src.*;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiDwarfFurnace extends GuiContainer {

	private TileEntityDwarfFurnace dwarfFurnaceInventory;

	public GuiDwarfFurnace(InventoryPlayer inventoryplayer,
			TileEntityDwarfFurnace tileentitydwarffurnace) {
		super(
				new ContainerDwarfFurnace(inventoryplayer,
						tileentitydwarffurnace));
		dwarfFurnaceInventory = tileentitydwarffurnace;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int param1, int param2) {
		// draw text and stuff here
		// the parameters for drawString are: string, x, y, color
		fontRenderer.drawString("Dwarf Furnace", 8, 6, 4210752);
		// draws "Inventory" or your regional equivalent
		fontRenderer.drawString(
				StatCollector.translateToLocal("container.inventory"), 8,
				ySize - 96 + 2, 4210752);
	}

	// @Override
	// protected void drawGuiContainerBackgroundLayer(float par1, int par2,
	// int par3) {
	// //draw your Gui here, only thing you need to change is the path
	// int texture = mc.renderEngine.getTexture(ClientProxy.LOTRDFGUI_PNG);
	// GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	// this.mc.renderEngine.bindTexture(texture);
	// int x = (width - xSize) / 2;
	// int y = (height - ySize) / 2;
	// this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	// }
	protected void drawGuiContainerBackgroundLayer(float par1, int par2,
			int par3) {
		int var4 = this.mc.renderEngine.getTexture(ClientProxy.LOTRDFGUI_PNG);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(var4);
		int var5 = (this.width - this.xSize) / 2;
		int var6 = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
		int var7;

		if (this.dwarfFurnaceInventory.isBurning()) {
			var7 = this.dwarfFurnaceInventory.getBurnTimeRemainingScaled(12);
			this.drawTexturedModalRect(var5 + 56, var6 + 36 + 12 - var7, 176,
					12 - var7, 14, var7 + 2);
		}

		var7 = this.dwarfFurnaceInventory.getCookProgressScaled(24);
		this.drawTexturedModalRect(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
	}

}