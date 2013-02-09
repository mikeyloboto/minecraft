package lotrWeaponsMod.common.blocks;

import java.util.Random;

import lotrWeaponsMod.common.LotrWeapons;
import lotrWeaponsMod.common.commonData.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class CondensedLightCrystal extends Block {

	public CondensedLightCrystal(int par1) {
		super(par1, Material.glass);

		this.setStepSound(Block.soundGlassFootstep);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
		this.setLightOpacity(0);
		this.setLightValue(1.0F);
	}

	@Override
	public int getBlockTextureFromSide(int inp) {
		return 4;
	}

	@Override
	public int idDropped(int par1, Random random, int par2) {
		return LotrWeapons.LightCrystalShard.shiftedIndex;
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.LOTRBLOCKS_PNG;

	}

	public boolean isOpaqueCube() {
		return false;
	}

	public int getRenderBlockPass() {
		return 1;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
}
