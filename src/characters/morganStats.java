package characters;
import functions.*;
import game.*;
import weapons.*;

public class morganStats //This Character's Mother or Father is My Unit
{
  Attack attackStat = new Attack();
  FillSkillList fSL = new FillSkillList();
  Avoid avoidStat = new Avoid();
  Critical criticalStat = new Critical();
  Hit hitStat = new Hit();
  equippedWeapon eW = new equippedWeapon();
  randomBloodType rBT = new randomBloodType();
  setBonus sB = new setBonus();
  characterDatabaseGenOne cD = new characterDatabaseGenOne();
  inheritance inh = new inheritance();
  
  genCharacter mother = getMother();
  genCharacter father = getFather();
    
  noWeaponStats n = new noWeaponStats();
  genItem nW = new genItem(n.allStats, n.remainingStats);
  
  public int team = getTeam();
  public int characterID = getCharacterID();
  public int sex = getSex();
  public int classID = getClassID();
  public int baseClass = getClassID();
  public int level = 1;
  public int maxLevel = 20;
  public int exp = 0;
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = getBloodTypes();
  public int[] basePercents = getPercents();
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  public int[] currentStats = getCurrentStats();
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {121,0,0,0,0,0,0,31,31,31,31,0};
  int[] defaultSkills = new int[] {28,0,0,0,0,0};
  public int[] skills = getSkills();
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = getGold();
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  public item[] weapons = new item[] {nW,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
  
  public genCharacter getMother()
  {
    if(cD.myUnit.getSex() == 0)
    {
      return inh.getSpouse(cD.myUnit.getMarriedID());
    }
    else
    {
      return cD.myUnit;
    }
  }
  public genCharacter getFather()
  {
    if(cD.myUnit.getSex() == 1)
    {
      return inh.getSpouse(cD.myUnit.getMarriedID());
    }
    else
    {
      return cD.myUnit;
    }
  }
  
  public int getTeam()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return 0;
    }
    else
    {
      return -1;
    }
  }
  public int getCharacterID()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return 27;
    }
    else
    {
      return -1;
    }
  }
  public int getClassID()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return 4;
    }
    else
    {
      return -1;
    }
  }
  public int getSex()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      if(cD.myUnit.getSex() == 0)
      {
        return 1;
      }
      if(cD.myUnit.getSex() == 1)
      {
        return 0;
      }
    }
    return -1;
  }
  public int[] getBloodTypes()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return inh.getBloodType(mother, father, sex);
    }
    else
    {
      return new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    }
  }
  public int[] getPercents()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return inh.getGrowth(mother, father, sex);
    }
    else
    {
      return new int[] {-1,-1,-1,-1,-1,-1,-1,-1};
    }
  }
  public int[] getCurrentStats()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return inh.childStartingStats(mother, father, level, basePercents, bonusPercents, level, classID, sex);
    }
    else
    {
      return new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    }
  }
  public int[] getSkills()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return inh.inheritSkill(mother, father, defaultSkills);
    }
    return new int[] {-1,-1,-1,-1,-1,-1};
  }
  public int getGold()
  {
    if(mother.getCharacterID() != 0 && father.getCharacterID() != 0)
    {
      return inh.getGold(mother, father);
    }
    else
    {
      return -1;
    }
  }
}