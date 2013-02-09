package modGems.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class BlockOnyxBlock extends Block {

	public BlockOnyxBlock(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
		// TODO Auto-generated constructor stub

		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public int getBlockTextureFromSide(int inp) {
		return 14;
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;

	}
}
