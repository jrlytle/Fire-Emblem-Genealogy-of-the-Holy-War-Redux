package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.swords.*;

public class iraStats
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
  ironBladeStats i = new ironBladeStats();
  genItem ironBlade = new genItem(i.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  public int team = 2;
  public int characterID = 64;
  public int classID = 12;
  public int baseClass = 12;
  public int level = 4;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {32,32,12,0,17,19,3,8,2,6};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,16,0,0,0,0,0,0,0,0,0,0,0};
  public int[] basePercents = new int[] {750,450,75,450,450,300,300,75};//new int[] {500,300,50,300,300,200,200,50};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {121,0,0,0,0,0,0,0,0,0,0,0};
  public int[] skills = new int[] {3,6,16,41,0,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 3000;
  public int sex = 1;
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  public item[] weapons = new item[] {ironBlade,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}