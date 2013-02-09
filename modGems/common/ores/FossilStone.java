package modGems.common.ores;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class FossilStone extends BlockOre {
	public FossilStone(int id, int texture) {
		super(id, texture);
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;
	}

	public int idDropped(int par1, Random random, int par2) {
		int ret = 0;
		int ran = random.nextInt(10);
		switch (ran) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			ret = net.minecraft.item.Item.bone.shiftedIndex;
			break;
		case 5:
			ret = modGems.common.CollectibleGems.AmberGem.shiftedIndex;
			break;
		default:
			break;

		}

		return ret;
	}
}
