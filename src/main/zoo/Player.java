package zoo;

public abstract class Player
{
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

    public abstract void defend();
    public abstract void attack();
}