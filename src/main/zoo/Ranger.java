package zoo;

public class Ranger extends Player
{
    public Ranger(String name)
    {
        super(name);
    }

    @Override
    public void defend()
    {
        System.out.println("*dives in bush*");
    }

    @Override
    public void attack()
    {
        System.out.println("*shoots bow*");
    }
    
}
