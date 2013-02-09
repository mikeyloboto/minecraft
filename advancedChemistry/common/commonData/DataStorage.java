package advancedChemistry.common.commonData;

public class DataStorage {
	public static final int CurrentChemicals = 111;

	public static SimpleElement element[] = new SimpleElement[119];

	public static String getBottleString(int par1) {
		return element[par1].NameCaps + " Solution Bottle";
	}

	public static String getContainerString(int par1) {
		return element[par1].NameCaps + " Container";
	}

	public static String getReinforcedString(int par1) {
		return element[par1].NameCaps + " Reinforced Container";
	}

	public static String getCapsuleString(int par1) {
		return element[par1].NameCaps + " Capsule";
	}

	public static String getIngotString(int par1) {
		return element[par1].NameCaps + " Ingot";
	}
	public static String getDustString(int par1) {
		return "Contaminated " + element[par1].NameCaps + " Containing Dust";
	}
	public static String getDustCString(int par1) {
		return "Clean " + element[par1].NameCaps + " Dust";
	}

	public static void initAllElements() {
		element[0] = new SimpleElement("Nothing", "-", 0, 0, 0, 0);		
		element[1] = new SimpleElement("Hydrogen", "H", 1, 2, 4, 12451833);
		element[2] = new SimpleElement("Helium", "He", 2, 2, 4, 9764857);

		element[3] = new SimpleElement("Lithium", "Li", 3, 1, 6, 12969697, 1);
		element[4] = new SimpleElement("Berylium", "Be", 1, 1, 1, 5723991, 0);
		element[5] = new SimpleElement("Boron", "B", 5, 1, 1, 8869719, 0);
		element[6] = new SimpleElement("Carbon", "C", 6, 2, 1, 4802889);
		element[7] = new SimpleElement("Nitrogen", "N", 7, 2, 4, 12910591);
		element[8] = new SimpleElement("Oxygen", "O", 8, 2, 5, 12910591);
		element[9] = new SimpleElement("Fluorine", "F", 9, 2, 5, 16777187);
		element[10] = new SimpleElement("Neon", "Ne", 10, 2, 1, 16773075);

		element[11] = new SimpleElement("Sodium", "Na", 11, 1, 6, 13882323, 1);
		element[12] = new SimpleElement("Magnesium", "Mg", 12, 1, 1, 14937581, 0);
		element[13] = new SimpleElement("Aluminium", "Al", 13, 1, 1, 13360348, 1);
		element[14] = new SimpleElement("Silicon", "Si", 14, 1, 1, 14212316, 1);
		element[15] = new SimpleElement("Phosphorus", "P", 15, 2, 1, 12732231);
		element[16] = new SimpleElement("Sulfur", "S", 16, 2, 2, 16777091);
		element[17] = new SimpleElement("Chlorine", "Cl", 17, 2, 5, 13172611);
		element[18] = new SimpleElement("Argon", "Ar", 18, 2, 1, 10420214);

		element[19] = new SimpleElement("Potasium", "K", 19, 1, 6, 14015187);
		element[20] = new SimpleElement("Calcium", "Ca", 20, 1, 1, 4671815);
		element[21] = new SimpleElement("Scandium", "Sc", 21, 1, 1, 11711362, 1);
		element[22] = new SimpleElement("Titanium", "Ti", 22, 1, 1, 13557198, 1);
		element[23] = new SimpleElement("Vanadium", "V", 23, 1, 1, 13557150, 0);
		element[24] = new SimpleElement("Chromium", "Cr", 24, 1, 1, 13557247, 1);
		element[25] = new SimpleElement("Manganese", "Mn", 25, 1, 1, 10858939, 1);
		element[26] = new SimpleElement("Iron", "Fe", 26, 1, 1, 14211288, 1);
		element[27] = new SimpleElement("Cobalt", "Co", 27, 1, 1, 14013338, 0);
		element[28] = new SimpleElement("Nickel", "Ni", 28, 1, 1, 14013337, 0);
		element[29] = new SimpleElement("Copper", "Cu", 39, 1, 1, 16755779, 1);
		element[30] = new SimpleElement("Zink", "Zn", 30, 1, 1, 14797776, 1);
		element[31] = new SimpleElement("Galium", "Ga", 31, 1, 1, 14675442, 1);
		element[32] = new SimpleElement("Germanium", "Ge", 32, 1, 1, 14474460, 1);
		element[33] = new SimpleElement("Arsenic", "As", 33, 1, 7, 13421772, 1);
		element[34] = new SimpleElement("Selenium", "Se", 34, 2, 1, 6968918);
		element[35] = new SimpleElement("Bromine", "Br", 35, 2, 7, 10682368);
		element[36] = new SimpleElement("Krypton", "Kr", 36, 2, 1, 16766356);

		element[37] = new SimpleElement("Rubidium", "Rb", 37, 1, 6, 13631409, 1);
		element[38] = new SimpleElement("Strontium", "Sr", 38, 1, 1, 16773559, 1);
		element[39] = new SimpleElement("Yttrium", "Y", 39, 1, 1, 14675691, 0);
		element[40] = new SimpleElement("Zirconium", "Zr", 40, 1, 1, 13425368,
				1);
		element[41] = new SimpleElement("Niobium", "Nb", 41, 1, 1, 15319294, 1);
		element[42] = new SimpleElement("Molyblenum", "Mo", 42, 1, 1, 14675693,
				1);
		element[43] = new SimpleElement("Technetium", "Tc", 43, 1, 3, 13423315,
				0);
		element[44] = new SimpleElement("Ruthenium", "Ru", 44, 1, 1, 15987699,
				1);
		element[45] = new SimpleElement("Rhodium", "Rh", 45, 1, 1, 16448250, 0);
		element[46] = new SimpleElement("Palladium", "Pd", 46, 1, 1, 16579836,
				1);
		element[47] = new SimpleElement("Silver", "Ag", 47, 1, 1, 16645629, 1);
		element[48] = new SimpleElement("Cadmium", "Cd", 48, 1, 1, 13158600, 1);
		element[49] = new SimpleElement("Indium", "In", 49, 1, 1, 15790320, 0);
		element[50] = new SimpleElement("Tin", "Sn", 50, 1, 1, 13158600, 0);
		element[51] = new SimpleElement("Antimony", "Sb", 51, 1, 1, 13096691, 1);
		element[52] = new SimpleElement("Tellurium", "Te", 51, 1, 1, 15986928,
				11);
		element[53] = new SimpleElement("Iodine", "I", 53, 2, 5, 15301104);
		element[54] = new SimpleElement("Xenon", "Xe", 54, 2, 1, 8419824);

		element[55] = new SimpleElement("Cesium", "Cs", 55, 1, 6, 14482672, 1);
		element[56] = new SimpleElement("Barium", "Ba", 56, 1, 6, 15132190, 0);
		element[57] = new SimpleElement("Lanthanum", "La", 57, 1, 1, 15132190,
				1);
		element[58] = new SimpleElement("Cerium", "Ce", 58, 1, 1, 16777215, 0);
		element[59] = new SimpleElement("Praseodymium", "Pr", 59, 1, 1,
				14474460, 0);
		element[60] = new SimpleElement("Neodymium", "Nd", 60, 1, 1, 15924420,
				0);
		element[61] = new SimpleElement("Promethium", "Pm", 61, 1, 3, 11776947,
				0);
		element[62] = new SimpleElement("Samarium", "Sm", 62, 1, 1, 14090163, 1);
		element[63] = new SimpleElement("Europium", "Eu", 63, 1, 1, 13158600, 0);
		element[64] = new SimpleElement("Gadolinium", "Gd", 64, 1, 1, 16777116,
				0);
		element[65] = new SimpleElement("Terbium", "Tb", 65, 1, 1, 11842740, 0);
		element[66] = new SimpleElement("Dysprosium", "Dy", 66, 1, 1, 11842685,
				0);
		element[67] = new SimpleElement("Holmium", "Ho", 67, 1, 1, 13552806, 0);
		element[68] = new SimpleElement("Erbium", "Er", 68, 1, 1, 15263676, 0);
		element[69] = new SimpleElement("Thulium", "Tm", 69, 1, 1, 15263718, 0);
		element[70] = new SimpleElement("Ytterbium", "Yb", 70, 1, 1, 13158630,
				0);
		element[71] = new SimpleElement("Lutecium", "Lu", 71, 1, 1, 16448200, 0);
		element[72] = new SimpleElement("Hafnium", "Hf", 72, 1, 1, 14540253, 1);
		element[73] = new SimpleElement("Tantalum", "Ta", 73, 1, 1, 12369084, 1);
		element[74] = new SimpleElement("Tungsten", "W", 74, 1, 1, 11044486, 1);
		element[75] = new SimpleElement("Rhenium", "Rh", 75, 1, 1, 10461087, 1);
		element[76] = new SimpleElement("Osmium", "Os", 76, 1, 1, 14548991, 1);
		element[77] = new SimpleElement("Iridium", "Ir", 77, 1, 1, 16776925, 1);
		element[78] = new SimpleElement("Platinum", "Pt", 78, 1, 1, 16711668, 1);
		element[79] = new SimpleElement("Gold", "Au", 79, 1, 1, 16707651, 1);
		element[80] = new SimpleElement("Mercury", "Hg", 80, 4, 3, 13171450, 1);
		element[81] = new SimpleElement("Thalium", "Tl", 81, 1, 1, 8816262, 0);
		element[82] = new SimpleElement("Lead", "Pb", 82, 1, 7, 6316128, 0);
		element[83] = new SimpleElement("Bismuth", "Bi", 83, 1, 1, 7627851, 0);
		element[84] = new SimpleElement("Polonium", "Po", 84, 1, 3, 14869747, 0);
		element[85] = new SimpleElement("Astatine", "At", 85, 2, 5, 13828095);
		element[86] = new SimpleElement("Radon", "Rn", 86, 2, 1, 32768);

		element[87] = new SimpleElement("Francium", "Fr", 87, 1, 3, 16769535, 1);
		element[88] = new SimpleElement("Radium", "Ra", 88, 1, 3, 11251580, 0);
		element[89] = new SimpleElement("Actinium", "Ac", 89, 1, 3, 14803425, 1);
		element[90] = new SimpleElement("Thorium", "Th", 90, 1, 3, 2697513, 0);
		element[91] = new SimpleElement("Protactinium", "Pa", 91, 1, 3,
				12958465, 1);
		element[92] = new SimpleElement("Uranium", "U", 92, 1, 3, 10066329, 0);
		element[93] = new SimpleElement("Neptunium", "Np", 93, 1, 3, 8158332, 1);
		element[94] = new SimpleElement("Plutonium", "Pt", 94, 1, 3, 11053224,
				0);
		element[95] = new SimpleElement("Americium", "Am", 95, 1, 3, 12032428,
				1);
		element[96] = new SimpleElement("Curium", "Cm", 96, 1, 3, 11909782, 1);
		element[97] = new SimpleElement("Berkelium", "Bk", 97, 1, 3, 14285823,
				1);
		element[98] = new SimpleElement("Californium", "Cf", 98, 1, 3,
				15921906, 1);
		element[99] = new SimpleElement("Einsteinium", "Es", 99, 1, 3,
				11579628, 1);
		element[100] = new SimpleElement("Fermium", "Fm", 100, 1, 3, 16775893,
				1);
		element[101] = new SimpleElement("Mendelevium", "Md", 101, 1, 3,
				15658734, 1);
		element[102] = new SimpleElement("Nobelium", "Nb", 102, 1, 3, 12632256,
				1);
		element[103] = new SimpleElement("Lawrencium", "Lr", 103, 1, 3,
				15658734, 1);
		element[104] = new SimpleElement("Rutherfordium", "Rf", 104, 1, 3,
				14024703, 1);
		element[105] = new SimpleElement("Dubnium", "Db", 105, 1, 3, 16769007,
				1);
		element[106] = new SimpleElement("Seaborgium", "Sg", 106, 1, 3,
				14155263, 1);
		element[107] = new SimpleElement("Bohrium", "Bh", 107, 1, 3, 16777173,
				1);
		element[108] = new SimpleElement("Hassium", "Hs", 108, 1, 3, 12632256,
				1);
		element[109] = new SimpleElement("Meitnerium", "Mt", 109, 1, 3,
				14680031, 1);
		element[110] = new SimpleElement("Darmstadtium", "Ds", 110, 1, 3,
				15263976, 1);
		element[111] = new SimpleElement("Roentgenium", "Rg", 111, 1, 3,
				15790320, 1);

	}

}
