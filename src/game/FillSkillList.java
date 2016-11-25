package game;
public class FillSkillList
{
  public int[] getSkillList()
  {
    int[] skillList = new int[99];
    for(int i = 0; i < 99; i++)
    {
      skillList[i] = -1;
    }
    return skillList;
  }
}