package rpg;

public class Rogue extends Player
{
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
