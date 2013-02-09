package modGems.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import modGems.common.CollectibleGems;
import modGems.common.commonData.ClientProxy;
import modGems.common.entity.GemBoxTileEntity;

public class GemBoxBlock extends BlockContainer {

	public GemBoxBlock(int par1, int par2) {
		super(par1, par2, Material.iron);
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public TileEntity createNewTileEntity(World par1World) {
		return new GemBoxTileEntity();
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}

	public int getRenderType() {
		return CollectibleGems.renderId;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

}
