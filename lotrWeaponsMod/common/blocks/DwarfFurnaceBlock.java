package lotrWeaponsMod.common.blocks;

import java.util.Random;

import lotrWeaponsMod.common.LotrWeapons;
import lotrWeaponsMod.common.commonData.ClientProxy;
import lotrWeaponsMod.common.entities.TileEntityDwarfFurnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.src.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pumpkinMods.common.pumpkinModsBase;

public class DwarfFurnaceBlock extends BlockContainer {
	private Random furnaceRand = new Random();
	private final boolean isActive;
	private static boolean keepFurnaceInventory = false;

	public DwarfFurnaceBlock(int par1, boolean par3) {
		super(par1, Material.rock);
		this.isActive = par3;
		// this.blockIndexInTexture = par2;
		this.setCreativeTab(pumpkinModsBase.pumpkinTabBlocks);
		this.setStepSound(Block.soundMetalFootstep);
		this.setLightValue(1.0F);
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return LotrWeapons.DwarfFurnaceCasing.blockID;
	}

	public void onBlockAdded(World par1World, int par2, int par3, int par4) {
		super.onBlockAdded(par1World, par2, par3, par4);
	}

	@Override
	public int getBlockTextureFromSide(int inp) {
		switch (inp) {
		default:
			return 0;
		case 1:
			return 1;
		case 0:
			return 2;
		}
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.LOTRBLOCKS_PNG;

	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World par1World, int par2, int par3,
			int par4, Random par5Random) {

	}

	public boolean onBlockActivated(World par1World, int x, int y, int z,
			EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
			float par9) {
		if (par1World.isRemote) {
			return true;
		} else {
			TileEntityDwarfFurnace blockEntity = (TileEntityDwarfFurnace) par1World
					.getBlockTileEntity(x, y, z);

			if (blockEntity != null) {
				if (blockEntity instanceof TileEntityDwarfFurnace) {
					TileEntityDwarfFurnace var6 = (TileEntityDwarfFurnace) par1World
							.getBlockTileEntity(x, y, z);
					par5EntityPlayer.openGui(LotrWeapons.instance, 1,
							par1World, x, y, z);
				}

			}
			return true;
		}
	}

	public static void updateFurnaceBlockState(boolean par0, World par1World,
			int par2, int par3, int par4) {

	}

	public TileEntity createNewTileEntity(World par1World) {
		return new TileEntityDwarfFurnace();
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4,
			EntityLiving par5EntityLiving) {

	}

	public void breakBlock(World par1World, int par2, int par3, int par4,
			int par5, int par6) {
		if (!keepFurnaceInventory) {
			TileEntityDwarfFurnace var7 = (TileEntityDwarfFurnace) par1World
					.getBlockTileEntity(par2, par3, par4);

			if (var7 != null) {
				for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8) {
					ItemStack var9 = var7.getStackInSlot(var8);

					if (var9 != null) {
						float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
						float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
						float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;

						while (var9.stackSize > 0) {
							int var13 = this.furnaceRand.nextInt(21) + 10;

							if (var13 > var9.stackSize) {
								var13 = var9.stackSize;
							}

							var9.stackSize -= var13;
							EntityItem var14 = new EntityItem(par1World,
									(double) ((float) par2 + var10),
									(double) ((float) par3 + var11),
									(double) ((float) par4 + var12),
									new ItemStack(var9.itemID, var13,
											var9.getItemDamage()));

							if (var9.hasTagCompound()) {

								var14.func_92014_d().setTagCompound(
										(NBTTagCompound) var9.getTagCompound()
												.copy());
							}

							float var15 = 0.05F;
							var14.motionX = (double) ((float) this.furnaceRand
									.nextGaussian() * var15);
							var14.motionY = (double) ((float) this.furnaceRand
									.nextGaussian() * var15 + 0.2F);
							var14.motionZ = (double) ((float) this.furnaceRand
									.nextGaussian() * var15);
							par1World.spawnEntityInWorld(var14);
						}
					}
				}
			}
		}

		super.breakBlock(par1World, par2, par3, par4, par5, par6);
	}

}