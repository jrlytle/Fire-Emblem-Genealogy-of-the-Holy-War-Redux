package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.lances.*;

public class dislerStats
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
  silverLanceStats s = new silverLanceStats();
  genItem silverLance = new genItem(s.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  javelinStats j = new javelinStats();
  genItem javelin = new genItem(j.allStats, j.remainingStats);
  public int team = 2;
  public int characterID = 121;
  public int classID = 54;
  public int baseClass = 5;
  public int level = 15;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {62,62,32,4,23,19,0,33,10,5};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0};
  public int[] basePercents = new int[] {549,429,69,291,223,0,463,171};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {121,121,71,71,0,0,0,0,0,0,0,0};
  public int[] skills = new int[] {1,37,38,39,40,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 3000;
  public int sex = 0;
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = true;
  public int leadershipStars = 1;
  /*int[][] weapons = 
  {
    {36,2,20,12,80,1,1,3,5000,50,0,1,0,0,0,0,0,0,0,0,0,0},//Silver Lance
    {37,2,12,18,60,1,2,1,3000,50,0,0,0,0,0,0,0,0,0,0,0,0},//Javelin
    {121,12,0,0,0,0,0,0,20000,-1,0,0,21,0,0,0,0,0,0,0,0,0},//Return Ring
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
  };*/
  public item[] weapons = new item[] {silverLance,javelin,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}