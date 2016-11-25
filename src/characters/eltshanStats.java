package characters;
import functions.*;
import game.*;
import weapons.*;
import weapons.swords.*;
import weapons.lances.*;

public class eltshanStats
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
  mistoltinStats m = new mistoltinStats();
  genItem mistoltin = new genItem(m.allStats, new boolean[]{true,false,false,false,false,false,false,false,false,false,false});
  steelLanceStats s = new steelLanceStats();
  genItem steelLance = new genItem(s.allStats, s.remainingStats);
  public int team = 1;
  public int characterID = 53;
  public int classID = 46;
  public int baseClass = 3;
  public int level = 20;
  public int maxLevel = 20;
  public int exp = 0;
  public int[] currentStats = new int[] {80,80,26,11,25,25,0,26,31,9};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypePercents = new int[] {0,0,24,0,0,0,0,0,0,0,0,0,0};
  public int[] basePercents = new int[] {1000,300,100,300,300,0,300,100};
  public int[] bonusPercents = rBT.getBloodPercent(bloodTypePercents);
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {251,121,0,0,0,0,0,0,0,0,0,0};
  public int[] skills = new int[] {32,33,34,35,0,0};
  public int[] skillList = fSL.getSkillList();
  public int kills = 0;
  public int gold = 3000;
  public int sex = 0;
  public int marriedID = 157;
  public int[] childOne = new int[] {44,0};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = true;
  public int leadershipStars = 5;
  public item[] weapons = new item[] {mistoltin,steelLance,nW,nW,nW,nW,nW};

  public int[] bonusStats = sB.getBonus(skills, eW.getEquippedWeapon(weapons));
  public int attack = attackStat.getAttack(eW.getEquippedWeapon(weapons), currentStats, bonusStats);
  public int hit = hitStat.getHit(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], currentStats[6], bonusStats[5], skills);
  public int crit = criticalStat.getCritical(eW.getEquippedWeapon(weapons), currentStats[4], bonusStats[3], skills, kills);
  public int avoid = avoidStat.getAvoid(currentStats[5], bonusStats[4], currentStats[6], bonusStats[5], skills);
}