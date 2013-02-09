package advancedChemistry.common.compounds;

import advancedChemistry.common.commonData.DataStorage;
import advancedChemistry.common.commonData.SimpleElement;

public class AcidGroup {
	public boolean Oxygen;
	public int OxygenIndex;
	public int elementIndex;
	public int totalCharge;
	public SimpleElement element;
	public String name;
	public String lowerName;

	/*
	 * @param par1 Element periodic number
	 * 
	 * @param par2 Element index
	 * 
	 * @param par3 Oxygen index
	 * 
	 * @param par4 Charge
	 * 
	 * @param par5 Capitalized name
	 */

	public AcidGroup(int par1, int par2, int par3, int par4, String par5) {
		if (par3 == 0) {
			this.Oxygen = false;
		} else {
			this.Oxygen = true;
		}
		this.OxygenIndex = par3;
		this.element = DataStorage.element[par1];
		this.elementIndex = par2;
		this.totalCharge = par4;
		this.name = par5;
		this.lowerName = par5.toLowerCase();

	}
}
