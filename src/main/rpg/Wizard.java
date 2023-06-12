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
        switchAttackType(new AttackWithMagic());
        switchDefendType(new DefendWithMagic());
    }

    @Override
    public DefendType getBackupDefend()
    {
        return new DefendWithAgility();
    }

    @Override
    public AttackType getBackupAttack()
    {
        return new AttackWithIce();
    }
}
