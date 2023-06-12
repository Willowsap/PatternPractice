package rpg;

/**
 * Attack method using a sword.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class AttackWithSword implements AttackType
{
    @Override
    public int attack()
    {
        System.out.println("*swings sword*");
        return 10;
    }
}
