package maps;

import java.awt.*;

/**
 *
 * @author jrlytle
 */
public class prologue
{
    Dimension none = new Dimension(0, 0);
    //ROW 1 START
    Dimension mountainOne = new Dimension(1, 1); //20
    Dimension mountainTwo = new Dimension(2, 1); //21
    Dimension mountainThree = new Dimension(3, 1); //22
    Dimension mountainFour = new Dimension(4, 1); //23
    Dimension grassFive = new Dimension(5, 2); //24
    Dimension mountainSix = new Dimension(6, 1); //26
    Dimension mountainSeven = new Dimension(7, 1); //27
    Dimension mountainEight = new Dimension(8, 1); //28
    Dimension mountainNine = new Dimension(9, 1); //29
    Dimension mountainTen = new Dimension(10, 1); //30
    Dimension mountainEleven = new Dimension(11, 1); //31
    Dimension mountainTwelve = new Dimension(12, 1); //32
    Dimension mountainThirteen = new Dimension(13, 1); //35
    Dimension mountainFourteen = new Dimension(14, 1);
    Dimension mountainFifteen = new Dimension(15, 1);
    Dimension grassSixteen = new Dimension(16, 2);
    Dimension grassSeventeen = new Dimension(17, 2);
    Dimension grassEighteen = new Dimension(18, 2);
    Dimension grassNineteen = new Dimension(19, 2);
    Dimension grassTwenty = new Dimension(20, 2);
    Dimension grassTwentyOne = new Dimension(21, 2);
    Dimension grassTwentyTwo = new Dimension(22, 2);
    Dimension grassTwentyThree = new Dimension(23, 2);
    Dimension grassTwentyFour = new Dimension(24, 2);
    Dimension grassTwentyFive = new Dimension(25, 2);
    Dimension grassTwentySix = new Dimension(26, 2); //789
    Dimension grassTwentySeven = new Dimension(27, 2); //790
    Dimension grassTwentyEight = new Dimension(28, 2); //808
    Dimension grassTwentyNine = new Dimension(29, 2); //809
    Dimension grassThirty = new Dimension(30, 2); //810
    Dimension grassThirtyOne = new Dimension(31, 2); //811
    Dimension grassThirtyTwo = new Dimension(32, 2); //812
    Dimension grassThirtyThree = new Dimension(33, 2); //813
    Dimension grassThirtyFour = new Dimension(34, 2); //814
    Dimension grassThirtyFive = new Dimension(35, 2); //815
    Dimension grassThirtySix = new Dimension(36, 2); //816
    Dimension grassThirtySeven = new Dimension(37, 2); //817
    Dimension grassThirtyEight = new Dimension(38, 2); //818
    Dimension grassThirtyNine = new Dimension(39, 2); //819
    Dimension grassForty = new Dimension(40, 2); //868
    Dimension grassFortyOne = new Dimension(41, 2); //869
    Dimension grassFortyTwo = new Dimension(42, 2); //870
    Dimension grassFortyThree = new Dimension(43, 2); //871
    Dimension grassFortyFour = new Dimension(44, 2); //872
    Dimension grassFortyFive = new Dimension(45, 2); //873
    Dimension grassFortySix = new Dimension(46, 2); //874
    Dimension grassFortySeven = new Dimension(47, 2); //875
    Dimension grassFortyEight = new Dimension(48, 2); //876
    Dimension grassFortyNine = new Dimension(49, 2); //877
    Dimension grassFifty = new Dimension(50, 2); //878
    Dimension grassFiftyOne = new Dimension(51, 2); //879
    Dimension grassFiftyTwo = new Dimension(52, 2); //880
    Dimension grassFiftyThree = new Dimension(53, 2); //881
    Dimension grassFiftyFour = new Dimension(54, 2); //906
    Dimension grassFiftyFive = new Dimension(55, 2); //907
    Dimension grassFiftySix = new Dimension(56, 2); //908
    Dimension grassFiftySeven = new Dimension(57, 2); //909
    Dimension grassFiftyEight = new Dimension(58, 2); //912
    Dimension mountainFiftyNine = new Dimension(59, 1); //913
    Dimension mountainSixty = new Dimension(60, 1); //914
    Dimension mountainSixtyOne = new Dimension(61, 1); //915
    Dimension mountainSixtyTwo = new Dimension(62, 1); //916
    Dimension mountainSixtyThree = new Dimension(63, 1); //917
    //ROW 1 END
    //ROW 2 START
    Dimension mountainSixtyFour = new Dimension(64,1); //52
    Dimension mountainSixtyFive = new Dimension(65,1); //53
    Dimension mountainSixtySix = new Dimension(66,1); //54
    Dimension grassSixtySeven = new Dimension(67,2); //55
    //Dimension waterSixtyEight = new Dimension(68,3);
    //Dimension waterSixtyNine = new Dimension(69,3);
    
    //ROW 2 END
    //--------------------------------------------------------------------------------------------------------------
    //Map ID, Avoid Bonus, Heal Bonus, Defense Bonus, Knight1, Knight2, Flier, Foot, Armor, Fighter, Brigand, Pirate
    int[] noneStats = new int[] {0,0,2,1,1,1,1,1,1,1,1};
    int[] mountain = new int[] {40,0,2,-1,3,1,2,-1,2,2,2};
    int[] grass = new int[] {0,0,0,1,1,1,1,1,1,1,1};
    int[] water = new int[] {-30,0,0,-1,-1,1,-1,-1,-1,-1,5};
    int[] tree = new int[] {20,0,1,3,3,1,2,2,2,2,2};
    int[] sand = new int[] {0,0,0,1,1,1,1,1,1,1,1};
    int[] cliff = new int[] {30,0,2,-1,-1,1,-1,-1,-1,-1,-1};
    int[] village = new int[] {0,0,0,-1,-1,1,-1,-1,-1,-1,-1};
    int[] fort = new int[] {30,0,2,1,1,1,1,1,1,1,1};
    int[] castle = new int[] {0,0,0,-1,-1,-1,-1,-1,-1,-1,-1};
    int[] bridge = new int[] {107,-10,0,0,1,1,1,1,1,1,1,1};
    //--------------------------------------------------------------------------------------------------------------
    public Dimension[][] prologue = 
    {
        {none,mountainOne,mountainTwo,mountainThree,mountainFour,grassFive,mountainSix,mountainSeven,mountainEight,mountainNine,mountainTen,mountainEleven,mountainTwelve,mountainThirteen,mountainFourteen,mountainFifteen,grassSixteen,grassSeventeen,grassEighteen,grassNineteen,grassTwenty,grassTwentyOne,grassTwentyTwo,grassTwentyThree,grassTwentyFour,grassTwentyFive,grassTwentySix,grassTwentySeven,grassTwentyEight,grassTwentyNine,grassThirty,grassThirtyOne,grassThirtyTwo,grassThirtyThree,grassThirtyFour,grassThirtyFive,grassThirtySix,grassThirtySeven,grassThirtyEight,grassThirtyNine,grassForty,grassFortyOne,grassFortyTwo,grassFortyThree,grassFortyFour,grassFortyFive,grassFortySix,grassFortySeven,grassFortyEight,grassFortyNine,grassFifty,grassFiftyOne,grassFiftyTwo,grassFiftyThree,grassFiftyFour,grassFiftyFive,grassFiftySix,grassFiftySeven,grassFiftyEight,mountainFiftyNine,mountainSixty,mountainSixtyOne,mountainSixtyTwo,mountainSixtyThree,none},
        {none,mountainSixtyFour,mountainSixtyFive,mountainSixtySix,grassSixtySeven,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none},
        {none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none,none}
    };
    
    public int[] getMapStats(Dimension location)
    {
        switch ((int) location.getHeight()) 
        {
            case 1:
                return mountain;
            case 2:
                return grass;
            case 3:
                return water;
            case 4:
                return tree;
            case 5:
                return sand;
            case 6:
                return cliff;
            case 7:
                return village;
            case 8:
                return fort;
            case 9:
                return castle;
            case 10:
                return bridge;
            default:
                return noneStats;
        }
    }

    public int getMapValue(int x, int y)
    {
        if (y < 0 || x < 0 || x >= 63 || y >= 31) 
        {
            return 0;
        }
        else 
        {
            return (int) prologue[y][x].getWidth(); //Use this to interact with other points
        }
    }

    public int getValue(int x, int y)
    {
        if (y < 0 || x < 0 || x >= 63 || y >= 31) 
        {
            return 0;
        }
        else 
        {
            return (int) prologue[y][x].getHeight(); //Use this to interact with other points
        }
    }

    public int getStat(int value, int stat)
    {
        switch (value) 
        {
            case 1:
                return mountain[stat];
            case 2:
                return grass[stat];
            case 3:
                return water[stat];
            case 4:
                return tree[stat];
            case 5:
                return sand[stat];
            case 6:
                return cliff[stat];
            case 7:
                return village[stat];
            case 8:
                return fort[stat];
            case 9:
                return castle[stat];
            case 10:
                return bridge[stat];
            default:
                return noneStats[stat];
        }
    }

    public String getMapType(int x, int y, int a, int b)
    {
        if (x == 12 && y == 9) 
        {
            return mapInfo(b, a);
        }
        else if (x == 50 && y == 9) 
        {
            if (b % 2 == 0) 
            {
                return mapInfo(x + (b / 2) - ((24 - b) / 2), a);
            }
            else 
            {
                return mapInfo(x + ((b - 1) / 2) - ((24 - b - 1) / 2), a);
            }
        }
        else if (x == 12 && y == 21) 
        {
            if (a % 2 == 0) 
            {
                return mapInfo(b, y + (a / 2) - ((19 - a) / 2));
            }
            else 
            {
                return mapInfo(b, y + ((a - 1) / 2) - ((19 - a - 1) / 2));
            }
        }
        else if (x == 50 && y == 21) 
        {
            if (a % 2 == 0 && b % 2 == 0) 
            {
                return mapInfo(x + (b / 2) - ((24 - b) / 2), y + (a / 2) - ((19 - a) / 2));
            }
            if (a % 2 == 0 && b % 2 != 0) 
            {
                return mapInfo(x + ((b - 1) / 2) - ((24 - b - 1) / 2), y + (a / 2) - ((19 - a) / 2));
            }
            if (a % 2 != 0 && b % 2 == 0) 
            {
                return mapInfo(x + (b / 2) - ((24 - b) / 2), y + ((a - 1) / 2) - ((19 - a - 1) / 2));
            }
            else 
            {
                return mapInfo(x + ((b - 1) / 2) - ((24 - b - 1) / 2), y + ((a - 1) / 2) - ((19 - a - 1) / 2));
            }
        }
        else if (x >= 13 && x <= 49 && y == 21) 
        {
            if (a % 2 == 0) 
            {
                return mapInfo(x, y + (a / 2) - ((19 - a) / 2));
            }
            else 
            {
                return mapInfo(x, y + ((a - 1) / 2) - ((19 - a - 1) / 2));
            }
        }
        else if (x >= 13 && x <= 49 && y == 9) 
        {
            return mapInfo(x, a);
        }
        else if (x == 50 && y >= 10 && y <= 20) 
        {
            if (b % 2 == 0) 
            {
                return mapInfo(x + (b / 2) - ((24 - b) / 2), y);
            }
            else 
            {
                return mapInfo(x + ((b - 1) / 2) - ((24 - b - 1) / 2), y);
            }
        }
        else if (x == 12 && y >= 10 && y <= 20) 
        {
            return mapInfo(b, y);
        }
        else 
        {
            return mapInfo(x, y);
        }
    }

    public String mapInfo(int x, int y)
    {
        int mapDescription = (int) prologue[y][x].getWidth();
        switch (mapDescription) 
        {
            case 1:
                return "Mountain";
            case 2:
                return "Grass";
            case 3:
                return "Water";
            case 4:
                return "Trees";
            case 5:
                return "Sand";
            case 6:
                return "Cliff";
            case 7:
                return "Village";
            case 8:
                return "Fort";
            case 9:
                return "Castle";
            case 10:
                return "Bridge";
            default:
                return "Dummy";
        }
    }
}
