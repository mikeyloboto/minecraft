package advancedChemistry.common.compounds;

import advancedChemistry.common.commonData.DataStorage;

public class Acid {
	public AcidGroup acidGroup;
	public String name;
	public int hydrogen;

	public Acid(AcidGroup par1, String par2) {
		this.acidGroup = par1;
		this.hydrogen = par1.totalCharge;
		this.name = par2;
	}

	public String getName() {
		return this.name + " Acid";
	}

	public String getNameLower() {
		return this.name.toLowerCase() + " acid";
	}

	public String getFormula() {
		String ind1 = "";
		String ind2 = "";
		String ind3 = "";

		if (this.hydrogen != 1)
			ind1 += this.hydrogen;
		if ((this.acidGroup.OxygenIndex != 1)
				&& (this.acidGroup.OxygenIndex != 0))
			ind2 += this.acidGroup.OxygenIndex;
		if (this.acidGroup.elementIndex != 1)
			ind3 += this.acidGroup.elementIndex;

		switch (this.acidGroup.OxygenIndex) {
		case 0:
			return "H" + ind1 + this.acidGroup.element.Symbol + ind3;
		default:
			return "H" + ind1 + this.acidGroup.element.Symbol + ind3 + "O"
					+ ind2;
		}
	}
}
