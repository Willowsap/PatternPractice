package rpg;

public class AttackWithIce implements AttackType
{
    public int attack()
    {
        System.out.println("*shoots ice ray*");
        return 14;
    }
}
