package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.swords.*;
import weapons.tomes.*;

public class myUnitStats
{
  Attack attackStat = new Attack();
  FillSkillList fSL = new FillSkillList();
  Avoid avoidStat = new Avoid();
  Critical criticalStat = new Critical();
  Hit hitStat = new Hit();
  equippedWeapon eW = new equippedWeapon();
  static randomBloodType rBT = new randomBloodType();
  setBonus sB = new setBonus();
  inheritance inh = new inheritance();
  
  noWeaponStats n = new noWeaponStats();
  genItem noWeapon = new genItem(n.allStats, n.remainingStats);
  bronzeSwordStats s = new bronzeSwordStats();
  genItem bronzeSword = new genItem(s.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  fireStats f = new fireStats();
  genItem fire = new genItem(f.allStats, f.remainingStats);
  
  public static int[] bloodTypePercents = rBT.getUnitBloodType(1);//new int[] {24,24,24,24,24,24,24,24,24,24,24,24,24};
  public int team = 0;
  public int characterID = 5;
  public int classID = 2;
  public int baseClass = 2;
  public int level = 1;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {19,19,6,5,5,6,4,6,4,5}; 
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] basePercents = new int[] {400,400,350,350,350,550,300,200};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {1,0,0,0,0,0,1,1,1,1,0,0};
  public int[] skills = new int[] {28,0,0,0,0,0}; //37, 46, 53, 60, 65, 71, 77, 91, 97, 105, 109
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
  public item[] weapons = new item[] {bronzeSword,fire,noWeapon,noWeapon,noWeapon,noWeapon,noWeapon};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}