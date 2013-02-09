package lotrWeaponsMod.common.tools;

import java.util.List;

import lotrWeaponsMod.common.commonData.ClientProxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumStatus;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SwordSting extends ItemSword {
	public boolean isZombieNearby;
	public int currentTexture = 0;

	public SwordSting(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		maxStackSize = 1;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
		setIconIndex(currentTexture);
		setItemName("sting_sword");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	public String getTextureFile() {
		return ClientProxy.LOTRTOOLS_PNG;
	}

	@Override
	public boolean isRepairable() {
		return false;
	}

	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World,
			Entity par3Entity, int par4, boolean par5) {
		if (par3Entity instanceof EntityPlayer) {
			EntityPlayer var7 = (EntityPlayer) par3Entity;
			if (par5) {
				isZombieNearby = scanForZombie(par2World, var7);
			}
		}
		if (isZombieNearby == true) {
			if (currentTexture == 0) {
				this.currentTexture = 1;
			}
			// System.out.println("true");
		} else {
			if (currentTexture == 1) {
				this.currentTexture = 0;
			}

		}

	}

	public boolean scanForZombie(World world, EntityPlayer entity) {
		int eX = (int) entity.posX;
		int eY = (int) entity.posY;
		int eZ = (int) entity.posZ;
		// EnumStatus var20 = entity.sleepInBedAt(eX, eY, eZ);
		// if (var20==EnumStatus.NOT_SAFE){
		// return true;
		// }
		// else return false;
		double var4 = 8.0D;
		double var6 = 5.0D;
		List var8 = world.getEntitiesWithinAABB(
				EntityMob.class,
				AxisAlignedBB.getAABBPool().addOrModifyAABBInPool(
						(double) eX - var4, (double) eY - var6,
						(double) eZ - var4, (double) eX + var4,
						(double) eY + var6, (double) eZ + var4));

		if (!var8.isEmpty()) {
			return true;
		} else
			return false;

	}
}
