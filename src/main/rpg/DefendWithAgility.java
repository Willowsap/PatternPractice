package rpg;

/**
 * Defence method using agility.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class DefendWithAgility implements DefendType
{
    @Override
    public int defend()
    {
        System.out.println("*nimbly dives backwards*");
        return 1;
    }
}
