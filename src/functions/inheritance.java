package functions;
import game.*;
import java.util.Random;
public class inheritance
{
  public genCharacter getSpouse(int spouseID)//Added every character...just in case
  {
    characterDatabaseGenOne cD1 = new characterDatabaseGenOne();
    //characterDatabaseGenTwo cD2 = new characterDatabaseGenTwo();
    switch(spouseID)
    {
      case 1: return cD1.sigurd;
      case 2: return cD1.noish;
      case 3: return cD1.alec;
      case 4: return cD1.arden;
      case 5: return cD1.myUnit;
      case 6: return cD1.azel;
      case 7: return cD1.lex;
      case 8: return cD1.cuan;
      case 9: return cD1.ethlin;
      case 10: return cD1.fin;
      case 11: return cD1.dew;
      case 12: return cD1.adean;
      case 13: return cD1.diadora;
      case 14: return cD1.holyn;
      case 15: return cD1.levin;
      case 16: return cD1.sylvia;
      case 17: return cD1.tiltyu;
      case 18: return cD1.claude;
      case 19: return cD1.briggid;
      /*case 20: return cD2.celice;
      case 21: return cD2.ranaMana;
      case 22: return cD2.ranaMana;
      case 23: return cD2.lakcheRadney;
      case 24: return cD2.lakcheRadney;
      case 25: return cD2.skasaherRoddlevan;
      case 26: return cD2.skasaherRoddlevan;
      case 27: return cD2.morgan;
      case 28: return cD2.oifey;
      case 29: return cD2.delmudTristan;
      case 30: return cD2.delmudTristan;
      case 31: return cD2.lesterDimna;
      case 32: return cD2.lesterDimna;
      case 33: return cD2.julia;
      case 34: return cD2.feeFemina;
      case 35: return cD2.feeFemina;
      case 36: return cD2.arthurAmid;
      case 37: return cD2.arthurAmid;
      case 38: return cD2.shanan;
      case 39: return cD2.pattyDaisy;
      case 40: return cD2.pattyDaisy;
      case 41: return cD2.leaf;
      case 42: return cD2.nannaJanne;
      case 43: return cD2.nannaJanne;
      case 44: return cD2.aless;
      case 45: return cD2.leenLaylea;
      case 46: return cD2.leenLaylea;
      case 47: return cD2.setyHawk;
      case 48: return cD2.setyHawk;
      case 49: return cD2.corpulSharlow;
      case 50: return cD2.corpulSharlow;*/
      case 51: return cD1.midayle;
      case 52: return cD1.alvis;
      case 53: return cD1.eltshan;
      case 54: return cD1.lachesis;
      case 55: return cD1.eve;
      case 56: return cD1.alva;
      case 57: return cD1.eva;
      //case 58: return cD1.mahnya;
      //case 59: return cD1.vylon;
      //case 60: return cD1.ida;
      //case 61: return cD1.palmark;
      case 62: return cD1.dimaggio;
      case 63: return cD1.gerrard;
      case 64: return cD1.ira;
      //case 65: return cD1.kinbois;
      case 66: return cD1.gandolf;
      case 67: return cD1.jamka;
      //case 68: return cD1.sandima;
      //case 69: return cD1.elliot;
      //case 70: return cD1.philip;
      //case 71: return cD1.boldo;
      case 72: return cD1.beowulf;
      //case 73: return cD1.macbeth;
      //case 74: return cD1.voltz;
      case 75: return cD1.fury;
      //case 76: return cD1.clement;
      //case 77: return cD1.zyne;
      //case 78: return cD1.shagaal;
      //case 79: return cD1.jacoban;
      //case 80: return cD1.papilion;
      //case 81: return cD1.pizarl;
      //case 82: return cD1.dobarl;
      //case 83: return cD1.cuvuli;
      //case 84: return cD1.deetver;
      //case 85: return cD1.maios;
      //case 86: return cD1.pamela;
      //case 87: return cD1.donovan;
      //case 88: return cD1.lamia;
      //case 89: return cD1.daccar;
      //case 90: return cD1.slayder;
      //case 91: return cD1.langobalt;
      //case 92: return cD1.magorn;
      //case 93: return cD1.vaha;
      //case 94: return cD1.reptor;
      //case 95: return cD2.harold;
      //case 96: return cD2.johalva;
      //case 97: return cD2.johan;
      //case 98: return cD2.schmidt;
      //case 99: return cD2.danan;
      //case 100: return cD2.tinnyLinda;
      //case 101: return cD2.tinnyLinda;
      //case 102: return cD2.cutozou;
      //case 103: return cD2.liza;
      //case 104: return cD2.ishtore;
      //case 105: return cD2.jabarro;
      //case 106: return cD2.bramsel;
      //case 107: return cD2.favalAsaello;
      //case 108: return cD2.favalAsaello;
      //case 109: return cD2.vampa;
      //case 110: return cD2.eliu;
      /*case 111: return cD2.fetra;
      case 112: return cD2.blume;
      case 113: return cD2.muhammed;
      case 114: return cD2.ovo;
      case 115: return cD2.ishtar;
      case 116: return cD2.altenna;
      case 117: return cD2.coruta;
      case 118: return cD2.maikov;
      case 119: return cD2.hannibal;
      case 120: return cD2.kanatz;
      case 121: return cD2.disler;
      case 122: return cD2.musar;
      case 123: return cD2.juda;
      case 124: return cD2.areone;
      case 125: return cD2.ridale;
      case 126: return cD2.hilda;
      case 127: return cD2.morigan;
      case 128: return cD2.julius;
      case 129: return cD2.zaggam;
      case 130: return cD2.robert;
      case 131: return cD2.boyce;
      case 132: return cD2.rodan;
      case 133: return cD2.yupheel;
      case 134: return cD2.fisher;
      case 135: return cD2.burian;
      case 136: return cD2.daggon;
      case 137: return cD2.scorpio;
      case 138: return cD2.baran;
      case 139: return cD2.meng;
      case 140: return cD2.bleg;
      case 141: return cD2.maybell;
      case 142: return cD2.manfroy;
      case 143: return cD2.eins;
      case 144: return cD2.zwei;
      case 145: return cD2.drei;
      case 146: return cD2.vier;
      case 147: return cD2.funf;
      case 148: return cD2.sechs;
      case 149: return cD2.sieben;
      case 150: return cD2.acht;
      case 151: return cD2.neun;
      case 152: return cD2.zehn;
      case 153: return cD2.elf;
      case 154: return cD2.zwolf;*/
      case 155: return cD1.andre;
      case 156: return cD1.trabant;
      case 157: return cD1.grahnye;
    }
    return cD1.none;
  }
  public int getGold(genCharacter mother, genCharacter father)
  {
    return (((mother.getGold() + father.getGold()) / 10) + 2000);
  }
  public int[] getGrowth(genCharacter mother, genCharacter father, int sex)
  {
    int[] motherBasePercents = mother.getBasePercents();
    int[] fatherBasePercents = father.getBasePercents();
    int[] childBasePercents = new int[8];
    
    for(int stat = 0; stat <= 7; stat++)
    {
      if(sex == 0)
      {
        childBasePercents[stat] = fatherBasePercents[stat] + (motherBasePercents[stat] / 2);
      }
      else
      {
        childBasePercents[stat] = motherBasePercents[stat] + (fatherBasePercents[stat] / 2);
      }
    }
    return childBasePercents;
  }
  public int[] getBloodType(genCharacter mother, genCharacter father, int sex)
  {
    int[] motherBlood = mother.getBloodTypes();
    int[] fatherBlood = father.getBloodTypes();
    int[] childBlood = new int[13];
    for(int i = 0; i < 13; i++)
    {
      if(sex == 0)
      {
        childBlood[i] = (fatherBlood[i] + motherBlood[i]/2);
      }
      else
      {
        childBlood[i] = (motherBlood[i] + fatherBlood[i]/2);
      }
      if(childBlood[i] > 24)
      {
        childBlood[i] = 24;
      }
    }
    return childBlood;
  }
  public boolean contains(int[] array, int integer)
  {
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] == integer)
      {
        return true;
      }
    }
    return false;
  }
  public int[] inheritSkill(genCharacter mother, genCharacter father, int[] defaultSkills)
  {
    int[] childSkills = new int[6];
    int i = 0;
    while(defaultSkills[i] != 0)
    {
      childSkills[i] = defaultSkills[i];
      i++;
    }
    if(father.getCharacterID() != 0)
    {
      for(int skill = 5; skill >= 0; skill--)
      {
        if(!contains(childSkills, father.getSkills(skill)))
        {
          childSkills[i] = father.getSkills(skill);
          i++;
          break;
        }
      }
      for(int skill = 5; skill >= 0; skill--)
      {
        if(!contains(childSkills, mother.getSkills(skill)))
        {
          childSkills[i] = mother.getSkills(skill);
          break;
        }
      }
    }
    return childSkills;
  }
  public int[] childStartingStats(genCharacter mother, genCharacter father, int childLevel, int[] basePercents, int[] bonusPercents, int level, int childClass, int sex)
  {
    classChangeBoost cCB = new classChangeBoost();
    Random r = new Random();
    int[] startingStats = new int[10];
    //Start HP
    int startingHP = 0;
    int fatherHPAddition = Math.max(0, father.getCurrentStats(1) - 20);
    int motherHPAddition = Math.max(0, mother.getCurrentStats(1) - 20);
    int childHPAddition = (int)(childLevel * ((basePercents[0] + bonusPercents[0])/1000));
    if(sex == 0)
    {
      startingHP = (((fatherHPAddition*2)+motherHPAddition)/10)+childHPAddition+20;
    }
    if(sex == 1)
    {
      startingHP = (((motherHPAddition*2)+fatherHPAddition)/10)+childHPAddition+20;
    }
    startingStats[0] = startingStats[1] = startingHP;
    //End HP
    //Start Strength, Magic, Skill, Speed, Luck, Defense, and Resistance
    for(int stat = 2; stat <= 8; stat++)
    {
      if(stat == 6)
      {
        int startingLuck = 0;
        int fatherLuckAddition = father.getCurrentStats(6);
        int motherLuckAddition = mother.getCurrentStats(6);
        int childLuckAddition = ((childLevel - 1) * ((basePercents[5] + bonusPercents[5])/1000));
        if(sex == 0)
        {
          startingLuck = (((fatherLuckAddition*2)+motherLuckAddition+r.nextInt(98)+1)/10)+childLuckAddition+1;
        }
        if(sex == 1)
        {
          startingLuck = (((motherLuckAddition*2)+fatherLuckAddition+r.nextInt(98)+1)/10)+childLuckAddition+1;
        }
        startingStats[6] = startingLuck;
      }
      else
      {
        int childStartingStat = 0;
        int motherStat = Math.max(0, (mother.getCurrentStats(stat) - cCB.getClassBase(mother.getClassID(), stat-1)));
        int fatherStat = Math.max(0, (father.getCurrentStats(stat) - cCB.getClassBase(father.getClassID(), stat-1)));
        int childStat = ((level - 1) * ((basePercents[stat-1] + bonusPercents[stat-1]) / 1000));
        if(sex == 0)
        {
          childStartingStat = (((((fatherStat * 2) + motherStat) / 10) % 15) + childStat) + cCB.getClassBase(childClass, stat-1);
        }
        if(sex == 1)
        {
          childStartingStat = (((((motherStat * 2) + fatherStat) / 10) % 15) + childStat)  + cCB.getClassBase(childClass, stat-1);
        }
        startingStats[stat] = childStartingStat;
      }
    }
    //End Strength, Magic, Skill, Speed, Luck, Defense, and Resistance
    startingStats[9] = cCB.getClassBase(childClass, 8);
    return startingStats;
  }
  public int getBaseClass(genCharacter mother, genCharacter father, int sex)
  {
    if(sex == 0)
    {
      return father.getBaseClass();
    }
    else
    {
      return mother.getBaseClass();
    }
  }
}