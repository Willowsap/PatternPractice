package rpg;

/**
 * Defence method using magic.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class DefendWithMagic implements DefendType
{
    @Override
    public int defend()
    {
        System.out.println("*Summons magic barrier*");
        return 3;
    }
}
