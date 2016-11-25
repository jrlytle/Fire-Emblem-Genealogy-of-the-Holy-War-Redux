package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.tomes.*;

public class diadoraStats
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
  auraStats a = new auraStats();
  genItem aura = new genItem(a.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  public int team = 0;
  public int characterID = 13;
  public int classID = 33;
  public int baseClass = 33;
  public int level = 3;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {26,26,0,17,11,14,6,4,16,5};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,0,0,0,0,0,0,0,0,0,0,24,12};
  public int[] basePercents = new int[] {400,100,100,200,100,100,100,100};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {0,0,0,0,0,71,0,0,0,121,0,0};
  public int[] skills = new int[] {6,0,0,0,0,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 1000;
  public int sex = 1;
  public int marriedID = 1;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  /*int[][] weapons = 
  {
    {90,8,20,20,80,1,2,2,15000,50,0,1,0,0,0,0,0,0,0,0,0,0},//Aura
    {108,11,0,0,100,1,10,1,30000,3,0,0,0,0,0,0,0,0,0,0,0,0},//Silence Staff
    {129,12,0,0,0,0,0,0,-1,-1,0,0,12,13,0,0,0,0,0,0,0,0},//Circlet
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
  };*/
  public item[] weapons = new item[] {aura,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}