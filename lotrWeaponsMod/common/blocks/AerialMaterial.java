package lotrWeaponsMod.common.blocks;

import java.util.Random;

import lotrWeaponsMod.common.LotrWeapons;
import lotrWeaponsMod.common.commonData.ClientProxy;

import cpw.mods.fml.client.ITextureFX;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class AerialMaterial extends Block {

	public AerialMaterial(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);

		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
		this.setLightOpacity(0);
		this.setLightValue(1.0F);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 01.0F, 01.0F, 01.0F);
		this.setStepSound(Block.soundClothFootstep);
	}

	@Override
	public int getBlockTextureFromSide(int inp) {
		return 3;

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

	protected boolean canSilkHarvest() {
		return false;
	}

	public int idDropped(int par1, Random random, int par2) {
		Random par3 = new Random();
		int choice = random.nextInt(4);
		int fin = 0;
		if (choice == 0) {
			fin = LotrWeapons.AerialFuel.shiftedIndex;
		}
		return fin;
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.LOTRBLOCKS_PNG;

	}
}
