package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.axes.*;
import java.util.Random;

public class gandolfStats
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
  handAxeStats h = new handAxeStats();
  genItem handAxe = new genItem(h.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  static Random r = new Random();
  public int team = 2;
  public int characterID = 66;
  public int classID = 63;
  public int baseClass = 19;
  public int level = 20;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {60,60,31,0,21,33,0,26,10,6};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[13];
  public int[] dummyBloodType = rBT.getBloodType(bloodTypePercents);
  public int[] basePercents = new int[] {600,400,100,300,300,100,300,100};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {0,0,121,71,0,0,0,0,0,0,0,0};
  public static int randomSkill = 46;
  public static int getRandomSkill()
  {
    while(randomSkill == 46 || randomSkill == 47 || randomSkill == 48 || randomSkill == 49)
    {
      randomSkill = r.nextInt(112)+1;
    }
    return randomSkill;
  }
  public int[] skills = new int[] {46,47,48,49,getRandomSkill(),0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 3000;
  public int sex = 0;
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = true;
  public int leadershipStars = 2;
  /*int[][] weapons = 
  {
    {56,3,10,20,50,1,2,1,3000,50,0,1,0,0,0,0,0,0,0,0,0,0},//Hand Axe
    {128,12,0,0,0,0,0,0,20000,-1,0,0,0,0,0,0,5,0,0,0,0,0},//Skill Ring
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
  };*/
  public item[] weapons = new item[] {handAxe,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}