package zoo;

public class Wizard extends Player 
{
    public Wizard(String name)
    {
        super(name);
    }

    @Override
    public void defend()
    {
        System.out.println("*Summons magic barrier*");
    }

    @Override
    public void attack()
    {
        System.out.println("*casts fireball*");
    }
}
