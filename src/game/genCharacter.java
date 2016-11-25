package game;
import weapons.*;
public class genCharacter extends character
{
  public genCharacter(int team, int characterID, int classID, int sex, int marriedID, int[] childOne, int[] childTwo, int[] childThree, int level, int maxLevel, int exp, int[] currentStats, int[] bonusStats, int[] bloodTypes, int[] basePercents, int[] bonusPercents, int[] weaponEXP, int[] skills, item[] weapons, int kills, int gold, int baseClass, boolean isLeader, int leadershipStars, int attack, int hit, int crit, int avoid, int[] skillList)
  {
    super(team, characterID, classID, sex, marriedID, childOne, childTwo, childThree, level, maxLevel, exp, currentStats, bonusStats, bloodTypes, basePercents, bonusPercents, weaponEXP, skills, weapons, kills, gold, baseClass, isLeader, leadershipStars, attack, hit, crit, avoid, skillList);
  }
}