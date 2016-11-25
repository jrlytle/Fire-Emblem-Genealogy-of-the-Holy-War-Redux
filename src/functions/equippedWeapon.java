package functions;
import weapons.*;
public class equippedWeapon
{
  public item getEquippedWeapon(item[] weapons)
  {
    for(int equipped = 0; equipped < 7; equipped++)
    {
      if(weapons[equipped].getIsEquipped())
      {
        return weapons[equipped];
      }
    }
    return weapons[0];
  }
  public int getEquippedWeaponLocation(item[] weapons)
  {
    for(int equipped = 0; equipped < 7; equipped++)
    {
      if(weapons[equipped].getIsEquipped())
      {
        return equipped;
      }
    }
    return -1;
  }
}