package rpg;

/**
 * Defence method using a shield.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class DefendWithShield implements DefendType
{
    @Override
    public int defend()
    {
        System.out.println("*raises shield");
        return 3;
    }
}
