package lotrWeaponsMod.common.tools;

import lotrWeaponsMod.common.commonData.ClientProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SwordNarsil extends ItemSword {

	public SwordNarsil(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setIconIndex(3);
		setMaxStackSize(1);
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabTools);
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
}
