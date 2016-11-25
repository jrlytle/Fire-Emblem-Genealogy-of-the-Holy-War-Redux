package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.tomes.*;

public class daggonStats
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
  yotsmungandStats y = new yotsmungandStats();
  genItem yotsmungand = new genItem(y.allStats, new boolean[] {true,false,false,false,false,false,false,false,false,false,false});
  fenrirStats f = new fenrirStats();
  genItem fenrir = new genItem(f.allStats, f.remainingStats);
  public int team = 2;
  public int characterID = 136;
  public int classID = 144;
  public int baseClass = 144;
  public int level = 19;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {69,69,3,36,29,28,0,15,30,5};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0};
  public int[] basePercents = new int[] {1000,100,300,300,300,0,100,300};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {0,0,0,0,0,121,121,121,121,0,121,0};
  public int[] skills = new int[] {3,0,0,0,0,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 5000;
  public int sex = 0;
  public int marriedID = 0;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = true;
  public int leadershipStars = 1;
  public item[] weapons = new item[] {yotsmungand,fenrir,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}