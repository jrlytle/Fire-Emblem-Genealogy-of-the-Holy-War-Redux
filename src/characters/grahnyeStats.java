package characters;
import functions.*;
import game.*;
import weapons.*;

public class grahnyeStats
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
  public int team = 1;
  public int characterID = 157;
  public int classID = -1; //May add a class for Aless to inherit
  public int baseClass = -1; //May add a class for Aless to inherit
  public int level = -1;
  public int maxLevel = 20;
  public int exp = -1;
  public int[] currentStats = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  public int[] basePercents = new int[] {-1,-1,-1,-1,-1,-1,-1,-1};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  public int[] skills = new int[] {-1,-1,-1,-1,-1,-1};
  public int[] skillList = fSL.getSkillList();
  public int kills = -1;
  public int gold = 0;
  public int sex = 1;
  public int marriedID = -1;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  public item[] weapons = new item[] {nW,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}