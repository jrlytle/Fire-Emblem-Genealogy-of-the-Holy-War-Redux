package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.lances.*;

public class altennaStats //This Character's Mother is Ethlin (Father is always Cuan, but we assume father is unknown to set a pattern for all children)
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
  
  genCharacter mother = cD.ethlin;
  genCharacter father = cD.cuan;
  
  noWeaponStats n = new noWeaponStats();
  genItem nW = new genItem(n.allStats, n.remainingStats);
  gaeborgStats gS = new gaeborgStats();
  genItem gaeborg = new genItem(gS.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  public int team = 2;
  public int characterID = 116;
  public int sex = 1;
  public int classID = 28;
  public int baseClass = 28;
  public int level = 1;
  public int maxLevel = 20;
  public int exp = 0;
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = inh.getBloodType(father, mother, sex);//inh.getBloodType(mother, father, sex);
  public int[] basePercents = inh.getGrowth(father, mother, sex);//inh.getGrowth(mother, father, sex);
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  public int[] currentStats = inh.childStartingStats(father, mother, level, basePercents, bonusPercents, level, classID, sex);//inh.childStartingStats(mother, father, level, basePercents, bonusPercents, level, classID, sex);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {121,251,0,0,0,0,0,0,0,0,0,0};
  int[] defaultSkills = new int[] {0,0,0,0,0,0};
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
  public item[] weapons = new item[] {gaeborg,nW,nW,nW,nW,nW,nW}; //Need to change to inherit Cuan's Gaeborg - may have kills on it
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
  
  
}