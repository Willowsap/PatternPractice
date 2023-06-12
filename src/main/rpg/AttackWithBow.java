package rpg;

public class AttackWithBow implements AttackType
{
    public int attack()
    {
        System.out.println("*shoots bow*");
        return 5;
    }
}
