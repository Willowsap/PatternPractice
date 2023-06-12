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
        setAttackType(new AttackWithMagic());
    }

    /**
     * Defends using magic.
     * Pretty cool.
     */
    @Override
    public void defend()
    {
        System.out.println("*Summons magic barrier*");
        this.setStance(Stance.DEFENCE);
        addAblativeHp(10);
    }
}
