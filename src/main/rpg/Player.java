package rpg;

/**
 * Generic rpg player class.
 * 
 * @author Willow Sapphire
 * @version 06/08/2023
 */
public abstract class Player
{
    /**
     * The player's name.
     */
    private String name;

    /**
     * Constructs a new Player.
     * 
     * @param name the player's name
     */
    public Player(String name)
    {
        this.name = name;
    }

    /**
     * Getter for the name.
     * 
     * @return name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * How the player defends.
     */
    public abstract void defend();

    /**
     * How the player attacks.
     */
    public abstract void attack();
}
