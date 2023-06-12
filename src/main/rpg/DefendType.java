package rpg;

/**
 * Strategy interface for the different defend methods.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public interface DefendType
{
    /**
     * Performs an defensive maneuver.
     * 
     * @return the amount of ablative hitpoints generated
     */
    public int defend();
}
