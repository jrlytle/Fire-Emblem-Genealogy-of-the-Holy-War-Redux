package characters;
import game.*;
import weapons.*;

public class noneStats
{
  FillSkillList fSL = new FillSkillList();
  noWeaponStats n = new noWeaponStats();
  genItem nW = new genItem(n.allStats, n.remainingStats);
  public int team = -1;
  public int characterID = 0;
  public int classID = -1;
  public int baseClass = -1;
  public int level = -1;
  public int maxLevel = -1;
  public int exp = -1;
  public int[] currentStats = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  //Baldo, Odo, Hezul, Noba, Dain, Neir, Ulir, Blagi, Fala, Tordo, Holsety, Narga, Loputousu
  public int[] bloodTypes = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  public int[] basePercents = new int[] {-1,-1,-1,-1,-1,-1,-1,-1};
  public int[] bonusPercents = new int[] {-1,-1,-1,-1,-1,-1,-1,-1};
  //0->1 "-", 1->30 "D", 30->70 "C", 70->120 "B", 120->180 "A", 180->250 "S"
  public int[] weaponEXP = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  public int[] skills = new int[] {-1,-1,-1,-1,-1,-1};
  public int[] skillList = fSL.getSkillList();
  public int kills = -1;
  public int gold = -1;
  public int sex = -1;
  public int marriedID = -1;
  public int[] childOne = new int[] {-1,-1};
  public int[] childTwo = new int[] {-1,-1};
  public int[] childThree = new int[] {-1,-1};
  public boolean isLeader = false;
  public int leadershipStars = 0;
  //ID, Weapon Type, MT, WT, HIT, Inner Range, Outer Range, Rank, Cost, Uses, Kills, Is Equipped?, Skill 1, Skill 2, Bonus Str, Bonus Mag, Bonus Skl, Bonus Spd, Bonus Lck, Bonus Def, Bonus Res, Bonus Move
  public item[] weapons = new item[] {nW,nW,nW,nW,nW,nW,nW};
  
  public int[] bonusStats = new int[10];
  public int attack = -1;
  public int hit = -1;
  public int crit = -1;
  public int avoid = -1;
}