package advancedChemistry.common.commonData;

public class SimpleElement {
	public String Name; // 1
	public String NameCaps; // 2
	public String Symbol; // 3
	public int Metal;
	public int AtomicNumber; // 4
	public int Stability; // 7
	public int SolutionColor;// 8
	public int Shine; // 9

	/**
	 * Initializes chemical element with predefined properties
	 * 
	 * 
	 * @param par2
	 *            Capitalized name of the chemical element
	 * @param par3
	 *            1-3 characters. Atomic symbol.
	 * @param par4
	 *            Periodic number of the element
	 * @param par5
	 *            Atomic weight of the element
	 * @param par6
	 *            1) Metal. 2) Nonmetal
	 * @param par7
	 *            1) - Stable. 2) - Can blow up. 3) - Radiation danger. 4) -
	 *            Other
	 * @param par8
	 *            int - color of solution
	 * @param par9
	 *            int - Shiny
	 * 
	 */
	public SimpleElement(String par2, String par3, int par4, int par6,
			int par7, int par8, int par9) {
		this.Name = par2.toLowerCase();
		this.NameCaps = par2;
		this.Symbol = par3;
		this.AtomicNumber = par4;
		this.Metal = par6;
		this.Stability = par7;
		this.SolutionColor = par8;
		this.Shine = par9;
	}

	/**
	 * Initializes chemical element with predefined properties
	 * 
	 * 
	 * @param par2
	 *            Capitalized name of the chemical element
	 * @param par3
	 *            1-3 characters. Atomic symbol.
	 * @param par4
	 *            Periodic number of the element
	 * @param par5
	 *            Atomic weight of the element
	 * @param par6
	 *            1) Metal. 2) Nonmetal
	 * @param par7
	 *            1) - Stable. 2) - Can blow up. 3) - Radiation danger. 4) -
	 *            Other
	 * @param par8
	 *            int - color of solution
	 * 
	 * 
	 */
	public SimpleElement(String par2, String par3, int par4, int par6,
			int par7, int par8) {
		this.Name = par2.toLowerCase();
		this.NameCaps = par2;
		this.Symbol = par3;
		this.AtomicNumber = par4;
		this.Metal = par6;
		this.Stability = par7;
		this.SolutionColor = par8;
	}
}
