package weapons.axes;
public class fugasClubStats //After battle, stats are reduced (Strength -2, Skill -2), effects can stack, recover 1 point per turn
{
  //All Stats:
  //ID, Weapon Type, Weapon Rank, MT, HIT, Kills, Skill One, Skill Two, Skill Three, Bonus Strength, Bonus Magic, Bonus Skill, Bonus Speed, Bonus Luck, Bonus Defense, Bonus Resistance, Bonus Avoid, Bonus Critical Avoid, Buy Cost, Sell Cost, Uses, Min Range, Max Range, Critical
  //Followed up by Broken Weapon Stats
  
  //Remainaing Stats:
  //Is Equipped, Is Dropped, Is Broken, Effect Armor, Effect Beast, Effect Dragon, Effect Flying, Effect Monster, Broken Effect Armor, Broken Effect Beast, Broken Effect Dragon, Broken Effect Flying, Broken Effect Monster
  
  public int[] allStats = new int[]{223,3,3,13,80,0,0,0,0,0,0,0,3,0,-3,-3,0,0,4000,2000,50,1,1,5,231,3,3,0,30,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,1,1,0};
  public boolean[] remainingStats = new boolean[] {false,false,false,false,false,false,false,false,false,false,false,false,false};
}