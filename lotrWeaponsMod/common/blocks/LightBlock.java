package lotrWeaponsMod.common.blocks;

import java.util.Random;

import lotrWeaponsMod.common.LotrWeapons;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class LightBlock extends Block {
	public LightBlock(int blockId) {
		super(blockId, Material.air);
		this.setLightValue(1.0f);
		this.setHardness(0.1f);
		this.setBlockBounds(0f, 0f, 0f, 0f, 0f, 0f);
		this.setTickRandomly(true);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World,
			int par2, int par3, int par4) {
		return null;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void updateTick(World w, int x, int y, int z, Random r) {
		if (w.getBlockId(x, y, z) == LotrWeapons.LightBlock.blockID) {
			w.setBlockWithNotify(x, y, z, 0);
		}
	}

	@Override
	public boolean isAirBlock(World w, int x, int y, int z) {
		if (w.getBlockId(x, y, z) == this.blockID) {
			return true;
		}

		return false;
	}
}
