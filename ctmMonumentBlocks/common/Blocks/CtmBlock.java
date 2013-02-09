package ctmMonumentBlocks.common.Blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ctmMonumentBlocks.common.CtmMonumentBlocks;
import ctmMonumentBlocks.common.commonData.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CtmBlock extends Block {
	public CtmBlock(int par1) {
		super(par1, Material.iron);
		this.setBlockName("ctmBlock");
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public int getBlockTextureFromSide/*AndMetadata*/(int i/*, int j*/) {
		return 0;
	}
	
	@Override
	public String getTextureFile()
	{
		return ClientProxy.CTM_BLOCKS_PNG;
	}

	public int damageDropped(int i) {
		return 0;
	}

	//@SideOnly(Side.CLIENT)
	//public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs,
	//		List par3List) {
	//	for (int var4 = 0; var4 < 16; var4++) {
	//		par3List.add(new ItemStack(par1, 1, var4));
	//	}
	//}

}
