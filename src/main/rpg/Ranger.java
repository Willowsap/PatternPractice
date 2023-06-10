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
    }

    /**
     * Defends by diving in a bush.
     * I assume that is what rangers do.
     */
    @Override
    public void defend()
    {
        System.out.println("*dives in bush*");
        addAblativeHp(1);
    }

    /**
     * Attacks using a bow like a coward.
     * 5 base damage.
     */
    @Override
    public int attack()
    {
        System.out.println("*shoots bow*");
        return 5;
    }
    
}
