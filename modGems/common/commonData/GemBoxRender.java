package modGems.common.commonData;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class GemBoxRender implements IItemRenderer {

	private GemBoxModel model;

	public GemBoxRender() {

		model = new GemBoxModel(1 / 16F);
		// 1 / 16F
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {

		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {

		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		switch (type) {
		case ENTITY: {
			render(-0.5F, 0F, -0.5F);
			break;
		}
		case EQUIPPED: {
			render(0F, 0.4F, 0F);
			break;
		}
		case INVENTORY: {
			render(1F, 0.65F, 1F);
			break;
		}
		default:
			break;
		}

	}

	private void render(float x, float y, float z) {

		Tessellator tesselator = Tessellator.instance;
		ForgeHooksClient.bindTexture(ClientProxy.GEMBOX_PNG, 0);
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, z);
		model.render(0.0625F);
		GL11.glPopMatrix();
	}

}