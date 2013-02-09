package pumpkinMods.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class PumpkinHead extends EntityMob {
	public static String textureFile;

	public PumpkinHead(World par1World, int par1) {
		super(par1World);
		switch (par1) {
		case 0:
			textureFile = ClientProxy.PUMPMIKE_PNG;
			break;
		case 1:
			textureFile = ClientProxy.PUMPGIZR_PNG;
			break;
		case 2:
			textureFile = ClientProxy.PUMPCHIC_PNG;
		}
		this.texture = textureFile;
		this.moveSpeed = 0.25F;
	}

	public int getAttackStrength(Entity par1Entity) {
		return 4;
	}

	public int getMaxHealth() {
		return 20;
	}

	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}
}
