package zoo;

public class Warrior extends Player
{
    public Warrior(String name)
    {
        super(name);
    }

    @Override
    public void defend()
    {
        System.out.println("*raises shield*");
    }

    @Override
    public void attack()
    {
        System.out.println("*swings sword*");
    }
}
