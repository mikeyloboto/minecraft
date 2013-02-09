package advancedChemistry.common.items;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.commonData.ClientProxy;
import net.minecraft.item.Item;

public class EmptyContainer extends Item {

	public EmptyContainer(int par1) {
		super(par1);
		this.setIconIndex(2);
		this.setCreativeTab(AdvancedChemistry.ChemStuff);
		this.setItemName("empty_chemical_container");
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

}
