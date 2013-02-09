package kindzadza.common.items;

import java.util.List;

import kindzadza.common.KinDzaDza;
import kindzadza.common.commonData.ClientProxy;
import kindzadza.common.commonData.ConfigData;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class Tranklukator extends ItemBow {

	public Tranklukator(int par1) {
		super(par1);
		this.setIconIndex(10);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
		this.setMaxDamage(50);
		this.setNoRepair();

	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
	

	@Override
	public void addInformation(ItemStack par1Stack, EntityPlayer par2Player,
			List par3List, boolean par4Bool) {
		int ammo = 50 - par1Stack.getItemDamage();
		par3List.add("Charges Left: " + ammo);
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		int meta = par1ItemStack.getItemDamage();
		if ((meta < 50) || (par3EntityPlayer.capabilities.isCreativeMode)) {
			ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer,
					par1ItemStack);
			MinecraftForge.EVENT_BUS.post(event);
			float var7 = 1.0F;
			EntityArrow var8 = new EntityArrow(par2World, par3EntityPlayer,
					var7 * 2.0F);
			var8.setIsCritical(true);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F,
					1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);
			var8.canBePickedUp = 2;
			if (!par2World.isRemote) {
				par2World.spawnEntityInWorld(var8);
			}
			par1ItemStack.damageItem(1, par3EntityPlayer);
		} else {
			if (par3EntityPlayer.inventory.hasItem(KinDzaDza.Luc.shiftedIndex)) {
				par3EntityPlayer.inventory
						.consumeInventoryItem(KinDzaDza.Luc.shiftedIndex);
				par1ItemStack.setItemDamage(0);
			}
		}
		return par1ItemStack;
	}
}
