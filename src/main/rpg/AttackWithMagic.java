package rpg;

public class AttackWithMagic implements AttackType
{
    public int attack()
    {
        System.out.println("*casts fireball*");
        return 5;
    }
}
