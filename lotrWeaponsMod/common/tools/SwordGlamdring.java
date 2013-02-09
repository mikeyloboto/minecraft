package lotrWeaponsMod.common.tools;

import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SwordGlamdring extends ItemSword {

	public SwordGlamdring(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		maxStackSize = 1;
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
		setIconIndex(2);
		setItemName("glamdring_sword");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isRepairable() {
		return false;
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	public String getTextureFile() {
		return ClientProxy.LOTRTOOLS_PNG;
	}
}
