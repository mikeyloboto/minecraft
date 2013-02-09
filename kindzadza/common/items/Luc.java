package kindzadza.common.items;

import kindzadza.common.commonData.ClientProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Luc extends ItemFood {

	public Luc(int par1) {
		super(par1, 1, 1F, false);
		// TODO Auto-generated constructor stub
		this.setIconIndex(11);
		this.setAlwaysEdible();
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
		this.setMaxStackSize(8);
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
	
	
	@Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

	@Override
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		--par1ItemStack.stackSize;
		par3EntityPlayer.getFoodStats().addStats(this);
		//par2World.playSoundAtEntity(par3EntityPlayer, "random.drink", 0.5F,
		//		par2World.rand.nextFloat() * 0.1F + 0.9F);
		this.func_77849_c(par1ItemStack, par2World, par3EntityPlayer);
		return par1ItemStack;
	}

}
