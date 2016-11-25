package functions;
import weapons.*;
public class Hit
{
  public int getHit(item weapon, int skill, int bonusSkill, int luck, int bonusLuck, int[] skills)
  {
    int hit = (((3 * (skill + bonusSkill)) + (luck + bonusLuck)) / 2) + weapon.getHit(); //+ Weapon Rank Bonus + Leadership bonus + Charisma bonus + Lover bonus + Weapon triangle bonus
    if(skills[0] == 55 || skills[1] == 55 || skills[2] == 55 || skills[3] == 55 || skills[4] == 55 || skills[5] == 55)//Hit + 20
      hit += 20;
    if(skills[0] == 114 || skills[1] == 114 || skills[2] == 114 || skills[3] == 114 || skills[4] == 114 || skills[5] == 114)//Hit + 10
      hit += 10;
    if(skills[0] == 51 || skills[1] == 51 || skills[2] == 51 || skills[3] == 51 || skills[4] == 51 || skills[5] == 51)//Gamble
      hit -= 5;
    return hit;
  }
}