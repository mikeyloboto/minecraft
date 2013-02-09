package modGems.common.ores;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class BerylStone extends BlockOre {
	public BerylStone(int id, int texture) {
		super(id, texture);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
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
		case 0:
			fin = net.minecraft.item.Item.emerald.shiftedIndex;
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			fin = modGems.common.CollectibleGems.RedBerylGem.shiftedIndex;
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			fin = modGems.common.CollectibleGems.AquamarineGem.shiftedIndex;
			break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			fin = modGems.common.CollectibleGems.HeliodorGem.shiftedIndex;
			break;

		}
		return fin;

	}
}
