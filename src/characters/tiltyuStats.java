package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.tomes.*;

public class tiltyuStats
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
  thoronStats t = new thoronStats();
  genItem thoron = new genItem(t.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  thunderStats th = new thunderStats();
  genItem thunder = new genItem(th.allStats, th.remainingStats);
  public int team = 0;
  public int characterID = 17;
  public int classID = 31;
  public int baseClass = 31;
  public int level = 3;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {28,28,0,13,17,12,9,1,11,5};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,0,0,0,0,0,0,0,0,16,0,0,0};
  public int[] basePercents = new int[] {600,150,300,300,450,300,450,150};//new int[] {400,100,200,200,300,200,300,100};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {0,0,0,0,0,0,0,121,0,0,0,0};
  public int[] skills = new int[] {2,0,0,0,0,0};
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
  public item[] weapons = new item[] {thoron,thunder,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}