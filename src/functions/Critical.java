package functions;
import weapons.*;
public class Critical
{
  public int getCritical(item weapon, int skill, int bonusSkill, int[] skills, int kills)
  {
    int totalCritical = weapon.getCritical();
    //Character has Critical Skill...
    if(skills[0] == 7 || skills[1] == 7 || skills[2] == 7 || skills[3] == 7 || skills[4] == 7 || skills[5] == 7)
    {
      totalCritical += Math.min(50, kills) + (skill + bonusSkill);
      //Weapon has Critical Skill...
      if(weapon.getSkillOne() == 7 || weapon.getSkillTwo() == 7 || weapon.getSkillThree() == 7)
      {
        //Because of kills...
        if(weapon.getKills() >= 50)
        {
          totalCritical += Math.min(50, (weapon.getKills() - 50));
        }
        //Not because of kills...
        else
        {
          totalCritical += Math.min(50, weapon.getKills());
        }
      }
    }
    //Character doesn't have Critical Skill...
    else
    {
      //Weapon has Critical Skill...
      if(weapon.getSkillOne() == 7 || weapon.getSkillTwo() == 7 || weapon.getSkillThree() == 7)
      {
        //Because of kills...
        if(weapon.getKills() >= 50)
        {
          totalCritical += Math.min(50, (50 - weapon.getKills())) + (skill + bonusSkill);
        }
        //Not because of kills...
        else
        {
          totalCritical += Math.min(50, weapon.getKills()) + (skill + bonusSkill);
        }
      }
      else
      {
        totalCritical += ((skill + bonusSkill) / 2);
      }
    }
    return totalCritical;
  }
}