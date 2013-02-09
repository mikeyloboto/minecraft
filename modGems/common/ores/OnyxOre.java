package modGems.common.ores;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class OnyxOre extends BlockOre {
	public OnyxOre(int id, int texture) {
		super(id, texture);
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;
	}

	public int idDropped(int par1, Random random, int par2) {
		Random par3 = new Random();
		int choice = random.nextInt(16);
		int fin = 0;
		switch (choice) {
		case 3:
			fin = modGems.common.CollectibleGems.Sardonyx.shiftedIndex;
			break;
		default:
			fin = modGems.common.CollectibleGems.OnyxGem.shiftedIndex;
			break;
		}
		return modGems.common.CollectibleGems.OnyxGem.shiftedIndex;
	}
}
