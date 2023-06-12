package rpg;

/**
 * Ranger rpg class.
 * They use cool bows and probably have pets or something.
 * 
 * @author Willow Sapphire
 * @version 06/08/2023
 */
public class Ranger extends Player
{
    /**
     * Constructs a new ranger.
     * 
     * @param name the ranger's name
     */
    public Ranger(String name)
    {
        super(name);
        switchAttackType(new AttackWithBow());
        switchDefendType(new DefendWithAgility());
    }

    @Override
    public DefendType getBackupDefend()
    {
        return new DefendWithShield();
    }

    @Override
    public AttackType getBackupAttack()
    {
        return new AttackWithSword();
    }
}
