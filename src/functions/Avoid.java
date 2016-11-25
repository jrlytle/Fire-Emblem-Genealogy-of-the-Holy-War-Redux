package functions;
public class Avoid
{
  public int getAvoid(int speed, int bonusSpeed, int luck, int bonusLuck, int[] skills)
  {
    int avoid = ((((speed + bonusSpeed) * 3) + (luck + bonusLuck)) / 2); //+ Terrain bonus + Leadership bonus + Charisma bonus + Lover bonus
    return avoid;
  }
}