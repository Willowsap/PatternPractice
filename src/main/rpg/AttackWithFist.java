package rpg;

/**
 * Attack method using fists.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class AttackWithFist implements AttackType
{
    @Override
    public int attack()
    {
        System.out.println("*punches*");
        return 6;
    }
}
