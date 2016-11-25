package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.swords.*;
import weapons.tomes.*;

public class blumeStats
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
  thorhammerStats t = new thorhammerStats();
  genItem thorhammer = new genItem(t.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  silverBladeStats s = new silverBladeStats();
  genItem silverBlade = new genItem(s.allStats, s.remainingStats);
  public int team = 2;
  public int characterID = 112;
  public int classID = 142;
  public int baseClass = 142;
  public int level = 17;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {65,65,47,36,30,32,6,47,36,5};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,0,0,0,0,0,0,0,0,24,0,0,0};
  public int[] basePercents = new int[] {343,600,497,394,429,103,600,497};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {121,121,121,121,0,121,121,251,121,0,0,0};
  public int[] skills = new int[] {1,37,38,39,40,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 5000;
  public int sex = 0;
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = true;
  public int leadershipStars = 4;
  public item[] weapons = new item[] {thorhammer,silverBlade,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}