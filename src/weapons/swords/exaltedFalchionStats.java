package weapons.swords;
public class exaltedFalchionStats //Chrom, Marth, or Lodestar only - May change later, use to restore 10 HP
{
  //All Stats:
  //ID, Weapon Type, Weapon Rank, MT, HIT, Kills, Skill One, Skill Two, Skill Three, Bonus Strength, Bonus Magic, Bonus Skill, Bonus Speed, Bonus Luck, Bonus Defense, Bonus Resistance, Bonus Avoid, Bonus Critical Avoid, Buy Cost, Sell Cost, Uses, Min Range, Max Range, Critical
  //Followed up by Broken Weapon Stats
  
  //Remainaing Stats:
  //Is Equipped, Is Dropped, Is Broken, Effect Armor, Effect Beast, Effect Dragon, Effect Flying, Effect Monster, Broken Effect Armor, Broken Effect Beast, Broken Effect Dragon, Broken Effect Flying, Broken Effect Monster
  
  public int[] allStats = new int[]{41,1,6,13,85,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,-1,1,1,10,41,1,6,15,80,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,1,1,10};
  public boolean[] remainingStats = new boolean[] {false,false,false,false,false,true,false,false,false,false,false,false,false};
}