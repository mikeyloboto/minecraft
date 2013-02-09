package modGems.common.ores;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class SapphireOre extends BlockOre {
	public SapphireOre(int id, int texture) {
		super(id, texture);
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;
	}

	public int idDropped(int par1, Random random, int par2) {
		return modGems.common.CollectibleGems.SapphireGem.shiftedIndex;
	}
}
