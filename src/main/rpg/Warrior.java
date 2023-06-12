package rpg;

/**
 * Warrior rpg class.
 * 
 * @author Willow Sapphire
 * @version 06/08/2023
 */
public class Warrior extends Player
{
    /**
     * Constructs a warrior.
     * 
     * @param name the warrior's name.
     */
    public Warrior(String name)
    {
        super(name);
        switchAttackType(new AttackWithSword());
        switchDefendType(new DefendWithShield());
    }

    @Override
    public DefendType getBackupDefend()
    {
        return new DefendWithShield();
    }

    @Override
    public AttackType getBackupAttack()
    {
        return new AttackWithFist();
    }
}
