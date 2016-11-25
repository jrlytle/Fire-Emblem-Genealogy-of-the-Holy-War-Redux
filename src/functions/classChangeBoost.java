package functions;
public class classChangeBoost
{
  //BASE STATS:
    public int[] juniorLordBase =    {30,5,0,5,5,0,5,0,6};
    public int[] knightLordBase =    {40,10,0,7,7,0,7,3,9};
    public int[] holyKnightBase =    {50,15,0,9,9,0,9,6,9};
    public int[] tacticianBase =     {16,4,3,5,5,5,3,5,6};
    public int[] strategistBase =    {20,7,6,7,7,7,5,6,7};
    public int[] grandmasterBase =   {24,10,9,9,9,9,7,7,7};
    public int[] cavalierBase =      {30,7,0,6,6,0,6,0,8};
    public int[] paladinBase =       {40,9,5,9,9,0,9,5,9};
    public int[] goldKnightBase =    {50,11,10,12,12,0,12,10,9};
    public int[] greatKnightBase =   {40,10,0,9,9,0,10,4,9};
    public int[] templarKnightBase = {50,13,0,12,12,0,14,8,9};
    public int[] knightBase =        {40,9,0,5,3,0,10,0,5};
    public int[] swordArmorBase =    {40,9,0,5,3,0,10,0,5};
    public int[] lanceArmorBase =    {40,9,0,5,3,0,10,0,5};
    public int[] axeArmorBase =      {40,9,0,5,3,0,10,0,5};
    public int[] bowArmorBase =      {40,9,0,5,3,0,10,0,5};
    public int[] generalBase =       {40,10,0,6,5,0,12,3,5};
    public int[] marshallBase =      {40,11,0,7,7,0,14,6,6};
    public int[] myrmidonBase =      {30,7,0,10,10,0,5,0,6};
    public int[] swordmasterBase =   {40,12,0,15,15,0,7,3,6};
    public int[] truebladeBase =     {50,13,0,17,18,0,8,5,7};
    public int[] assassinBase = {21,8,0,13,12,5,1,6,7};//
    public int[] whispererBase = {26,12,0,18,17,6,3,7,7};//
    public int[] mercenaryBase =     {30,7,0,10,10,0,5,0,6};
    public int[] heroBase =          {40,12,3,12,12,0,7,3,6};
    public int[] vanguardBase =      {50,14,5,14,14,0,8,5,7};
    public int[] fighterBase = {20,8,0,5,5,4,0,5,6};
    public int[] warriorBase = {28,12,0,8,7,7,3,6,6};
    public int[] reaverBase = {36,16,0,11,9,10,6,7,7};
    public int[] brigandBase = {22,8,0,3,8,3,0,5,6};
    public int[] mountainThiefBase = {22,8,0,3,8,3,0,5,6};
    public int[] pirateBase = {30,13,0,5,11,5,1,6,6};
    public int[] berserkerBase = {38,18,0,8,14,7,2,7,7};
    public int[] archerBase = {16,5,0,8,6,5,0,5,6};
    public int[] sniperBase = {20,7,1,12,9,10,3,6,6};
    public int[] marksmanBase = {24,9,2,16,12,15,6,7,7};
    public int[] archKnightBase = {16,5,0,8,6,5,0,7,8};
    public int[] bowKnightBase = {20,7,1,12,9,10,3,8,9};
    public int[] hunterBase = {24,9,2,16,12,15,6,9,9};
    public int[] thiefBase = {16,3,0,6,8,2,0,5,6};
    public int[] tricksterBase ={19,4,4,10,11,3,5,6,6};
    public int[] rogueBase = {22,5,8,14,14,4,10,7,7};
    public int[] pegasusKnightBase = {16,4,2,7,8,4,6,7,8};
    public int[] falconKnightBase = {20,6,3,10,11,6,9,8,9};
    public int[] seraphKnightBase = {24,8,4,13,14,8,12,9,9};
    public int[] darkFlierBase = {19,5,6,8,10,5,9,8,9};
    public int[] demonFlierBase = {22,6,10,9,12,6,12,9,9};
    public int[] wyvernKnightBase = {19,7,0,6,5,8,0,7,8};
    public int[] wyvernLordBase = {24,11,0,8,7,11,3,8,9};
    public int[] dragonMasterBase = {29,15,0,10,9,14,6,9,9};
    public int[] griffonRiderBase = {22,9,0,10,9,8,3,8,9};
    public int[] griffonKnightBase = {25,11,0,14,13,8,6,9,9};
    public int[] mageBase = {16,0,4,3,4,2,3,5,6};
    public int[] sageBase = {20,1,7,5,7,4,5,6,6};
    public int[] archsageBase = {24,2,10,7,10,6,7,7,7};
    public int[] darkKnightBase = {25,4,5,6,5,9,5,8,8};
    public int[] shadowKnightBase = {32,8,7,9,7,15,7,11,9};
    public int[] darkMageBase = {18,1,3,2,3,4,4,5,6};
    public int[] sorcererBase = {23,2,6,4,4,7,7,6,6};
    public int[] necromancerBase = {28,3,9,6,5,10,10,7,7};
    public int[] priestBase = {16,0,3,2,4,1,6,5,6};
    public int[] clericBase = {16,0,3,2,4,1,6,5,6};
    public int[] crusadorBase = {24,5,5,4,6,6,6,6,6};
    public int[] zealotBase = {32,10,7,6,8,11,6,7,7};
    public int[] troubadourBase = {16,0,3,2,5,1,5,7,8};
    public int[] femalePaladinBase = {25,1,9,7,8,6,10,8,9};
    public int[] valkyrieBase = {34,2,15,12,11,11,15,9,9};
    public int[] mageKnightBase = {21,4,6,6,8,8,6,8,9};
    public int[] warlockBase = {26,6,8,8,11,11,7,11,9};
    public int[] witchBase = {26,6,8,8,11,11,7,11,9};
    public int[] fireMageBase = {16,0,4,3,4,2,3,5,6};
    public int[] thunderMageBase = {16,0,4,3,4,2,3,5,6};
    public int[] windMageBase = {16,0,4,3,4,2,3,5,6};
    public int[] mageFighterBase = {21,4,6,6,7,5,6,8,7};
    public int[] battleMageBase = {26,8,8,9,10,8,9,11,7};
    public int[] lightMageBase = {16,0,4,3,4,2,3,5,6};
    public int[] freeKnightBase = {18,6,0,5,6,7,0,7,8};
    public int[] forrestKnightBase = {23,9,0,8,11,10,6,8,9};
    public int[] rangerBase = {28,12,0,11,16,13,12,9,9};
    public int[] lanceKnightBase = {18,6,0,5,6,7,0,7,8};
    public int[] dukeKnightBase = {23,9,0,10,9,10,6,8,9};
    public int[] silverKnightBase = {28,12,0,15,12,13,12,9,9};
    public int[] axeKnightBase = {18,6,0,5,6,7,0,7,8};
    public int[] brutalKnightBase = {23,11,0,8,9,10,6,8,9};
    public int[] deathKnightBase = {28,17,0,11,12,13,8,9,9};
    public int[] soldierBase = {16,3,0,3,3,3,0,5,6};
    public int[] halberdierBase = {21,7,0,7,6,6,5,5,6};
    public int[] sentinelBase = {26,11,0,11,9,9,8,8,7};
    public int[] princeBase = {16,0,3,4,4,3,3,3,6};
    public int[] princessBase = {16,3,0,4,4,3,3,3,6};
    public int[] masterKnightBase = {21,6,6,7,7,6,6,6,9};
    public int[] kingBase = {26,10,9,10,10,9,9,9,9};
    public int[] queenBase = {26,9,10,10,10,9,9,9,9};
    public int[] bardBase = {21,4,6,6,7,5,6,8,6};
    public int[] highPriestBase = {20,1,7,5,7,4,5,6,7};
    public int[] bishopBase = {24,2,10,7,10,6,7,7,7};
    public int[] dreadFighterBase = {22,8,4,7,9,7,10,6,7};
    public int[] brideBase = {21,7,6,11,10,7,6,6,7};
    public int[] villagerBase = {16,1,0,1,1,1,0,5,6};
    public int[] dancerBase = {16,1,1,5,8,3,1,5,7};
    public int[] taguelBase = {18,2,0,4,5,3,2,6,7};
    public int[] manaketeBase = {18,2,0,1,1,2,2,6,7};
    public int[] lodestarBase = {21,9,1,10,10,8,4,6,7};
    public int[] conquerorBase = {24,10,3,9,8,12,5,8,9};
    public int[] baronBase = {38,12,0,10,6,20,8,6,8};
    public int[] emperorBase = {24,2,12,7,11,6,7,9,8};
    public int[] darkBishopBase = {24,2,10,7,10,6,7,7,8};
    public int[] darkPrinceBase = {24,2,10,7,10,6,7,7,7};
    public int[] merchantBase = {25,12,12,12,12,12,12,12,7};
    
    public int getClassBase(int classID, int stat)
    {
      switch(classID)
      {
        case 0: return 0;
        case 1: return juniorLordBase[stat];  
        case 2: return knightLordBase[stat]; 
        case 3: return holyKnightBase[stat]; 
        case 4: return tacticianBase[stat]; 
        case 5: return strategistBase[stat]; 
        case 6: return grandmasterBase[stat]; 
        case 7: return cavalierBase[stat]; 
        case 8: return paladinBase[stat]; 
        case 9: return goldKnightBase[stat]; 
        case 10: return greatKnightBase[stat]; 
        case 11: return templarKnightBase[stat]; 
        case 12: return knightBase[stat]; 
        case 13: return swordArmorBase[stat]; 
        case 14: return lanceArmorBase[stat]; 
        case 15: return axeArmorBase[stat]; 
        case 16: return bowArmorBase[stat]; 
        case 17: return generalBase[stat]; 
        case 18: return marshallBase[stat]; 
        case 19: return myrmidonBase[stat]; 
        case 20: return swordmasterBase[stat]; 
        case 21: return truebladeBase[stat]; 
        case 22: return assassinBase[stat]; 
        case 23: return whispererBase[stat]; 
        case 24: return mercenaryBase[stat]; 
        case 25: return heroBase[stat]; 
        case 26: return vanguardBase[stat]; 
        case 27: return fighterBase[stat]; 
        case 28: return warriorBase[stat]; 
        case 29: return reaverBase[stat]; 
        case 30: return brigandBase[stat]; 
        case 31: return mountainThiefBase[stat]; 
        case 32: return pirateBase[stat]; 
        case 33: return berserkerBase[stat]; 
        case 34: return archerBase[stat]; 
        case 35: return sniperBase[stat]; 
        case 36: return marksmanBase[stat]; 
        case 37: return archKnightBase[stat]; 
        case 38: return bowKnightBase[stat]; 
        case 39: return hunterBase[stat]; 
        case 40: return thiefBase[stat]; 
        case 41: return tricksterBase[stat]; 
        case 42: return rogueBase[stat]; 
        case 43: return pegasusKnightBase[stat]; 
        case 44: return falconKnightBase[stat]; 
        case 45: return seraphKnightBase[stat]; 
        case 46: return darkFlierBase[stat]; 
        case 47: return demonFlierBase[stat]; 
        case 48: return wyvernKnightBase[stat]; 
        case 49: return wyvernLordBase[stat]; 
        case 50: return dragonMasterBase[stat]; 
        case 51: return griffonRiderBase[stat]; 
        case 52: return griffonKnightBase[stat]; 
        case 53: return mageBase[stat]; 
        case 54: return sageBase[stat]; 
        case 55: return archsageBase[stat]; 
        case 56: return darkKnightBase[stat]; 
        case 57: return shadowKnightBase[stat]; 
        case 58: return darkMageBase[stat]; 
        case 59: return sorcererBase[stat]; 
        case 60: return necromancerBase[stat]; 
        case 61: return priestBase[stat]; 
        case 62: return clericBase[stat]; 
        case 63: return crusadorBase[stat]; 
        case 64: return zealotBase[stat]; 
        case 65: return troubadourBase[stat]; 
        case 66: return femalePaladinBase[stat]; 
        case 67: return valkyrieBase[stat]; 
        case 68: return mageKnightBase[stat]; 
        case 69: return warlockBase[stat]; 
        case 70: return witchBase[stat]; 
        case 71: return fireMageBase[stat]; 
        case 72: return thunderMageBase[stat]; 
        case 73: return windMageBase[stat]; 
        case 74: return mageFighterBase[stat]; 
        case 75: return battleMageBase[stat]; 
        case 76: return lightMageBase[stat]; 
        case 77: return freeKnightBase[stat]; 
        case 78: return forrestKnightBase[stat]; 
        case 79: return rangerBase[stat]; 
        case 80: return lanceKnightBase[stat]; 
        case 81: return dukeKnightBase[stat]; 
        case 82: return silverKnightBase[stat]; 
        case 83: return axeKnightBase[stat]; 
        case 84: return brutalKnightBase[stat]; 
        case 85: return deathKnightBase[stat]; 
        case 86: return soldierBase[stat]; 
        case 87: return halberdierBase[stat]; 
        case 88: return sentinelBase[stat]; 
        case 89: return princeBase[stat]; 
        case 90: return princessBase[stat]; 
        case 91: return masterKnightBase[stat]; 
        case 92: return kingBase[stat]; 
        case 93: return queenBase[stat]; 
        case 94: return bardBase[stat]; 
        case 95: return highPriestBase[stat]; 
        case 96: return bishopBase[stat]; 
        case 97: return dreadFighterBase[stat]; 
        case 98: return brideBase[stat]; 
        case 99: return villagerBase[stat]; 
        case 100: return dancerBase[stat]; 
        case 101: return taguelBase[stat]; 
        case 102: return manaketeBase[stat]; 
        case 103: return lodestarBase[stat]; 
        case 104: return conquerorBase[stat]; 
        case 105: return baronBase[stat]; 
        case 106: return emperorBase[stat]; 
        case 107: return darkBishopBase[stat]; 
        case 108: return darkPrinceBase[stat]; 
        case 109: return merchantBase[stat]; 
      }
      return 0;
    }
    
  public int promotionBoost(int oldClass, int newClass, int stat)
  {
    int baseOne = 0;
    int baseTwo = 0;
    int statBoost;
    
    switch(oldClass)
    {
      case 0: break; //Dummy can't change class
      case 1: baseOne = juniorLordBase[stat]; break; 
      case 2: baseOne = knightLordBase[stat]; break;
      case 3: baseOne = holyKnightBase[stat]; break;
      case 4: baseOne = tacticianBase[stat]; break;
      case 5: baseOne = strategistBase[stat]; break;
      case 6: baseOne = grandmasterBase[stat]; break;
      case 7: baseOne = cavalierBase[stat]; break;
      case 8: baseOne = paladinBase[stat]; break;
      case 9: baseOne = goldKnightBase[stat]; break;
      case 10: baseOne = greatKnightBase[stat]; break;
      case 11: baseOne = templarKnightBase[stat]; break;
      case 12: baseOne = knightBase[stat]; break;
      case 13: baseOne = swordArmorBase[stat]; break;
      case 14: baseOne = lanceArmorBase[stat]; break;
      case 15: baseOne = axeArmorBase[stat]; break;
      case 16: baseOne = bowArmorBase[stat]; break;
      case 17: baseOne = generalBase[stat]; break;
      case 18: baseOne = marshallBase[stat]; break;
      case 19: baseOne = myrmidonBase[stat]; break;
      case 20: baseOne = swordmasterBase[stat]; break;
      case 21: baseOne = truebladeBase[stat]; break;
      case 22: baseOne = assassinBase[stat]; break;
      case 23: baseOne = whispererBase[stat]; break;
      case 24: baseOne = mercenaryBase[stat]; break;
      case 25: baseOne = heroBase[stat]; break;
      case 26: baseOne = vanguardBase[stat]; break;
      case 27: baseOne = fighterBase[stat]; break;
      case 28: baseOne = warriorBase[stat]; break;
      case 29: baseOne = reaverBase[stat]; break;
      case 30: baseOne = brigandBase[stat]; break;
      case 31: baseOne = mountainThiefBase[stat]; break;
      case 32: baseOne = pirateBase[stat]; break;
      case 33: baseOne = berserkerBase[stat]; break;
      case 34: baseOne = archerBase[stat]; break;
      case 35: baseOne = sniperBase[stat]; break;
      case 36: baseOne = marksmanBase[stat]; break;
      case 37: baseOne = archKnightBase[stat]; break;
      case 38: baseOne = bowKnightBase[stat]; break;
      case 39: baseOne = hunterBase[stat]; break;
      case 40: baseOne = thiefBase[stat]; break;
      case 41: baseOne = tricksterBase[stat]; break;
      case 42: baseOne = rogueBase[stat]; break;
      case 43: baseOne = pegasusKnightBase[stat]; break;
      case 44: baseOne = falconKnightBase[stat]; break;
      case 45: baseOne = seraphKnightBase[stat]; break;
      case 46: baseOne = darkFlierBase[stat]; break;
      case 47: baseOne = demonFlierBase[stat]; break;
      case 48: baseOne = wyvernKnightBase[stat]; break;
      case 49: baseOne = wyvernLordBase[stat]; break;
      case 50: baseOne = dragonMasterBase[stat]; break;
      case 51: baseOne = griffonRiderBase[stat]; break;
      case 52: baseOne = griffonKnightBase[stat]; break;
      case 53: baseOne = mageBase[stat]; break;
      case 54: baseOne = sageBase[stat]; break;
      case 55: baseOne = archsageBase[stat]; break;
      case 56: baseOne = darkKnightBase[stat]; break;
      case 57: baseOne = shadowKnightBase[stat]; break;
      case 58: baseOne = darkMageBase[stat]; break;
      case 59: baseOne = sorcererBase[stat]; break;
      case 60: baseOne = necromancerBase[stat]; break;
      case 61: baseOne = priestBase[stat]; break;
      case 62: baseOne = clericBase[stat]; break;
      case 63: baseOne = crusadorBase[stat]; break;
      case 64: baseOne = zealotBase[stat]; break;
      case 65: baseOne = troubadourBase[stat]; break;
      case 66: baseOne = femalePaladinBase[stat]; break;
      case 67: baseOne = valkyrieBase[stat]; break;
      case 68: baseOne = mageKnightBase[stat]; break;
      case 69: baseOne = warlockBase[stat]; break;
      case 70: baseOne = witchBase[stat]; break;
      case 71: baseOne = fireMageBase[stat]; break;
      case 72: baseOne = thunderMageBase[stat]; break;
      case 73: baseOne = windMageBase[stat]; break;
      case 74: baseOne = mageFighterBase[stat]; break;
      case 75: baseOne = battleMageBase[stat]; break;
      case 76: baseOne = lightMageBase[stat]; break;
      case 77: baseOne = freeKnightBase[stat]; break;
      case 78: baseOne = forrestKnightBase[stat]; break;
      case 79: baseOne = rangerBase[stat]; break;
      case 80: baseOne = lanceKnightBase[stat]; break;
      case 81: baseOne = dukeKnightBase[stat]; break;
      case 82: baseOne = silverKnightBase[stat]; break;
      case 83: baseOne = axeKnightBase[stat]; break;
      case 84: baseOne = brutalKnightBase[stat]; break;
      case 85: baseOne = deathKnightBase[stat]; break;
      case 86: baseOne = soldierBase[stat]; break;
      case 87: baseOne = halberdierBase[stat]; break;
      case 88: baseOne = sentinelBase[stat]; break;
      case 89: baseOne = princeBase[stat]; break;
      case 90: baseOne = princessBase[stat]; break;
      case 91: baseOne = masterKnightBase[stat]; break;
      case 92: baseOne = kingBase[stat]; break;
      case 93: baseOne = queenBase[stat]; break;
      case 94: baseOne = bardBase[stat]; break;
      case 95: baseOne = highPriestBase[stat]; break;
      case 96: baseOne = bishopBase[stat]; break;
      case 97: baseOne = dreadFighterBase[stat]; break;
      case 98: baseOne = brideBase[stat]; break;
      case 99: baseOne = villagerBase[stat]; break;
      case 100: baseOne = dancerBase[stat]; break;
      case 101: baseOne = taguelBase[stat]; break;
      case 102: baseOne = manaketeBase[stat]; break;
      case 103: baseOne = lodestarBase[stat]; break;
      case 104: baseOne = conquerorBase[stat]; break;
      case 105: baseOne = baronBase[stat]; break;
      case 106: baseOne = emperorBase[stat]; break;
      case 107: baseOne = darkBishopBase[stat]; break;
      case 108: baseOne = darkPrinceBase[stat]; break;
      case 109: baseOne = merchantBase[stat]; break;
    }
    switch(newClass)
    {
      case 0: break; //Dummy can't change class
      case 1: baseTwo = juniorLordBase[stat]; break; 
      case 2: baseTwo = knightLordBase[stat]; break;
      case 3: baseTwo = holyKnightBase[stat]; break;
      case 4: baseTwo = tacticianBase[stat]; break;
      case 5: baseTwo = strategistBase[stat]; break;
      case 6: baseTwo = grandmasterBase[stat]; break;
      case 7: baseTwo = cavalierBase[stat]; break;
      case 8: baseTwo = paladinBase[stat]; break;
      case 9: baseTwo = goldKnightBase[stat]; break;
      case 10: baseTwo = greatKnightBase[stat]; break;
      case 11: baseTwo = templarKnightBase[stat]; break;
      case 12: baseTwo = knightBase[stat]; break;
      case 13: baseTwo = swordArmorBase[stat]; break;
      case 14: baseTwo = lanceArmorBase[stat]; break;
      case 15: baseTwo = axeArmorBase[stat]; break;
      case 16: baseTwo = bowArmorBase[stat]; break;
      case 17: baseTwo = generalBase[stat]; break;
      case 18: baseTwo = marshallBase[stat]; break;
      case 19: baseTwo = myrmidonBase[stat]; break;
      case 20: baseTwo = swordmasterBase[stat]; break;
      case 21: baseTwo = truebladeBase[stat]; break;
      case 22: baseTwo = assassinBase[stat]; break;
      case 23: baseTwo = whispererBase[stat]; break;
      case 24: baseTwo = mercenaryBase[stat]; break;
      case 25: baseTwo = heroBase[stat]; break;
      case 26: baseTwo = vanguardBase[stat]; break;
      case 27: baseTwo = fighterBase[stat]; break;
      case 28: baseTwo = warriorBase[stat]; break;
      case 29: baseTwo = reaverBase[stat]; break;
      case 30: baseTwo = brigandBase[stat]; break;
      case 31: baseTwo = mountainThiefBase[stat]; break;
      case 32: baseTwo = pirateBase[stat]; break;
      case 33: baseTwo = berserkerBase[stat]; break;
      case 34: baseTwo = archerBase[stat]; break;
      case 35: baseTwo = sniperBase[stat]; break;
      case 36: baseTwo = marksmanBase[stat]; break;
      case 37: baseTwo = archKnightBase[stat]; break;
      case 38: baseTwo = bowKnightBase[stat]; break;
      case 39: baseTwo = hunterBase[stat]; break;
      case 40: baseTwo = thiefBase[stat]; break;
      case 41: baseTwo = tricksterBase[stat]; break;
      case 42: baseTwo = rogueBase[stat]; break;
      case 43: baseTwo = pegasusKnightBase[stat]; break;
      case 44: baseTwo = falconKnightBase[stat]; break;
      case 45: baseTwo = seraphKnightBase[stat]; break;
      case 46: baseTwo = darkFlierBase[stat]; break;
      case 47: baseTwo = demonFlierBase[stat]; break;
      case 48: baseTwo = wyvernKnightBase[stat]; break;
      case 49: baseTwo = wyvernLordBase[stat]; break;
      case 50: baseTwo = dragonMasterBase[stat]; break;
      case 51: baseTwo = griffonRiderBase[stat]; break;
      case 52: baseTwo = griffonKnightBase[stat]; break;
      case 53: baseTwo = mageBase[stat]; break;
      case 54: baseTwo = sageBase[stat]; break;
      case 55: baseTwo = archsageBase[stat]; break;
      case 56: baseTwo = darkKnightBase[stat]; break;
      case 57: baseTwo = shadowKnightBase[stat]; break;
      case 58: baseTwo = darkMageBase[stat]; break;
      case 59: baseTwo = sorcererBase[stat]; break;
      case 60: baseTwo = necromancerBase[stat]; break;
      case 61: baseTwo = priestBase[stat]; break;
      case 62: baseTwo = clericBase[stat]; break;
      case 63: baseTwo = crusadorBase[stat]; break;
      case 64: baseTwo = zealotBase[stat]; break;
      case 65: baseTwo = troubadourBase[stat]; break;
      case 66: baseTwo = femalePaladinBase[stat]; break;
      case 67: baseTwo = valkyrieBase[stat]; break;
      case 68: baseTwo = mageKnightBase[stat]; break;
      case 69: baseTwo = warlockBase[stat]; break;
      case 70: baseTwo = witchBase[stat]; break;
      case 71: baseTwo = fireMageBase[stat]; break;
      case 72: baseTwo = thunderMageBase[stat]; break;
      case 73: baseTwo = windMageBase[stat]; break;
      case 74: baseTwo = mageFighterBase[stat]; break;
      case 75: baseTwo = battleMageBase[stat]; break;
      case 76: baseTwo = lightMageBase[stat]; break;
      case 77: baseTwo = freeKnightBase[stat]; break;
      case 78: baseTwo = forrestKnightBase[stat]; break;
      case 79: baseTwo = rangerBase[stat]; break;
      case 80: baseTwo = lanceKnightBase[stat]; break;
      case 81: baseTwo = dukeKnightBase[stat]; break;
      case 82: baseTwo = silverKnightBase[stat]; break;
      case 83: baseTwo = axeKnightBase[stat]; break;
      case 84: baseTwo = brutalKnightBase[stat]; break;
      case 85: baseTwo = deathKnightBase[stat]; break;
      case 86: baseTwo = soldierBase[stat]; break;
      case 87: baseTwo = halberdierBase[stat]; break;
      case 88: baseTwo = sentinelBase[stat]; break;
      case 89: baseTwo = princeBase[stat]; break;
      case 90: baseTwo = princessBase[stat]; break;
      case 91: baseTwo = masterKnightBase[stat]; break;
      case 92: baseTwo = kingBase[stat]; break;
      case 93: baseTwo = queenBase[stat]; break;
      case 94: baseTwo = bardBase[stat]; break;
      case 95: baseTwo = highPriestBase[stat]; break;
      case 96: baseTwo = bishopBase[stat]; break;
      case 97: baseTwo = dreadFighterBase[stat]; break;
      case 98: baseTwo = brideBase[stat]; break;
      case 99: baseTwo = villagerBase[stat]; break;
      case 100: baseTwo = dancerBase[stat]; break;
      case 101: baseTwo = taguelBase[stat]; break;
      case 102: baseTwo = manaketeBase[stat]; break;
      case 103: baseTwo = lodestarBase[stat]; break;
      case 104: baseTwo = conquerorBase[stat]; break;
      case 105: baseTwo = baronBase[stat]; break;
      case 106: baseTwo = emperorBase[stat]; break;
      case 107: baseTwo = darkBishopBase[stat]; break;
      case 108: baseTwo = darkPrinceBase[stat]; break;
      case 109: baseTwo = merchantBase[stat]; break;
    }
    statBoost = baseTwo - baseOne;
    return statBoost;
  }
}