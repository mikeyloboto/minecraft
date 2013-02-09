package lotrWeaponsMod.common.commonData;

import java.util.Random;

import lotrWeaponsMod.common.LotrWeapons;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PhialGlowEffect {
	public static int arrayPar1 = ConfigData.ARRAY_VAL;
	public static int[] pX = new int[arrayPar1];
	public static int[] pY = new int[arrayPar1];
	public static int[] pZ = new int[arrayPar1];

	public static void glowPlace(int x, int y, int z, World world) {
		int currentBlock = world.getBlockId(x, y, z);
		int controlBlock = LotrWeapons.LightBlock.blockID;

		{
			pX[arrayPar1 - 1] = x;
			pY[arrayPar1 - 1] = y;
			pZ[arrayPar1 - 1] = z;
		}

		if (world.getBlockId(pX[1], pY[1], pZ[1]) == controlBlock
				&& !(pX[1] == pX[arrayPar1 - 1] && pY[1] == pY[arrayPar1 - 1] && pZ[1] == pZ[arrayPar1 - 1]))

		// if (world.getBlockId(pX[1], pY[1], pZ[1]) == controlBlock &&
		// pX[1]==pX[arrayPar1-1] && pY[1]==pY[arrayPar1-1] &&
		// pZ[1]==pZ[arrayPar1-1])
		{
			world.setBlock(pX[1], pY[1], pZ[1], 0);
			// System.out.println("check");
		}
		if (currentBlock == 0) {
			world.setBlock(x, y, z, controlBlock);
			// world.setBlock(x, y, z,
			// net.minecraft.block.Block.obsidian.blockID);
		}

		for (int i = 1; i <= (arrayPar1 - 2); i++) {
			pX[i] = pX[i + 1];
			pY[i] = pY[i + 1];
			pZ[i] = pZ[i + 1];
		}

	}
}
