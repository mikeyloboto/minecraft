package lotrWeaponsMod.common.tools;

import java.util.Random;

import lotrWeaponsMod.common.commonData.ClientProxy;
import lotrWeaponsMod.common.commonData.PhialGlowEffect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;

public class GlowingPhial extends Item {

	public GlowingPhial(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub

		// Constructor Configuration
		maxStackSize = 64;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
		setIconIndex(7);
		setItemName("glowing_phial");

	}

	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}

	public void onUpdate(ItemStack par1ItemStack, World par2World,
			Entity par3Entity, int par4, boolean par5) {

		if (par3Entity instanceof EntityPlayer) {
			EntityPlayer var7 = (EntityPlayer) par3Entity;
		}

		if (par5) {
			int vX = (int) par3Entity.motionX;
			int vY = (int) par3Entity.motionY;
			int vZ = (int) par3Entity.motionZ;
			int plX = (int) par3Entity.posX;
			int plY = (int) par3Entity.posY;
			int plZ = (int) par3Entity.posZ;

			// if (vX!=0 || vY!=0 || vZ!=0){
			PhialGlowEffect.glowPlace(plX, plY, plZ, par2World);
			// }

		}

	}
}
