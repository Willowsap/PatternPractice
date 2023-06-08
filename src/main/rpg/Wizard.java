package rpg;

/**
 * Wizard rpg class.
 * 
 * @author Willow Sapphire
 * @version 06/08/2023
 */
public class Wizard extends Player 
{
    /**
     * Constructs a wizard.
     * 
     * @param name the wizard's name.
     */
    public Wizard(String name)
    {
        super(name);
    }

    /**
     * Defends using magic.
     * Pretty cool.
     */
    @Override
    public void defend()
    {
        System.out.println("*Summons magic barrier*");
    }

    /**
     * Attacks with a fireball.
     * I'm sure there won't be collateral damage.
     */
    @Override
    public void attack()
    {
        System.out.println("*casts fireball*");
    }
}
