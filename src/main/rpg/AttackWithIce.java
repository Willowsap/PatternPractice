package rpg;

/**
 * Attack method using aice magic.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class AttackWithIce implements AttackType
{
    @Override
    public int attack()
    {
        System.out.println("*shoots ice ray*");
        return 14;
    }
}
