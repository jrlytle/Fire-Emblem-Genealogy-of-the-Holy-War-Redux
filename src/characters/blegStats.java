package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.swords.*;

public class blegStats
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
  earthSwordStats e = new earthSwordStats();
  genItem earthSword = new genItem(e.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  public int team = 2;
  public int characterID = 140;
  public int classID = 70;
  public int baseClass = 27;
  public int level = 17;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {65,65,33,21,41,44,45,33,40,8};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,0,0,0,0,0,0,0,0,0,12,0,0};
  public int[] basePercents = new int[] {514,446,240,497,497,771,463,480};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {121,121,0,0,0,31,0,0,0,0,0,0};
  public int[] skills = new int[] {3,4,6,7,65,67};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 5000;
  public int sex = 1;
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  /*int[][] weapons = 
  {
    {22,1,12,5,70,1,2,1,10000,10,0,1,0,0,0,0,0,0,0,0,0,0},//Earthsword
    {127,12,0,0,0,0,0,0,20000,-1,0,0,0,0,0,0,0,0,0,0,0,3},//Leg Ring
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
  };*/
  public item[] weapons = new item[] {earthSword,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}