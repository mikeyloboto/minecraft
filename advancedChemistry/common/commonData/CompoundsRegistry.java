package advancedChemistry.common.commonData;

import advancedChemistry.common.compounds.Acid;
import advancedChemistry.common.compounds.AcidGroup;

public class CompoundsRegistry {
	public final static int AcidicGroups = 11;
	public static AcidGroup acGroup[] = new AcidGroup[AcidicGroups];
	public static Acid acid[] = new Acid[AcidicGroups];

	public static void registerAcidicGroups() {
		acGroup[0] = new AcidGroup(9, 1, 0, 1, "Fluoride");
		acGroup[1] = new AcidGroup(17, 1, 0, 1, "Chloride");
		acGroup[2] = new AcidGroup(35, 1, 0, 1, "Bromide");
		acGroup[3] = new AcidGroup(53, 1, 0, 1, "Iodide");
		acGroup[4] = new AcidGroup(16, 1, 0, 2, "Sulfide");
		acGroup[5] = new AcidGroup(7, 1, 3, 1, "Nitrate");
		acGroup[6] = new AcidGroup(16, 1, 3, 2, "Sulfite");
		acGroup[7] = new AcidGroup(16, 1, 4, 2, "Sulfate");
		acGroup[8] = new AcidGroup(6, 1, 3, 2, "Carbonate");
		acGroup[9] = new AcidGroup(14, 1, 3, 2, "Silicate");
		acGroup[10] = new AcidGroup(15, 1, 4, 3, "Phosphate");
		
		System.out.println("Advanced Chemistry - Acidic Groups Registered");
	}

	public static void registerAcids() {
		acid[0] = new Acid(acGroup[0], "Hydrofluoric");
		acid[1] = new Acid(acGroup[1], "Hydrochloric");
		acid[2] = new Acid(acGroup[2], "Hydrobromic");
		acid[3] = new Acid(acGroup[3], "Hydroiodic");
		acid[4] = new Acid(acGroup[4], "Hydrosulfuric");
		acid[5] = new Acid(acGroup[5], "Nitric");
		acid[6] = new Acid(acGroup[6], "Sulfurous");
		acid[7] = new Acid(acGroup[7], "Sulfiric");
		acid[8] = new Acid(acGroup[8], "Carbonic");
		acid[9] = new Acid(acGroup[9], "Silicic");
		acid[10] = new Acid(acGroup[10], "Phosphoric");

		System.out.println("Advanced Chemistry - Acids Registered");

	}

}
