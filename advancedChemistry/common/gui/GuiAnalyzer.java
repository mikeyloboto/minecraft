package advancedChemistry.common.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.src.*;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import advancedChemistry.common.commonData.DataStorage;
import advancedChemistry.common.commonData.ClientProxy;
import advancedChemistry.common.container.ContainerAnalyzer;
import advancedChemistry.common.tileentity.TileAnalyzer;

public class GuiAnalyzer extends GuiContainer {

	public TileAnalyzer analyzerInventory;

	public GuiAnalyzer(InventoryPlayer inventoryplayer, TileAnalyzer tileanalyzer) {
		super(new ContainerAnalyzer(inventoryplayer, tileanalyzer));
		this.analyzerInventory = tileanalyzer;
	}

	protected void redrawNames(int el1, int el2, int el3, int el4) {
		int col1, col2, col3, col4;
		//System.out.println("Test - " + el1);
		if (DataStorage.element[el1].Metal==1) col1 = 10325243; else if (DataStorage.element[el1].Metal==2) col1 = 9568162; else  col1 = 16777215;
		if (DataStorage.element[el2].Metal==1) col2 = 10325243; else if (DataStorage.element[el2].Metal==2) col2 = 9568162; else  col2 = 16777215;
		if (DataStorage.element[el3].Metal==1) col3 = 10325243; else if (DataStorage.element[el3].Metal==2) col3 = 9568162; else  col3 = 16777215;
		if (DataStorage.element[el4].Metal==1) col4 = 10325243; else if (DataStorage.element[el4].Metal==2) col4 = 9568162; else  col4 = 16777215;
		fontRenderer.drawString(DataStorage.element[el1].NameCaps, 79, 15, col1);
		fontRenderer.drawString(DataStorage.element[el2].NameCaps, 79, 31, col2);
		fontRenderer.drawString(DataStorage.element[el3].NameCaps, 79, 47, col3);
		fontRenderer.drawString(DataStorage.element[el4].NameCaps, 79, 63, col4);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int param1, int param2) {
		fontRenderer.drawString("Analyzer", 8, 6, 4210752);
		System.out.println("Test - " + this.analyzerInventory.res.readiness); 
		//if (this.analyzerInventory.CanRedraw==true)
			redrawNames(this.analyzerInventory.res.res1, this.analyzerInventory.res.res2, this.analyzerInventory.res.res3, this.analyzerInventory.res.res4);
		//else
			//redrawNames(0, 0, 0, 0);
		fontRenderer.drawString(
				StatCollector.translateToLocal("container.inventory"), 8,
				ySize - 96 + 2, 4210752);
	}

	protected void drawGuiContainerBackgroundLayer(float par1, int par2,
			int par3) {
		int var4 = this.mc.renderEngine.getTexture(ClientProxy.ANALGUI_PNG);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(var4);
		int var5 = (this.width - this.xSize) / 2;
		int var6 = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
		int var7;

	}

}