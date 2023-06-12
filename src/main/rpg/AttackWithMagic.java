package rpg;

/**
 * Attack method using fire magic.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class AttackWithMagic implements AttackType
{
    @Override
    public int attack()
    {
        System.out.println("*casts fireball*");
        return 10;
    }
}
