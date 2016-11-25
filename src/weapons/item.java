package weapons;
public class item
{
  //id, type, rank, might, hit, 
  //kills, skillOne, skillTwo, skillThree, bonusStrength, 
  //bonusMagic, bonusSkill, bonusSpeed, bonusLuck, bonusDefense, 
  //bonusResistance, bonusAvoid, bonusCriticalAvoid, buyCost, sellCost,  
  //uses, minRange, maxRange, critical, brokenId,  
  //brokenType, brokenRank, brokenMight, brokenHit, brokenKills,  
  //brokenSkillOne, brokenSkillTwo, brokenSkillThree, brokenBonusStrength, brokenBonusMagic, 
  //brokenBonusSkill, brokenBonusSpeed, brokenBonusLuck, brokenBonusDefense, brokenBonusResistance, 
  //brokenAvoid, brokenCriticalAvoid, brokenBuyCost, brokenSellCost, brokenUses, 
  //brokenMinRange, brokenMaxRange, brokenCritical
  int[] allStats = new int[48];
  boolean[] remainingStats = new boolean[13];
  //isEquipped, isDropped, isBroken, effectArmor, effectBeast, 
  //effectDragon, effectFlying, effectMonster, brokenEffectArmor, brokenEffectBeast, 
  //brokenEffectDragon, brokenEffectFlying, brokenEffectMonster
  public item(int[] allStats, boolean[] remainingStats)
  {
    this.allStats = allStats;
    this.remainingStats = remainingStats;
  }
  public int getID()
  {
    if(remainingStats[2])
      return allStats[24];
    else
      return allStats[0];
  }
  public int getType()
  {
    if(remainingStats[2])
      return allStats[25];
    else
      return allStats[1];
  }
  public int getRank()
  {
    if(remainingStats[2])
      return allStats[26];
    else
      return allStats[2];
  }
  public int getMight()
  {
    if(remainingStats[2])
      return allStats[27];
    else
      return allStats[3];
  }
  public int getHit()
  {
    if(remainingStats[2])
      return allStats[28];
    else
      return allStats[4];
  }
  public int getKills()
  {
    if(remainingStats[2])
      return allStats[29];
    else
      return allStats[5];
  }
  public int getSkillOne()
  {
    if(remainingStats[2])
      return allStats[30];
    else
      return allStats[6];
  }
  public int getSkillTwo()
  {
    if(remainingStats[2])
      return allStats[31];
    else
      return allStats[7];
  }
  public int getSkillThree()
  {
    if(remainingStats[2])
      return allStats[32];
    else
      return allStats[8];
  }
  public int getBonusStrength()
  {
    if(remainingStats[2])
      return allStats[33];
    else
      return allStats[9];
  }
  public int getBonusMagic()
  {
    if(remainingStats[2])
      return allStats[34];
    else
      return allStats[10];
  }
  public int getBonusSkill()
  {
    if(remainingStats[2])
      return allStats[35];
    else
      return allStats[11];
  }
  public int getBonusSpeed()
  {
    if(remainingStats[2])
      return allStats[36];
    else
      return allStats[12];
  }
  public int getBonusLuck()
  {
    if(remainingStats[2])
      return allStats[37];
    else
      return allStats[13];
  }
  public int getBonusDefense()
  {
    if(remainingStats[2])
      return allStats[38];
    else
      return allStats[14];
  }
  public int getBonusResistance()
  {
    if(remainingStats[2])
      return allStats[39];
    else
      return allStats[15];
  }
  public int getBonusAvoid()
  {
    if(remainingStats[2])
      return allStats[40];
    else
      return allStats[16];
  }
  public int getBonusCritAvoid()
  {
    if(remainingStats[2])
      return allStats[41];
    else
      return allStats[17];
  }
  public int getBuyCost()
  {
    if(remainingStats[2])
      return allStats[42];
    else
      return allStats[18];
  }
  public int getSellCost()
  {
    if(remainingStats[2])
      return allStats[43];
    else
      return allStats[19];
  }
  public int getUses()
  {
    if(remainingStats[2])
      return allStats[44];
    else
      return allStats[20];
  }
  public int getMinRange()
  {
    if(remainingStats[2])
      return allStats[45];
    else
      return allStats[21];
  }
  public int getMaxRange()
  {
    if(remainingStats[2])
      return allStats[46];
    else
      return allStats[22];
  }
  public int getCritical()
  {
    if(remainingStats[2])
      return allStats[47];
    else
      return allStats[23];
  }
  public boolean getIsEquipped()
  {
    return remainingStats[0];
  }
  public boolean getIsDropped()
  {
    return remainingStats[1];
  }
  public boolean getIsBroken()
  {
    return remainingStats[2];
  }
  public boolean getEffectArmor()
  {
    if(remainingStats[2])
      return remainingStats[8];
    else
      return remainingStats[3];
  }
  public boolean getEffectBeast()
  {
    if(remainingStats[2])
      return remainingStats[9];
    else
      return remainingStats[4];
  }
  public boolean getEffectDragon()
  {
    if(remainingStats[2])
      return remainingStats[10];
    else
      return remainingStats[5];
  }
  public boolean getEffectFlying()
  {
    if(remainingStats[2])
      return remainingStats[11];
    else
      return remainingStats[6];
  }
  public boolean getEffectMonster()
  {
    if(remainingStats[2])
      return remainingStats[12];
    else
      return remainingStats[7];
  }
  
  public void setMight(int val)
  {
    if(!remainingStats[2])
      allStats[3] = val;
    //else
      //Replace with on screen error - Cannot forge broken weapon
  }
  public void setHit(int val)
  {
    if(!remainingStats[2])
      allStats[4] = val;
    //else
      //Replace with on screen error - Cannot forge broken weapon
  }
  public void setKills(int val)
  {
    if(!remainingStats[2])
      allStats[5] = val;
    //else
      //Replace with on screen error - Cannot change broken weapon
  }
  public void setSkillOne(int val)
  {
    if(!remainingStats[2])
      allStats[6] = val;
    //else
      //Replace with on screen error - Cannot change broken weapon
  }
  public void setSkillTwo(int val)
  {
    if(!remainingStats[2])
      allStats[7] = val;
    //else
      //Replace with on screen error - Cannot change broken weapon
  }
  public void setSkillThree(int val)
  {
    if(!remainingStats[2])
      allStats[8] = val;
    //else
      //Replace with on screen error - Cannot change broken weapon
  }
  public void setSellCost(int val)
  {
    if(!remainingStats[2])
      allStats[19] = val;
    //else
      //Replace with on screen error - Cannot change broken weapon
  }
  public void setUses(int val)
  {
    if(!remainingStats[2])
      allStats[20] = val;
    //else
      //Replace with on screen error - Cannot change broken weapon
  }
  public void setIsEquipped(boolean val)
  {
    remainingStats[0] = val;
  }
  public void setIsDropped(boolean val)
  {
    remainingStats[1] = val;
  }
  public void setIsBroken(boolean val)
  {
    remainingStats[2] = val;
  }
}