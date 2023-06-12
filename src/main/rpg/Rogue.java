package rpg;

public class Rogue extends Player
{
    public Rogue(String name)
    {
        super(name);
        switchAttackType(new AttackWithSword());
    }

    @Override
    public void defend()
    {
        System.out.println("*vanishes*");
        this.setStance(Stance.DEFENCE);
        addAblativeHp(3);
    }

    @Override
    public AttackType getBackupAttack()
    {
        return new AttackWithBow();
    }
}
