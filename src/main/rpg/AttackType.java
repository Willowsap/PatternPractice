package rpg;

/**
 * Strategy interface for the different attack methods.
 * 
 * @author Willow Sapphire
 * @version 06/12/2023
 */
public interface AttackType
{
    /**
     * Performs an attack.
     * 
     * @return the base amount of damage caused
     */
    public int attack();
}
