package game;

/**
 *
 * @author jrlytle
 */
public class ClassName
{
  public String getClassName(int classID)
  {
    switch(classID)
    {
      //Dummy
      //Junior Lord -> Knight Lord -> Holy Knight
      //Tactician -> Strategist -> Grandmaster
      //Cavalier -> Paladin -> Gold Knight
      //         -> Great Knight -> Templar Knight
      //Free Knight -> Forrest Knight -> Ranger
      //            -> Paladin -> Gold Knight
      //Lance Knight -> Duke Knight -> Silver Knight
      //             -> Paladin -> Gold Knight
      //Axe Knight -> Brutal Knight -> Death Knight
      //           -> Paladin -> Gold Knight
      //Arch Knight -> Bow Knight -> Hunter
      //            -> Sniper -> Marksman
      //Sword Armor -> General -> Marshall
      //            -> Great Knight -> Templar Knight
      //Lance Armor -> General -> Marshall
      //            -> Great Knight -> Templar Knight
      //Axe Armor -> General -> Marshall
      //          -> Great Knight -> Templar Knight
      //Bow Armor -> General -> Marshall
      //          -> Great Knight -> Templar Knight
      //Myrmidon -> Swordmaster -> Trueblade
      //         -> Master Of Arms -> 
      //Mercenary -> Hero -> Vanguard
      //          -> Bow Knight -> Hunter
      //Thief -> Assassin -> Whisper
      //      -> Trickster -> Rogue
      //Spear Fighter -> Spear Master ->
      //              -> Halberdier -> Sentinel
      //Solder -> Halberdier -> Sentinel
      //       -> Spear Master ->
      //Lancer -> Spear Master ->
      //       -> Halberdier -> Sentinel
      //Villager -> Merchant ->
      //         -> Master Of Arms ->
      //Fighter -> Warrior -> Reaver
      //        -> Hero -> Vanguard
      //Brigand -> Pirate -> Berserker
      //        -> Warrior -> Reaver
      //Mountain Thief -> Pirate -> Berserker
      //               -> Warrior -> Reaver
      //Oni Savage -> Oni Cheiftan -> 
      //           -> Blacksmith -> 
      //Archer -> Sniper -> Marksman
      //       -> Bow Knight -> Hunter
      //Outlaw -> Adventurer ->
      //       -> Bow Knight -> Hunter
      //Ninja -> Master Ninja -> 
      //      -> Mechanist ->
      //Pegasus Knight -> Falcon Knight -> Seraph Knight
      //               -> Kinshi Knight ->
      //Wyvern Rider -> Wyvern Lord -> Dragon Master
      //             -> Malig Knight -> Demon Knight
      //Mage -> Sage -> Archsage
      //     -> Mage Knight -> 
      //Fire Mage -> Mage Fighter -> Battle Mage
      //          -> Mage Knight -> 
      //Thunder Mage -> Mage Fighter -> Battle Mage
      //             -> Mage Knight ->
      //Wind Mage -> Mage Fighter -> Battle Mage
      //          -> Mage Knight -> 
      //Light Mage -> Sage -> Archsage
      //           -> Mage Knight ->
      //Dark Mage -> Sorcerer -> Necromancer
      //          -> Dark Knight -> Shadow Knight
      //Diviner -> Onmyoji ->
      //        -> Basara ->
      //Bard -> Sage -> Archsage
      //     -> Dark Knight -> Shadow Knight
      //Priest -> Great Master ->
      //       -> High Priest -> Bishop
      //Cleric -> Priestess ->
      //       -> Onmyoji -> 
      //Troubadour -> Strategist -> Valkyrie
      //           -> Paladin -> Gold Knight
      //Prince -> Master Knight -> King
      //Princess -> Master Knight -> Queen
      //Kitsune -> Nine Tails ->
      //Wolfskin -> Wolfssegner ->
      
      //KEY:
      //Class Name //Old ID //Alternate Name
      
      //FIRST TIER:
      case 0:  return "Dummy"; //0
      case 1:  return "Junior Lord"; //1
      case 2:  return "Tactician"; //4
      case 3:  return "Cavalier"; //7
      case 4:  return "Free Knight"; //77
      case 5:  return "Lance Knight"; //80
      case 6:  return "Axe Knight"; //83
      case 7:  return "Arch Knight"; //37
      case 8:  return "Sword Armor"; //13
      case 9:  return "Lance Armor"; //14
      case 10: return "Axe Armor"; //15
      case 11: return "Bow Armor"; //16
      case 12: return "Myrmidon"; //19 //Samurai
      case 13: return "Mercenary"; //24
      case 14: return "Thief"; //40
      case 15: return "Spear Fighter"; //132
      case 16: return "Soldier"; //86
      case 17: return "Lancer"; //114
      case 18: return "Villager"; //99
      case 19: return "Fighter"; //27
      case 20: return "Brigand"; //30
      case 21: return "Mountain Thief"; //31
      case 22: return "Oni Savage"; //129
      case 23: return "Archer"; //34
      case 24: return "Outlaw"; //123
      case 25: return "Apothecary";
      case 26: return "Ninja"; //140
      case 27: return "Pegasus Knight"; //43 //Sky Knight
      case 28: return "Wyvern Rider"; //48
      case 29: return "Mage"; //53
      case 30: return "Fire Mage"; //71
      case 31: return "Thunder Mage"; //72
      case 32: return "Wind Mage"; //73
      case 33: return "Light Mage"; //76
      case 34: return "Dark Mage"; //58
      case 35: return "Diviner"; //135
      case 36: return "Bard"; //94
      case 37: return "Priest"; //61 //Monk
      case 38: return "Cleric"; //62 //Shrine Maiden
      case 39: return "Troubadour"; //65
      case 40: return "Prince"; //89
      case 41: return "Princess"; //90
      case 42: return "Kitsune"; //110
      case 43: return "Wolfskin"; //112
      
      //SECOND TIER:
      case 44: return "Knight Lord"; //2
      case 45: return "Strategist"; //5
      case 46: return "Paladin"; //8
      case 47: return "Paladin"; //66 (Female Paladin with staff use)
      case 48: return "Great Knight"; //10
      case 49: return "Forrest Knight"; //78
      case 50: return "Duke Knight"; //81
      case 51: return "Brutal Knight"; //84
      case 52: return "Bow Knight"; //38
      case 53: return "Sniper"; //35
      case 54: return "General"; //17
      case 55: return "Swordmaster"; //20
      case 56: return "Master Of Arms"; //128
      case 57: return "Hero"; //25
      case 58: return "Assassin"; //22
      case 59: return "Trickster"; //41
      case 60: return "Spear Master"; //133
      case 61: return "Halberdier"; //87
      case 62: return "Merchant"; //109
      case 63: return "Warrior"; //28
      case 64: return "Pirate"; //32
      case 65: return "Oni Cheiftan"; //130
      case 66: return "Blacksmith"; //131
      case 67: return "Adventurer"; //124
      case 68: return "Master Ninja"; //141
      case 69: return "Mechanist"; //142
      case 70: return "Falcon Knight"; //44
      case 71: return "Kinshi Knight"; //139
      case 72: return "Wyvern Lord"; //49
      case 73: return "Malig Knight"; //125
      case 74: return "Sage"; //54
      case 75: return "Mage Knight"; //68
      case 76: return "Mage Fighter"; //74
      case 77: return "Sorcerer"; //59
      case 78: return "Dark Knight"; //56
      case 79: return "High Priest"; //95
      case 80: return "Onmyoji"; //136
      case 81: return "Basara"; //134
      case 82: return "Great Master"; //137
      case 83: return "Priestess";
      case 84: return "Strategist";
      case 85: return "Master Knight"; //91
      case 86: return "Nine-Tails"; //111
      case 87: return "Wolfssegner"; //113
      
      //THIRD TIER:
      case 88: return "Holy Knight"; //3
      case 89: return "Grandmaster"; //6
      case 90: return "Gold Knight"; //9
      case 91: return "Templar Knight"; //11
      case 92: return "Ranger"; //79
      case 93: return "Silver Knight"; //82
      case 94: return "Death Knight"; //85
      case 95: return "Hunter"; //39
      case 96: return "Marksman"; //36
      case 97: return "Marshall"; //18
      case 98: return "Trueblade"; //21
      case 99: return ""; //Master of Arms Promotion
      case 100: return "Vanguard"; //26
      case 101: return "Whisper"; //23
      case 102: return ""; //Trickster Promotion
      case 103: return ""; //Spear Master Promotion
      case 104: return "Sentinel"; //88
      case 105: return ""; //Merchant Promotion
      case 106: return "Reaver"; //29
      case 107: return "Berserker"; //33
      case 108: return ""; //Oni Cheiftan Promotion
      case 109: return ""; //Blacksmith Promotion
      case 110: return "Rogue"; //Adventurer Promotion
      case 111: return ""; //Master Ninja Promotion
      case 112: return ""; //Mechanist Promotion
      case 113: return "Seraph Knight"; //45
      case 114: return ""; //Kinshi Knight Promotion
      case 115: return "Dragon Master"; //50
      case 116: return "Demon Knight"; //47
      case 117: return "Archsage"; //55
      case 118: return ""; //Mage Knight Promotion
      case 119: return "Battle Mage"; //75
      case 120: return "Necromancer"; //60
      case 121: return "Shadow Knight"; //57
      case 122: return "Bishop";
      case 123: return ""; //Onmyoji Promotion
      case 124: return ""; //Basara Promotion
      case 125: return "Zealot"; //Great Master Promotion
      case 126: return ""; //Priestess Promotion
      case 127: return "Valkyrie"; //67
      case 128: return "King"; //92
      case 129: return "Queen"; //93
      case 130: return ""; //Nine Tails Promotion
      case 131: return ""; //Wolfssegner Promotion
      
      //OTHER:
      case 132: return "Dark Flier"; //Uses Promotion item
      case 133: return "Witch"; //Uses Promotion item (Female Only)
      case 134: return "Dread Fighter"; //Uses Promotion item
      case 135: return "Bride"; //Uses Promotion item (Female Only)
      case 136: return "Dancer";
      case 137: return "Taguel";
      case 138: return "Manakete";
      case 139: return "Lodestar"; //Uses Promotion item (Male Only)
      case 140: return "Great Lord"; //Uses Promotion item (female Only)
      case 141: return "Conqueror";
      case 142: return "Baron"; //105
      case 143: return "Emperor";
      case 144: return "Dark Bishop"; //107
      case 145: return "Dark Prince";
      case 146: return "Faceless";
      case 147: return "Stoneborn";
      case 148: return "Automaton";
      case 149: return "Feral Dragon";
      case 150: return "Astral Dragon";
      case 151: return "Blight Dragon";
      case 152: return "Silent Dragon";
      case 153: return "Empty Vessel";
      
      /*case 126: return "Maid";
      case 127: return "Butler";*/
    }
    return "None";
  }
}
