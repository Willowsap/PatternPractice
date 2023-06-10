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
    }

    /**
     * Defends by raising a shield.
     * So basic. 10 ablative hp.
     */
    @Override
    public void defend()
    {
        System.out.println("*raises shield*");
        addAblativeHp(5);
    }

    /**
     * Attacks with a sword.
     * So basic. 5 dmg.
     */
    @Override
    public int attack()
    {
        System.out.println("*swings sword*");
        return 5;
    }
}
