package rpg;

/**
 * Attack method using a bow.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class AttackWithBow implements AttackType
{
    @Override
    public int attack()
    {
        System.out.println("*shoots bow*");
        return 10;
    }
}
