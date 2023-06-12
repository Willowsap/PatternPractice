package rpg;

public class DefendWithShield implements DefendType
{
    public int defend()
    {
        System.out.println("*raises shield");
        return 3;
    }
}
