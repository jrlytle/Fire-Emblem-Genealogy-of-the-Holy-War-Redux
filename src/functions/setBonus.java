package functions;
import weapons.*;
public class setBonus
{
  //characterLocations cL = new characterLocations();
  public int[] getBonus(int[] skills, item equippedWeapon)
  {
    int[] bonuses;
    int hpBonus = 0;
    int strengthBonus = 0;
    int magicBonus = 0;
    int skillBonus = 0;
    int speedBonus = 0;
    int luckBonus = 0;
    int defenseBonus = 0;
    int resistanceBonus = 0;
    int moveBonus = 0;
    for(int add = 0; add <= 5; add++)
    {
      switch(skills[add])
      {
        case 37: defenseBonus += 2; break;//Defense + 2
        case 42: 
        if((equippedWeapon.getID() > 0 && equippedWeapon.getID() <= 54) || (equippedWeapon.getID() >= 60 && equippedWeapon.getID() <= 67) || (equippedWeapon.getID() >= 69 && equippedWeapon.getID() <= 108))
        {
          strengthBonus += 5;
        }
        if((equippedWeapon.getID() >= 55 && equippedWeapon.getID() <= 59) || equippedWeapon.getID() == 68)
        {
          magicBonus += 5;
        }
        break;//Swordfaire
        case 46: hpBonus += 5; //HP + 5
        break;
        case 52: /*if((weaponID >= 47 && weaponID <= 52) || (weaponID >= 54 && weaponID <= 56))
          strengthBonus += 5;
        if(weaponID == 53)
          magicBonus += 5;*/
        break;//Axefaire
        case 53: skillBonus += 2; break;//Skill + 2
        case 56: /*if(weaponID <= 67 && weaponID >= 58)
          strengthBonus += 5;*/
        break;//Bowfaire
        case 65: speedBonus += 2; break;//Speed + 2
        case 68: /*if((weaponID <= 41 && (weaponID >= 33) || (weaponID >= 43 && weaponID <= 45)))
          strengthBonus += 5;
        if(weaponID == 42)
          magicBonus += 5;*/
        break;//Lancefaire
        case 71: strengthBonus += 2;
        break;//Strength + 2
        case 77: magicBonus += 2;
        break;//Magic + 2
        case 80: /*if(weaponID <= 95 && weaponID >= 73)
          magicBonus += 5;*/
        break;//Tomefaire
        case 91: resistanceBonus += 2; break;//Resistance + 2
        case 105: resistanceBonus += 10; break;//Resistance + 10
        case 97:  luckBonus += 4; break;//Luck + 4
        case 109: strengthBonus += 2;
        magicBonus += 2;
        skillBonus += 2;
        speedBonus += 2;
        luckBonus += 2;
        defenseBonus += 2;
        resistanceBonus += 2;
        break;//All Stats + 2
      }
    }
    /*for(int rangeOne = -1; rangeOne <= 1; rangeOne++)//Solidarity
      for(int rangeTwo = -1; rangeTwo <= 1; rangeTwo++)
        if(Math.abs(rangeOne) + Math.abs(rangeTwo) <= 1 && ((rangeOne == 0 || rangeTwo == 0) && (rangeOne != 0 || rangeTwo != 0)))
          if(one+rangeOne >= 0 && one+rangeOne < 63 && two+rangeTwo >= 0 && two+rangeTwo < 31)
            if(cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(0) == 29 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(1) == 29 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(2) == 29 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(3) == 29 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(4) == 29 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(5) == 29)
              if(cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getTeam() == cL.characterLocationsPrologue[two][one].getTeam())
                luckBonus += 10;*/
    /*for(int rangeOne = -3; rangeOne <= 3; rangeOne++)//Demoiselle
      for(int rangeTwo = -3; rangeTwo <= 3; rangeTwo++)
        if(Math.abs(rangeOne) + Math.abs(rangeTwo) <= 3 && (rangeOne != 0 || rangeTwo != 0))
          if(one+rangeOne >= 0 && one+rangeOne < 63 && two+rangeTwo >= 0 && two+rangeTwo < 31)
            if(cL.characterLocationsPrologue[two][one].getCharacterID() <= 39 && (cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(0) == 92 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(1) == 92 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(2) == 92 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(3) == 92 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(4) == 92 || cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getSkills(5) == 92))
              if(cL.characterLocationsPrologue[two+rangeTwo][one+rangeOne].getTeam() == cL.characterLocationsPrologue[two][one].getTeam())
                luckBonus += 10;*/
    strengthBonus += equippedWeapon.getBonusStrength();
    magicBonus += equippedWeapon.getBonusMagic();
    skillBonus += equippedWeapon.getBonusSkill();
    speedBonus += equippedWeapon.getBonusSpeed();
    luckBonus += equippedWeapon.getBonusLuck();
    defenseBonus += equippedWeapon.getBonusDefense();
    resistanceBonus += equippedWeapon.getBonusResistance();
    /*for(int inv = 0; inv < 7; inv++)
    {
      switch(equippedWeapon.getID())
      {
        case 122: speedBonus += 5; break;
        case 123: magicBonus += 5; break;
        case 124: strengthBonus += 5; break;
        case 125: defenseBonus += 5; break;
        case 126: resistanceBonus += 5; break;
        case 127: moveBonus += 3; break;
        case 128: skillBonus += 5; break;
      }
    }*/
    bonuses = new int[] {hpBonus, strengthBonus, magicBonus, skillBonus, speedBonus, luckBonus, defenseBonus, resistanceBonus, moveBonus};
    return bonuses;
  }
}