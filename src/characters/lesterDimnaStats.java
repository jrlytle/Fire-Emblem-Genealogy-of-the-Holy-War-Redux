package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.bows.*;

public class lesterDimnaStats //This Character's Mother is Adean
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
  
  genCharacter mother = cD.adean;
  genCharacter father = inh.getSpouse(mother.getMarriedID());
  
  noWeaponStats n = new noWeaponStats();
  genItem nW = new genItem(n.allStats, n.remainingStats);
  ironBowStats i = new ironBowStats();
  genItem ironBow = new genItem(i.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  public int team = 0;
  public int characterID = getCharacterID();
  public int sex = 0;
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
  public int[] weaponEXP = new int[] {0,0,0,121,0,0,0,0,0,0,0,0};
  int[] defaultSkills = new int[] {3,0,0,0,0,0};
  public int[] skills = inh.inheritSkill(mother, father, defaultSkills);
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = getGold();
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  public item[] weapons = new item[] {ironBow,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
  
  public int getCharacterID()
  {
    if(father.getCharacterID() != 0)
    {
      return 31;
    }
    else
    {
      return 32;
    }
  }
  public int getClassID()
  {
    if(father.getCharacterID() != 0)
    {
      return inh.getBaseClass(mother, father, sex);
    }
    else
    {
      return 37;
    }
  }
  public int[] getBloodTypes()
  {
    if(father.getCharacterID() != 0)
    {
      return inh.getBloodType(mother, father, sex);
    }
    else
    {
      return new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0};
    }
  }
  public int[] getPercents()
  {
    if(father.getCharacterID() != 0)
    {
      return inh.getGrowth(mother, father, sex);
    }
    else
    {
      return new int[] {900,300,50,500,200,300,400,50};
    }
  }
  public int[] getCurrentStats()
  {
    if(father.getCharacterID() != 0)
    {
      return inh.childStartingStats(mother, father, level, basePercents, bonusPercents, level, classID, sex);
    }
    else
    {
      return new int[] {30,30,9,0,7,9,3,8,0,8};
    }
  }
  public int getGold()
  {
    if(father.getCharacterID() != 0)
    {
      return inh.getGold(mother, father);
    }
    else
    {
      return 2000;
    }
  }
}