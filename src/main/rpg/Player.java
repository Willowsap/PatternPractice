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
     * The way the player attacks.
     */
    private AttackType attackType;

    /**
     * The player's name.
     */
    private String name;

    /**
     * The player's hitpoints.
     */
    private int hp;

    /**
     * Extra hitpoints that absorb damage.
     */
    private int ablativeHp;

    /**
     * The player's current stance.
     */
    private Stance stance;

    /**
     * Constructs a new Player.
     * 
     * @param name the player's name
     */
    public Player(String name)
    {
        this.name = name;
        this.hp = 100;
        this.ablativeHp = 0;
        this.stance = Stance.NEUTRAL;
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
     * Getter for the player's hitpoints.
     * @return hp
     */
    public int getHitpoints()
    {
        return this.hp;
    }

    /**
     * Getter for the player's ablative hitpoints.
     * @return ablativeHp
     */
    public int getAblativeHitpoints()
    {
        return this.ablativeHp;
    }

    /**
     * Getter for the player's stance.
     * 
     * @return the player's stance
     */
    public Stance getStance()
    {
        return this.stance;
    }

    /**
     * Sets the player's stance.
     * 
     * @param stance the new player stance
     */
    public void setStance(Stance stance)
    {
        this.stance = stance;
    }

    /**
     * Takes damage from something.
     * In the attack stance damage is multiplied by 2.
     * In the defence stance damage is divided by 2;
     * The player will revert to the neutral stance after taking damage.
     * 
     * @param dmg the amount of damage to take
     */
    public void takeDamage(int dmg)
    {
        int totalDmg = dmg;
        switch (stance)
        {
            case ATTACK:
                totalDmg *= 2;
                break;
            case DEFENCE:
                totalDmg /= 2;
                break;
            case NEUTRAL:
        }
        if (this.ablativeHp > totalDmg)
        {
            this.ablativeHp -= totalDmg;
        }
        else if (this.ablativeHp > 0)
        {
            totalDmg -= this.ablativeHp;
            this.ablativeHp = 0;
            this.hp -= totalDmg;
        }
        else
        {
            this.hp -= totalDmg;
        }
        if (this.hp < 50)
        {
            switchAttackType(getBackupAttack());
        }
        stance = Stance.NEUTRAL;
    }

    /**
     * Checks if the player has passed out.
     * The player passes out if their hp hits 0.
     * 
     * @return true if the player is passed out. false otherwise.
     */
    public boolean passedOut()
    {
        return this.hp <= 0;
    }

    /**
     * Adds ablative hitpoints to the current amount.
     * 
     * @param ablativeHp the amount of ablative hitpoints to add
     */
    public void addAblativeHp(int ablativeHp)
    {
        this.ablativeHp += ablativeHp;
    }

    /**
     * How the player defends.
     */
    public abstract void defend();

    /**
     * Gets the players backup attack for when they are low on health.
     * 
     * @return the backup attack type
     */
    public abstract AttackType getBackupAttack();

    /**
     * How the player attacks.
     * 
     * @return the number of damage caused.
     */
    public int attack()
    {
        this.stance = Stance.ATTACK;
        return attackType.attack();
    }

    /**
     * Setter for the player's attack type.
     * 
     * @param attackType the new attack type
     */
    public void switchAttackType(AttackType attackType)
    {
        this.attackType = attackType;
    }
}
