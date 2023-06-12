package rpg;

/**
 * A rogue rpg class.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public class Rogue extends Player
{
    /**
     * Constructs a new rogue.
     * 
     * @param name the rogue's name
     */
    public Rogue(String name)
    {
        super(name);
        switchAttackType(new AttackWithSword());
        switchDefendType(new DefendWithAgility());
    }

    @Override
    public DefendType getBackupDefend()
    {
        return new DefendWithMagic();
    }

    @Override
    public AttackType getBackupAttack()
    {
        return new AttackWithBow();
    }
}
