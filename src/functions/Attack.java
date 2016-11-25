package functions;
import weapons.*;
public class Attack
{
  public int getAttack(item weapon, int[] currentStats, int[] bonusStats)
  {
    int weaponID = weapon.getID();
    if((weaponID > 0 && weaponID <= 54) || (weaponID >= 60 && weaponID <= 67) || (weaponID >= 69 && weaponID <= 124) || (weaponID >= 126 && weaponID <= 151) || (weaponID >= 153 && weaponID <= 175) || (weaponID >= 177 && weaponID <= 256) || (weaponID >= 258 && weaponID <= 289) || (weaponID >= 291 && weaponID <= 295))
    {
      return weapon.getMight() + currentStats[2] + bonusStats[1];
    }
    else if((weaponID >= 55 && weaponID <= 59) || weaponID == 68 || weaponID == 125 || weaponID == 152 || weaponID == 176 || weaponID == 257 || (weaponID >= 378 && weaponID <= 449))
    {
      return weapon.getMight() + currentStats[3] + bonusStats[2];
    }
    return -1;
  }
}