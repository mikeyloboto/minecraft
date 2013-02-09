package modGems.common.ores;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class AmethystOre extends BlockOre {
	public AmethystOre(int id, int texture) {
		super(id, texture);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;
	}

	public int idDropped(int par1, Random random, int par2) {
		return modGems.common.CollectibleGems.AmethystDust.shiftedIndex;
	}
}
