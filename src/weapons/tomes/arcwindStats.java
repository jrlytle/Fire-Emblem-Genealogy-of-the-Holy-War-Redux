package weapons.tomes;
public class arcwindStats
{
  //All Stats:
  //ID, Weapon Type, Weapon Rank, MT, HIT, Kills, Skill One, Skill Two, Skill Three, Bonus Strength, Bonus Magic, Bonus Skill, Bonus Speed, Bonus Luck, Bonus Defense, Bonus Resistance, Bonus Avoid, Bonus Critical Avoid, Buy Cost, Sell Cost, Uses, Min Range, Max Range, Critical
  //Followed up by Broken Weapon Stats
  
  //Remainaing Stats:
  //Is Equipped, Is Dropped, Is Broken, Effect Armor, Effect Beast, Effect Dragon, Effect Flying, Effect Monster, Broken Effect Armor, Broken Effect Beast, Broken Effect Dragon, Broken Effect Flying, Broken Effect Monster
  
  public int[] allStats = new int[]{400,9,2,6,90,0,0,0,0,0,0,0,0,0,0,0,0,0,1320,660,30,1,2,0,450,15,2,10,30,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,1,1,0}; //Cannot use broken book
  public boolean[] remainingStats = new boolean[] {false,false,false,false,false,false,true,false,false,false,false,false,false};
}