package advancedChemistry.common.items;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.commonData.ClientProxy;
import net.minecraft.item.Item;

public class CapsuleEmpty extends Item {

	public CapsuleEmpty(int par1) {
		super(par1);
		this.setIconIndex(6);
		this.setCreativeTab(AdvancedChemistry.ChemStuff);
		this.setItemName("empty_chemical_capsule");
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

}
