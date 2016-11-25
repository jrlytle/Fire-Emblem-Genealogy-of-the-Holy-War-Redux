package functions;
import game.*;
import maps.*;
public class setMoveRange
{
  prologue p = new prologue();
  //characterLocations cL = new characterLocations();
  public int getCharType(int classID)
  {
      int charType = 0;
      // 4 -> 5 -> etc.  (Knight1, Knight2, Flier, Foot, Armor, Fighter, Brigand, Pirate)
      switch(classID)
      {
        case 0: charType = 0; break;
        case 1: charType = 3; break;
        case 2: charType = 0; break;
        case 3: charType = 0; break;
        case 4: charType = 3; break;
        case 5: charType = 3; break;
        case 6: charType = 3; break;
        case 7: charType = 0; break;
        case 8: charType = 0; break;
        case 9: charType = 0; break;
        case 10: charType = 4; break;
        case 11: charType = 4; break;
        case 12: charType = 4; break;
        case 13: charType = 4; break;
        case 14: charType = 4; break;
        case 15: charType = 4; break;
        case 16: charType = 4; break;
        case 17: charType = 4; break;
        case 18: charType = 4; break;
        case 19: charType = 3; break;
        case 20: charType = 3; break;
        case 21: charType = 3; break;
        case 22: charType = 3; break;
        case 23: charType = 3; break;
        case 24: charType = 3; break;
        case 25: charType = 3; break;
        case 26: charType = 3; break;
        case 27: charType = 3; break;
        case 28: charType = 3; break;
        case 29: charType = 3; break;
        case 30: charType = 6; break;
        case 31: charType = 6; break;
        case 32: charType = 7; break;
        case 33: charType = 7; break;
        case 34: charType = 3; break;
        case 35: charType = 3; break;
        case 36: charType = 3; break;
        case 37: charType = 0; break;
        case 38: charType = 0; break;
        case 39: charType = 0; break;
        case 40: charType = 3; break;
        case 41: charType = 3; break;
        case 42: charType = 3; break;
        case 43: charType = 2; break;
        case 44: charType = 2; break;
        case 45: charType = 2; break;
        case 46: charType = 2; break;
        case 47: charType = 2; break;
        case 48: charType = 2; break;
        case 49: charType = 2; break;
        case 50: charType = 2; break;
        case 51: charType = 2; break;
        case 52: charType = 2; break;
        case 53: charType = 3; break;
        case 54: charType = 3; break;
        case 55: charType = 3; break;
        case 56: charType = 0; break;
        case 57: charType = 0; break;
      }
      return charType;
  }
  public int[][] getMoveRange(character[][] characterLocationsPrologue, int chapterID, int n, int one, int two, int choice)
  {
    int[][] moveRange = new int[31][63];
    int[][] fullMoveRange = new int[31][63];
    moveRange[two][one] = 1;
    for(int counter = 0; counter <= 7; counter++)
    {
      for(int moveTwo = 0; moveTwo < 31; moveTwo++)
      {
        for(int moveOne = 0; moveOne < 63; moveOne++)
        {
          if((moveOne == 1 && moveTwo == 0) || (moveOne == 0 && moveTwo == 1) || (moveOne == 0 && moveTwo == 0))
          {
            if(two+1 < 31)
            {
              if(p.getStat(p.getValue(two+1, one), 3 + getCharType(characterLocationsPrologue[two][one].getClassID())) > 0 && (characterLocationsPrologue[two][one].getTeam() == characterLocationsPrologue[two+1][one].getTeam() || characterLocationsPrologue[two+1][one].getTeam() == -1))
                moveRange[two+1][one] = p.getStat(p.getValue(two+1, one), 3 + getCharType(characterLocationsPrologue[two][one].getClassID()));
              else
                moveRange[two+1][one] = n+1;
            }
            if(two-1 >= 0)
            {
              if(p.getStat(p.getValue(two-1, one), 3 + getCharType(characterLocationsPrologue[two][one].getClassID())) > 0 && (characterLocationsPrologue[two][one].getTeam() == characterLocationsPrologue[two-1][one].getTeam() || characterLocationsPrologue[two-1][one].getTeam() == -1))
                moveRange[two-1][one] = p.getStat(p.getValue(two-1, one), 3 + getCharType(characterLocationsPrologue[two][one].getClassID()));
              else
                moveRange[two-1][one] = n+1;
            }
            if(one+1 < 63)
            {
              if(p.getStat(p.getValue(two, one+1), 3 + getCharType(characterLocationsPrologue[two][one].getClassID())) > 0 && (characterLocationsPrologue[two][one].getTeam() == characterLocationsPrologue[two][one+1].getTeam() || characterLocationsPrologue[two][one+1].getTeam() == -1))
                moveRange[two][one+1] = p.getStat(p.getValue(two, one+1), 3 + getCharType(characterLocationsPrologue[two][one].getClassID()));
              else
                moveRange[two][one+1] = n+1;
            }
            if(one-1 >= 0)
            {
              if(p.getStat(p.getValue(two, one-1), 3 + getCharType(characterLocationsPrologue[two][one].getClassID())) > 0 && (characterLocationsPrologue[two][one].getTeam() == characterLocationsPrologue[two][one-1].getTeam() || characterLocationsPrologue[two][one-1].getTeam() == -1))
                moveRange[two][one-1] = p.getStat(p.getValue(two, one-1), 3 + getCharType(characterLocationsPrologue[two][one].getClassID()));
              else
                moveRange[two][one-1] = n+1;
            }
          }
          else
          {
            int adjOne = 1;
            int adjTwo = 1;
            switch(counter)
            {
              case 0: case 4: adjOne = 1; adjTwo = 1; break;
              case 1: case 5: adjOne = 1; adjTwo = -1; break;
              case 2: case 6: adjOne = -1; adjTwo = 1; break;
              case 3: case 7: adjOne = -1; adjTwo = -1; break;
            }
            
            int min;
            double valOne = n+1;
            double valTwo = n+1;
            double valThree = n+1; 
            double valFour = n+1;
            
            if(two+(moveTwo*adjOne) >= 0 && two+(moveTwo*adjOne) < 31 && one+(moveOne*adjTwo)-1 >= 0 && one+(moveOne*adjTwo)-1 < 63 && moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)-1] > 0)
              valOne = moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)-1];
            if(two+(moveTwo*adjOne) >= 0 && two+(moveTwo*adjOne) < 31 && one+(moveOne*adjTwo)+1 >= 0 && one+(moveOne*adjTwo)+1 < 63 && moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)+1] > 0)
              valTwo = moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)+1];
            if(two+(moveTwo*adjOne)-1 >= 0 && two+(moveTwo*adjOne)-1 < 31 && one+(moveOne*adjTwo) >= 0 && one+(moveOne*adjTwo) < 63 && moveRange[two+(moveTwo*adjOne)-1][one+(moveOne*adjTwo)] > 0)
              valThree = moveRange[two+(moveTwo*adjOne)-1][one+(moveOne*adjTwo)];
            if(two+(moveTwo*adjOne)+1 >= 0 && two+(moveTwo*adjOne)+1 < 31 && one+(moveOne*adjTwo) >= 0 && one+(moveOne*adjTwo) < 63 && moveRange[two+(moveTwo*adjOne)+1][one+(moveOne*adjTwo)] > 0)
              valFour = moveRange[two+(moveTwo*adjOne)+1][one+(moveOne*adjTwo)];
            
            min = (int)Math.min(Math.min(valOne, valTwo), Math.min(valThree, valFour));
            
            if(two+(moveTwo*adjOne) >= 0 && two+(moveTwo*adjOne) < 31 && one+(moveOne*adjTwo) >= 0 && one+(moveOne*adjTwo) < 63 && p.getStat(p.getValue(two+(moveTwo*adjOne), two+(moveTwo*adjOne)), 3 + getCharType(characterLocationsPrologue[two][one].getClassID())) != -1)
            {
              //MOVE VAL
              if(min > 0 && (moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)] == 0 || min < moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)]))
                moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)] = min + p.getStat(p.getValue(two+(moveTwo*adjOne), one+(moveOne*adjTwo)), 3 + getCharType(characterLocationsPrologue[two][one].getClassID()));
              if(characterLocationsPrologue[two][one].getTeam() != -1 && characterLocationsPrologue[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)].getTeam() != -1 && characterLocationsPrologue[two][one].getTeam() != characterLocationsPrologue[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)].getTeam())
                moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)] = n+1;
            }
            if(two+(moveTwo*adjOne) >= 0 && two+(moveTwo*adjOne) < 31 && one+(moveOne*adjTwo) >= 0 && one+(moveOne*adjTwo) < 63 && p.getStat(p.getValue(two+(moveTwo*adjOne), two+(moveTwo*adjOne)), 3 + getCharType(characterLocationsPrologue[two][one].getClassID())) < 0 && moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)] <= n)
              moveRange[two+(moveTwo*adjOne)][one+(moveOne*adjTwo)] = n+1;
          }
        }
      }
    }
    if(choice == 0)
      return moveRange;
    else
    {
      for(int moveOne = 0; moveOne < 31; moveOne++)
        for(int moveTwo = 0; moveTwo < 63; moveTwo++)
        {
          if(moveRange[moveOne][moveTwo] > 0 && moveRange[moveOne][moveTwo] <= n)
            fullMoveRange[moveOne][moveTwo] = 1;
          if(getEquippedWeapon(characterLocationsPrologue, chapterID, one, two) >= 0)
            for(int attackRangeOne = 0; attackRangeOne <= characterLocationsPrologue[two][one].getItem(getEquippedWeapon(characterLocationsPrologue, chapterID, one, two)).getMaxRange(); attackRangeOne++)
              for(int attackRangeTwo = 0; attackRangeTwo <= characterLocationsPrologue[two][one].getItem(getEquippedWeapon(characterLocationsPrologue, chapterID, one, two)).getMaxRange(); attackRangeTwo++)
              {
                if(moveOne+attackRangeOne < 31 && moveTwo+attackRangeTwo < 63 && attackRangeOne + attackRangeTwo <= characterLocationsPrologue[two][one].getItem(getEquippedWeapon(characterLocationsPrologue, chapterID, one, two)).getMaxRange() && (moveRange[moveOne][moveTwo] > 0 && moveRange[moveOne][moveTwo] <= n) && moveRange[moveOne+attackRangeOne][moveTwo+attackRangeTwo] > n)
                  fullMoveRange[moveOne+attackRangeOne][moveTwo+attackRangeTwo] = 2;
                if(moveOne+attackRangeOne < 31 && moveTwo-attackRangeTwo >= 0 && attackRangeOne + attackRangeTwo <= characterLocationsPrologue[two][one].getItem(getEquippedWeapon(characterLocationsPrologue, chapterID, one, two)).getMaxRange() && (moveRange[moveOne][moveTwo] > 0 && moveRange[moveOne][moveTwo] <= n) && moveRange[moveOne+attackRangeOne][moveTwo-attackRangeTwo] > n)
                  fullMoveRange[moveOne+attackRangeOne][moveTwo-attackRangeTwo] = 2;
                if(moveOne-attackRangeOne >= 0 && moveTwo+attackRangeTwo < 63 && attackRangeOne + attackRangeTwo <= characterLocationsPrologue[two][one].getItem(getEquippedWeapon(characterLocationsPrologue, chapterID, one, two)).getMaxRange() && (moveRange[moveOne][moveTwo] > 0 && moveRange[moveOne][moveTwo] <= n) && moveRange[moveOne-attackRangeOne][moveTwo+attackRangeTwo] > n)
                  fullMoveRange[moveOne-attackRangeOne][moveTwo+attackRangeTwo] = 2;
                if(moveOne-attackRangeOne >= 0 && moveTwo-attackRangeTwo >= 0 && attackRangeOne + attackRangeTwo <= characterLocationsPrologue[two][one].getItem(getEquippedWeapon(characterLocationsPrologue, chapterID, one, two)).getMaxRange() && (moveRange[moveOne][moveTwo] > 0 && moveRange[moveOne][moveTwo] <= n) && moveRange[moveOne-attackRangeOne][moveTwo-attackRangeTwo] > n)
                  fullMoveRange[moveOne-attackRangeOne][moveTwo-attackRangeTwo] = 2;
              }
        }
      return fullMoveRange;
    }
  }
  public int getEquippedWeapon(character[][] characterLocationsPrologue, int chapterID, int one, int two)
  {
    for(int equipped = 0; equipped < 7; equipped++)
      if(characterLocationsPrologue[two][one].getItem(equipped).getIsEquipped())
        return equipped;
    return -1;
  }
}