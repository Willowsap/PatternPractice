package rpg;

public class AttackWithFist implements AttackType
{
    public int attack()
    {
        System.out.println("*punches*");
        return 2;
    }
}
