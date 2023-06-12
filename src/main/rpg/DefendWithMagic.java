package rpg;

public class DefendWithMagic implements DefendType
{
    public int defend()
    {
        System.out.println("*Summons magic barrier*");
        return 3;
    }
}
