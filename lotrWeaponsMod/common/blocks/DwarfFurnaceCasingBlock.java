package lotrWeaponsMod.common.blocks;

import lotrWeaponsMod.common.LotrWeapons;
import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderLightningBolt;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;

public class DwarfFurnaceCasingBlock extends Block {

	public DwarfFurnaceCasingBlock(int par1) {
		super(par1, Material.iron);

		this.setStepSound(Block.soundMetalFootstep);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public int getBlockTextureFromSide(int inp) {
		switch (inp) {
		default:
			return 5;
		case 1:
			return 6;
		case 0:
			return 7;
		}
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.LOTRBLOCKS_PNG;

	}

	public void onBlockAdded(World par1World, int i, int j, int k) {
		super.onBlockAdded(par1World, i, j, k);
		boolean var1 = par1World.getBlockId(i + 1, j - 1, k) == Block.blockDiamond.blockID
				&& par1World.getBlockId(i - 1, j - 1, k) == Block.blockDiamond.blockID
				&& par1World.getBlockId(i, j - 1, k + 1) == Block.blockDiamond.blockID
				&& par1World.getBlockId(i, j - 1, k - 1) == Block.blockDiamond.blockID;
		boolean var2 = par1World.getBlockId(i + 1, j - 1, k + 1) == modGems.common.CollectibleGems.AmethystBlock.blockID
				&& par1World.getBlockId(i + 1, j - 1, k - 1) == modGems.common.CollectibleGems.AmethystBlock.blockID
				&& par1World.getBlockId(i - 1, j - 1, k + 1) == modGems.common.CollectibleGems.AmethystBlock.blockID
				&& par1World.getBlockId(i - 1, j - 1, k - 1) == modGems.common.CollectibleGems.AmethystBlock.blockID;
		boolean var3 = par1World.getBlockId(i, j - 1, k) == modGems.common.CollectibleGems.SapphireBlock.blockID;

		if (var1 && var2 && var3) {

			if (!par1World.isRemote) {
				EntityLightningBolt lightning = new EntityLightningBolt(
						par1World, i, j + 1, k);
				par1World.spawnEntityInWorld(lightning);
				par1World.setBlock(i, j, k, LotrWeapons.DwarfFurnace.blockID);

			}
		}
	}
}
