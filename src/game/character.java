package game;
import functions.*;
import weapons.*;
public class character
{
  int team, characterID, classID, sex, marriedID, level, maxLevel, exp, kills, gold, baseClass, leadershipStars, attack, hit, crit, avoid;
  int[] childOne, childTwo, childThree, currentStats, bonusStats, basePercents, bonusPercents, weaponEXP, skills, bloodTypes, skillList;
  item[] weapons;
  boolean isLeader;
  public character(int team, int characterID, int classID, int sex, int marriedID, int[] childOne, int[] childTwo, int[] childThree, int level, int maxLevel, int exp, int[] currentStats, int[] bonusStats, int[] bloodTypes, int[] basePercents, int[] bonusPercents, int[] weaponEXP, int[] skills, item[] weapons, int kills, int gold, int baseClass, boolean isLeader, int leadershipStars, int attack, int hit, int crit, int avoid, int[] skillList)
  {
    this.team = team;
    this.characterID = characterID;
    this.classID = classID;
    this.sex = sex;
    this.marriedID = marriedID;
    this.childOne = childOne;
    this.childTwo = childTwo;
    this.childThree = childThree;
    this.level = level;
    this.maxLevel = maxLevel;
    this.exp = exp;
    this.currentStats = currentStats;
    this.bonusStats = bonusStats;
    this.bloodTypes = bloodTypes;
    this.basePercents = basePercents;
    this.bonusPercents = bonusPercents;
    this.weaponEXP = weaponEXP;
    this.skills = skills;
    this.weapons = weapons;
    this.kills = kills;
    this.gold = gold;
    this.baseClass = baseClass;
    this.isLeader = isLeader;
    this.leadershipStars = leadershipStars;
    this.attack = attack;
    this.hit = hit;
    this.crit = crit;
    this.avoid = avoid;
    this.skillList = skillList;
  }
  public int getTeam()
  {
    return team;
  }
  public int getCharacterID()
  {
    return characterID;
  }
  public int getClassID()
  {
    return classID;
  }
  public void setClass(int newClass)
  {
    classID = newClass;
  }
  public int getSex()
  {
    return sex;
  }
  public int getMarriedID()
  {
    return marriedID;
  }
  public int getChildOneID(int id)
  {
    return childOne[id];
  }
  public int getChildTwoID(int id)
  {
    return childTwo[id];
  }
  public int getChildThreeID(int id)
  {
    return childThree[id];
  }
  public int getLevel()
  {
    return level;
  }
  public void resetLevel()
  {
    level = 1;
  }
  public void increaseLevel()
  {
    level++;
  }
  public int getMaxLevel()
  {
    return maxLevel;
  }
  public void increaseMaxLevel()
  {
    maxLevel += 5;
  }
  public int getEXP()
  {
    return exp;
  }
  public void setEXP(int value)
  {
    exp += value;
  }
  public int[] getAllCurrentStats()
  {
      return currentStats;
  }
  public int getCurrentStats(int stat)
  {
    return currentStats[stat];
  }
  public void increaseCurrentStats(int stat, int increase)
  {
    currentStats[stat] += increase;
  }
  public int[] getAllBonusStats()
  {
      return bonusStats;
  }
  public int getBonusStat(int stat)
  {
    return bonusStats[stat];
  }
  public int[] getBasePercents()
  {
    return basePercents;
  }
  public int getBasePercents(int stat)
  {
    return basePercents[stat];
  }
  public int[] getBonusPercents()
  {
    return bonusPercents;
  }
  public int getBonusPercents(int stat)
  {
    return bonusPercents[stat];
  }
  public void setBonusPercents(int[] boost)
  {
    for(int i = 0; i < boost.length; i++)
    {
      bonusPercents[i] += boost[i];
    }
  }
  public int getWeaponEXP(int type)
  {
    return weaponEXP[type];
  }
  public int[] getAllSkills()
  {
    return skills;
  }
  public int getSkills(int number)
  {
    return skills[number];
  }
  public int getKills()
  {
    return kills;
  }
  public void setBonusStat(int stat, int value)
  {
    bonusStats[stat] = value;
  }
  public int[] getBloodTypes()
  {
    return bloodTypes;
  }
  public int getBloodTypePercent(int bloodType)
  {
    return bloodTypes[bloodType];
  }
  public void setBloodTypePercent(int bloodType, int newVal)
  {
    bloodTypes[bloodType] = newVal;
  }
  public void incCurrentStat(int stat)
  {
    currentStats[stat]++;
  }
  public void setCurrentStat(int stat, int value)
  {
    currentStats[stat] = value;
  }
  public void setStat(int value, int stat)
  {
    currentStats[stat] += value;
  }
  public void setSkills(int number, int value)
  {
    skills[number] = value;
  }
  public int getGold()
  {
    return gold;
  }
  public item getItem(int val)
  {
    return weapons[val];
  }
  public item[] getItems()
  {
    return weapons;
  }
  public item getEquippedWeapon(item[] items)
  {
      for(int i = 0; i < items.length; i++)
      {
          if(items[i].getIsEquipped())
          {
              return items[i];
          }
      }
      return null;
  }
  public int getBaseClass()
  {
    return baseClass;
  }
  public boolean getIsLeader()
  {
    return isLeader;
  }
  public int getLeadershipStars()
  {
    return leadershipStars;
  }
  public int getAttack()
  {
    return attack;
  }
  public void setAttack()
  {
    Attack attackStat = new Attack();
  FillSkillList fSL = new FillSkillList();
    equippedWeapon eW = new equippedWeapon();
    setBonus sB = new setBonus();
    attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, sB.getBonus(skills, eW.getEquippedWeapon(weapons)));//bonusStats);
  }
  public int getHit()
  {
    return hit;
  }
  public void setHit()
  {
    Hit hitStat = new Hit();
    equippedWeapon eW = new equippedWeapon();
    setBonus sB = new setBonus();
    int[] bonuses = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
    hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonuses[3], currentStats[6], bonuses[5], skills);
  }
  public int getCrit()
  {
    return crit;
  }
  public void setCrit()
  {
    Critical criticalStat = new Critical();
    equippedWeapon eW = new equippedWeapon();
    setBonus sB = new setBonus();
    int[] bonuses = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
    crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonuses[3], skills, kills);
  }
  public int getAvoid()
  {
    return avoid;
  }
  public void setAvoid()
  {
    Avoid avoidStat = new Avoid();
    setBonus sB = new setBonus();
    equippedWeapon eW = new equippedWeapon();
    int[] bonuses = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
    avoid = avoidStat.getAvoid(currentStats[5], bonuses[4], currentStats[6], bonuses[5], skills);
  }
  public int[] getSkillList()
  {
    return skillList;
  }
  public void addSkill(int value)
  {
    int i = 0;
    while(skills[i] != 0 || i < 6)
    {
      i++;
    }
    if(i < 6)
    {
      skills[i] = value;
    }
    else
    {
      i = 0;
      while(skillList[i] != 0)
      {
        i++;
      }
      skillList[i] = value;
    }
  }
}