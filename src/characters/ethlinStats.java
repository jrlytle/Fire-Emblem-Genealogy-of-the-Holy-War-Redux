package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.swords.*;

public class ethlinStats
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
  slimSwordStats s = new slimSwordStats();
  genItem slimSword = new genItem(s.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  public int team = 0;
  public int characterID = 9;
  public int classID = 39;
  public int baseClass = 39;
  public int level = 1;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {28,28,6,12,13,15,8,4,9,8};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {16,0,0,0,0,0,0,0,0,0,0,0,0};
  public int[] basePercents = new int[] {400,200,50,200,300,100,200,100};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {71,0,0,0,0,31,0,0,0,0,0,0};
  public int[] skills = new int[] {7,91,0,0,0,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 4000;
  public int sex = 1;
  public int marriedID = 8;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  /*int[][] weapons = 
  {
    {19,1,8,1,90,1,1,1,3000,50,0,1,0,0,0,0,0,0,0,0,0,0},//Slim Sword
    {97,11,0,0,100,1,1,0,5000,50,0,0,0,0,0,0,0,0,0,0,0,0},//Live Staff
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
  };*/
  public item[] weapons = new item[] {slimSword,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}