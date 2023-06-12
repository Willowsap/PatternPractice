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
        setAttackType(new AttackWithSword());
    }

    /**
     * Defends by raising a shield.
     * So basic. 5 ablative hp.
     */
    @Override
    public void defend()
    {
        System.out.println("*raises shield*");
        this.setStance(Stance.DEFENCE);
        addAblativeHp(5);
    }
}
