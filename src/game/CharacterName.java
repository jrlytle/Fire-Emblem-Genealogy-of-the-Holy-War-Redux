package game;

/**
 *
 * @author jrlytle
 */
//Entered based on starting team and appearance, but kept in groups of Ally, Ally-NPC, enemy, enemy-NPC, and arena
//Generic Enemies are placed at end, also in order of appearance
public class CharacterName
{
  public String getCharName(int charID)
  {
    switch(charID)
    {
      case 0: return "Dummy";
      //ALLY - FE4
      //GEN ONE
      //Prologue
      case 1: return "Sigurd";
      case 2: return "Noish";
      case 3: return "Alec";
      case 4: return "Arden";
      case 5: return "My Unit";
      case 6: return "Azel";
      case 7: return "Lex";
      case 8: return "Cuan";
      case 9: return "Ethlin";
      case 10: return "Fin";
      //Chapter 1
      case 11: return "Dew";
      case 12: return "Adean";
      case 13: return "Diadora";
      //Chapter 2
      case 14: return "Holyn";
      case 15: return "Levin";
      case 16: return "Sylvia";
      //Chapter 3
      case 17: return "Tiltyu";
      case 18: return "Claude";
      case 19: return "Briggid";
      
      //GEN TWO
      //Chapter 6
      case 20: return "Celice";
      case 21: return "Rana";
      case 22: return "Mana";
      case 23: return "Lakche";
      case 24: return "Radney";
      case 25: return "Skasaher";
      case 26: return "Roddlevan";
      case 27: return "Morgan";
      case 28: return "Oifey";
      case 29: return "Delmud";
      case 30: return "Tristan";
      case 31: return "Lester";
      case 32: return "Dimna";
      case 33: return "Julia";
      case 34: return "Fee";
      case 35: return "Femina";
      case 36: return "Arthur";
      case 37: return "Amid";
      //Chapter 7
      case 38: return "Shanan";
      case 39: return "Patty";
      case 40: return "Daisy";
      case 41: return "Leaf";
      case 42: return "Nanna";
      case 43: return "Janne";
      case 44: return "Aless";
      case 45: return "Leen";
      case 46: return "Laylea";
      //Chapter 8
      case 47: return "Sety";
      case 48: return "Hawk";
      //Chapter 9
      case 49: return "Corpul";
      case 50: return "Sharlow";
      
      //NPC - FE4
      //GEN ONE
      //Prologue
      case 51: return "Midayle";
      case 52: return "Alvis";
      //Chapter 1
      case 53: return "Eltshan";
      //Chapter 2
      case 54: return "Lachesis";
      case 55: return "Eve";
      case 56: return "Alva";
      case 57: return "Eva";
      //Chapter 4
      case 58: return "Mahnya";//
      //Chapter 5
      case 59: return "Vylon";//
      case 60: return "Ida";//
      //GEN TWO
      //Chapter 10
      case 61: return "Palmark";//
      
      //ENEMY - FE4
      //GEN ONE
      //Prologue
      case 62: return "Dimaggio";
      case 63: return "Gerrard";
      //Chapter 1
      case 64: return "Ira";
      case 65: return "Kinbois";//
      case 66: return "Gandolf";
      case 67: return "Jamka";
      case 68: return "Sandima";//
      //Chapter 2
      case 69: return "Elliot";//
      case 70: return "Philip";//
      case 71: return "Boldo";//
      case 72: return "Beowulf";
      case 73: return "Macbeth";//
      case 74: return "Voltz";//
      case 75: return "Fury";
      case 76: return "Clement";//
      case 77: return "Zyne";//
      case 78: return "Shagaal";//
      //Chapter 3
      case 79: return "Jacoban";//
      case 80: return "Papilion";//
      case 81: return "Pizarl";//
      case 82: return "Dobarl";//
      //Chapter 4
      case 83: return "Cuvuli";//
      case 84: return "Deet'ver";//Female
      case 85: return "Maios";//
      case 86: return "Pamela";//
      case 87: return "Donovan";//
      case 88: return "Lamia";//
      case 89: return "Daccar";//
      //Chapter 5
      case 90: return "Slayder";//
      case 91: return "Langobalt";//
      case 92: return "Magorn";//
      case 93: return "Vaha";//
      case 94: return "Reptor";//
      //GEN TWO
      //Chapter 6
      case 95: return "Harold";//
      case 96: return "Johalva";
      case 97: return "Johan";
      case 98: return "Schmidt";//
      case 99: return "Danan";//
      case 100: return "Tinny";
      case 101: return "Linda";
      //Chapter 7
      case 102: return "Cutozou";//
      case 103: return "Liza";//
      case 104: return "Ishtore";//
      case 105: return "Jabarro";//
      case 106: return "Bramsel";//
      case 107: return "Faval";
      case 108: return "Asaello";
      case 109: return "Vampa";//
      case 110: return "Eliu";//
      case 111: return "Fetra";
      case 112: return "Blume";
      //Chapter 8
      case 113: return "Muhammed";
      case 114: return "Ovo";
      case 115: return "Ishtar";
      case 116: return "Altenna";
      case 117: return "Coruta";
      case 118: return "Maikov";
      //Chapter 9
      case 119: return "Hannibal";
      case 120: return "Kanatz";
      case 121: return "Disler";
      case 122: return "Musar";
      case 123: return "Juda";
      case 124: return "Areone";
      //Chapter 10
      case 125: return "Ridale";
      case 126: return "Hilda";
      case 127: return "Morigan";
      case 128: return "Julius";
      case 129: return "Zaggam";
      //Final Chapter
      case 130: return "Robert";
      case 131: return "Boyce";
      case 132: return "Rodan";
      case 133: return "Yupheel";
      case 134: return "Fisher";
      case 135: return "Burian";
      case 136: return "Daggon";
      case 137: return "Scorpio";
      case 138: return "Baran";
      case 139: return "Meng";
      case 140: return "Bleg";
      case 141: return "Maybell";
      case 142: return "Manfroy";
      case 143: return "Eins";
      case 144: return "Zwei";
      case 145: return "Drei";
      case 146: return "Vier";
      case 147: return "Funf";
      case 148: return "Sechs";
      case 149: return "Sieben";
      case 150: return "Acht";
      case 151: return "Neun";
      case 152: return "Zehn";
      case 153: return "Elf";
      case 154: return "Zwolf";
      
      //ENEMY-NPC - FE4
      //Chapter 4
      case 155: return "Andre";
      //Chapter 5
      case 156: return "Trabant";
      
      //OTHER/USED ONLY FOR CHILDREN'S STATS
      case 157: return "Grahnye";
      
      //Arena
      //GEN ONE
      //Chapter 1
      //Gazack
      //Crotor
      //Wiseman
      //Shark
      //Hood
      //Bachus
      //Emil
      //Dice
      //Chapter 2
      //Zero
      //Mahatma
      //Rowin
      //Barknin
      //Millet
      //Heltsok
      //Chacof
      //Holyn
      //Keimos
      //Marilyn
      //Chapter 3
      //Tyler
      //Rip
      //Pelio
      //Trevick
      //Geller
      //Bazan
      //Duma
      //Kehela
      //Torton
      //Mario
      //Chapter 4
      //Kemal
      //Kaledin
      //Keith
      //Senghor
      //Nikita
      //Nene
      //Graph
      //Nikias
      //Atlas
      //Chapter 5
      //Shackal
      //Rip (again?)
      //Greias
      //Geese
      //Lee
      //Shisiel
      //Hawks
      //Nazarl
      //Thief
      //GEN ONE
      //Chapter 7
      //Tolstoy
      //Boshimas
      //Kruge
      //Manstein
      //Kashim
      //Heppner
      //Randock
      //Wolf
      //Chapter 8
      //Dewy
      //Fate
      //Malshark
      //Louis
      //Heste
      //Marda
      //Jisment
      //Xenon
      //Jackson
      //Chapter 9
      //Indra
      //Nietzche
      //Apostol
      //Miria
      //Shiron
      //Klein
      //Slayton
      //Triesta
      //Canaan
      //Chapter 10
      //Hasmarn
      //Glanz
      //Krosroy
      //Roland
      //Massigli
      //Riva
      //Gloria
      //Note
      //Indra (again?)
      //Final
      //Dice (again?)
      //Keimos (again?)
      //Marilyn
      //Xenon (again?)
      //Jackson (again?)
      //Torton
      //Mario (again?)
      //Canaan (again?)
      //Atlas (again?)
      //Zeus
      
      case 158: case 159: case 160: case 161: case 162: case 163: case 164: case 165: case 166: case 167: case 168: case 169: case 170: case 171: case 172: case 173: case 174:
      case 175: case 176: case 177: case 178: case 179: case 180: case 181: case 182: case 183: case 184: case 185: case 186: case 187: return "Verdane";
      
      //ALLY - FE5 (For fun)
      
    }
    return "None";
  }
}
