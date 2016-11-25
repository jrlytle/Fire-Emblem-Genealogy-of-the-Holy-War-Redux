package genericCharacters;
import functions.*;
import game.*;
import weapons.*;
import weapons.axes.*;
import java.util.Random;

public class brigandTwentyStats
{
  Attack attackStat = new Attack();
  FillSkillList fSL = new FillSkillList();
  Avoid avoidStat = new Avoid();
  Critical criticalStat = new Critical();
  Hit hitStat = new Hit();
  equippedWeapon eW = new equippedWeapon();
  randomBloodType rBT = new randomBloodType();
  
  setBonus sB = new setBonus();
    
  noWeaponStats n = new noWeaponStats();
  genItem nW = new genItem(n.allStats, n.remainingStats);
  ironAxeStats i = new ironAxeStats();
  genItem ironAxe = new genItem(i.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  
  final static Random r = new Random();
  public int team = 2;
  public int characterID = 177;
  public int classID = 20;
  public int baseClass = 20;
  public int level = 1;
  public int maxLevel = 20;
  public int exp = 0;
  public int internalLevel = 15;
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[13];
  static int randomHP = r.nextInt(100);
  static int randomStr = r.nextInt(200);
  static int randomMgc = r.nextInt(100);
  static int randomSkl = r.nextInt(200);
  static int randomSpd = r.nextInt(200);
  static int randomLck = r.nextInt(300);
  static int randomDef = r.nextInt(200);
  static int randomRes = r.nextInt(200);
  public int[] basePercents = new int[] {600+randomHP,400+randomStr,100+randomMgc,300+randomSkl,300+randomSpd,100+randomLck,300+randomDef,100+randomRes};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  public int hpAddition = rBT.getRandomStats(internalLevel, basePercents[0]);
  public int[] currentStats = new int[] {20+hpAddition,20+hpAddition,rBT.getRandomStats(internalLevel, basePercents[1]),rBT.getRandomStats(internalLevel, basePercents[2]),rBT.getRandomStats(internalLevel, basePercents[3]),rBT.getRandomStats(internalLevel, basePercents[4]),rBT.getRandomStats(internalLevel, basePercents[5]),rBT.getRandomStats(internalLevel, basePercents[6]),rBT.getRandomStats(internalLevel, basePercents[7]),5};
  //0->1 "-"
  //1->30 "D"
  //30->70 "C"
  //70->120 "B"
  //120->180 "A"
  //180->250 "S"
  public int[] weaponEXP = new int[] {0,0,71,0,0,0,0,0,0,0,0,0};
  public static int randomSkill = 50;
  public static int getRandomSkill()
  {
    while(randomSkill == 50)
    {
      randomSkill = r.nextInt(112)+1;
    }
    return randomSkill;
  }
  public int[] skills = new int[] {50,getRandomSkill(),0,0,0,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 2000;
  public int sex = 0;
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  public static int randomKills = r.nextInt(100);
  public item[] weapons = new item[] {ironAxe,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
  
  
}