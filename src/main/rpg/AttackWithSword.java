package rpg;

public class AttackWithSword implements AttackType
{
    public int attack()
    {
        System.out.println("*swings sword*");
        return 5;
    }
}
