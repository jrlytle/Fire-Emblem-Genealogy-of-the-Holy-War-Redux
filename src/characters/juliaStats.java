package characters;
import functions.*;
import game.*;
import weapons.*;

public class juliaStats //This Character's Mother is Diadora (Father is always Alvis)
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
  
  genCharacter mother = cD.diadora;
  genCharacter father = cD.alvis;
  
  noWeaponStats n = new noWeaponStats();
  genItem nW = new genItem(n.allStats, n.remainingStats);
  public int team = 0;
  public int characterID = 33;
  public int sex = 1;
  public int classID = 33;
  public int baseClass = 33;
  public int level = 1;
  public int maxLevel = 20;
  public int exp = 0;
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = inh.getBloodType(mother, father, sex);
  public int[] basePercents = inh.getGrowth(mother, father, sex);
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  public int[] currentStats = inh.childStartingStats(mother, father, level, basePercents, bonusPercents, level, classID, sex);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {0,0,0,0,0,121,0,0,0,251,0,0};
  int[] defaultSkills = new int[] {3,4,6,0,0,0};
  public int[] skills = inh.inheritSkill(mother, father, defaultSkills);
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = inh.getGold(mother, father);
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  /*int[][] weapons = 
  {
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//Add weapon inheritance
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
  };*/
  public item[] weapons = new item[] {nW,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}