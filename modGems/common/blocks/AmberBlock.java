package modGems.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class AmberBlock extends Block {

	public AmberBlock(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);

		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public int getBlockTextureFromSide(int inp) {
		return 13;
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;

	}
}
