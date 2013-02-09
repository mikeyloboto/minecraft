package advancedChemistry.common.commonData;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.StatCollector;

public class DamageChemical extends DamageSource {

	public String var1;
	public String var2;
	public int var3;

	public DamageChemical(String par1Str, String chemicalName, int par3) {
		super(par1Str);
		var1 = par1Str;
		var2 = chemicalName;
		var3 = par3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDeathMessage(EntityPlayer par1EntityPlayer) {
		switch (var3) {
		case 1:
			return par1EntityPlayer.username + " decided to drink some " + var2
					+ " solution.";
		case 2:
			return par1EntityPlayer.username
					+ " has frozen from inside. Looks like drinking liquid "
					+ var2 + " is not the best idea.";
		case 3:
			return par1EntityPlayer.username + " has corroded while drinking "
					+ var2 + " solution.";
		case 4:
			return par1EntityPlayer.username + " thought that drinking " + var2
					+ " ionic solution is a good idea.";
		case 5:
			return par1EntityPlayer.username + " died of " + var2
					+ " radiation.";
		default:
			return null;
		}
	}

}
