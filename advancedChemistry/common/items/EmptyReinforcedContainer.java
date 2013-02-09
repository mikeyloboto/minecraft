package advancedChemistry.common.items;

import advancedChemistry.common.AdvancedChemistry;
import advancedChemistry.common.commonData.ClientProxy;
import net.minecraft.item.Item;

public class EmptyReinforcedContainer extends Item {

	public EmptyReinforcedContainer(int par1) {
		super(par1);
		this.setIconIndex(4);
		this.setCreativeTab(AdvancedChemistry.ChemStuff);
		this.setItemName("empty_reinforced_container");
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

}
