package lotrWeaponsMod.common.commonData;

import java.util.Random;

import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.layer.GenLayer;
import cpw.mods.fml.common.IWorldGenerator;
import lotrWeaponsMod.common.LotrWeapons;
import net.minecraft.world.biome.BiomeGenBase;

public class Generators implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);

		switch (world.provider.dimensionId) {

		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: {
			generateOverworld(world, random, chunkX * 16, chunkZ * 16);
			{
				int ran = random.nextInt(ConfigData.CHUNKS_PER_CLOUD);
				if (ran == 0) {
					putCloud(random, chunkX * 16, chunkZ * 16, world,
							chunkGenerator, chunkProvider);
				}
			}
		}

		}
	}

	private void generateOverworld(World world, Random random, int blockX,
			int blockZ) {
		int rarity = random.nextInt(16);
		if (rarity == 0) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(30) + 60;
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(LotrWeapons.CondensedLightCrystal.blockID, 3))
					.generate(world, random, Xcoord, Ycoord, Zcoord);
		}

	}

	private void compass(Random random, int i, int z, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		world.setBlock(i, 72, z,
				lotrWeaponsMod.common.LotrWeapons.AerialMaterial.blockID);
	}

	public void putCloud(Random random, int i, int z, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int Xcoord = i + random.nextInt(16);
		int Ycoord = random.nextInt(80) + 130;
		int Zcoord = z + random.nextInt(16);
		int modifierx = random.nextInt(10) + 2;
		int modifiery = random.nextInt(2) + 2;
		int modifierz = random.nextInt(10) + 2;
		for (int j = 0; j <= modifierx; j++) {
			for (int y = 0; y <= modifiery; y++) {
				for (int k = 0; k <= modifierz; k++) {
					world.setBlock(
							Xcoord + j,
							Ycoord + y,
							Zcoord + k,
							lotrWeaponsMod.common.LotrWeapons.AerialMaterial.blockID);
				}
			}
		}

	}

	public void generateNether(World world, Random random, int blockX,
			int blockZ) {

	}

}