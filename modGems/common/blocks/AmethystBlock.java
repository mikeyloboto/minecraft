package modGems.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class AmethystBlock extends Block {

	public AmethystBlock(int id, int texture, Material material) {
		super(id, texture, material);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);

	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;
	}
}
