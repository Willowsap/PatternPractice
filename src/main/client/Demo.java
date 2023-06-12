package client;

import java.util.ArrayList;
import rpg.Player;
import rpg.Ranger;
import rpg.Rogue;
import rpg.Warrior;
import rpg.Wizard;

/**
 * Demos our rpg "game" if you can call it that.
 * 
 * @author Willow Sapphire
 * @version 06/08/2023
 */
public class Demo
{
    /**
     * Runs a simple demo of our rpg characters.
     * 
     * @param args unused
     */
    public static void main(String[] args)
    {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Wizard("Altea"));
        players.add(new Warrior("Magnus"));
        players.add(new Ranger("Iseul"));
        players.add(new Rogue("Tyler"));
        randomBrawl(players);
    }

    /**
     * Has all of the players perform random actions until
     * only one remains.
     * 
     * @param players the players to participate
     */
    public static void randomBrawl(ArrayList<Player> players)
    {
        while (players.size() > 1)
        {
            int currPlayer = (int) (Math.random() * players.size());
            Player player = players.get(currPlayer);
            if (Math.random() > .5)
            {
                int target = (int) (Math.random() * players.size());
                while (target == currPlayer)
                {
                    target = (int) (Math.random() * players.size());
                }
                System.out.printf("%s attacks!\n", player.getName());
                int dmg = player.attack();
                int initHp = players.get(target).getHitpoints();
                players.get(target).takeDamage(dmg);
                System.out.printf("%s is injured for %d hp!\n",
                    players.get(target).getName(),
                    initHp - players.get(target).getHitpoints());
                if (players.get(target).passedOut())
                {
                    players.remove(target);
                }
            }
            else
            {
                System.out.printf("%s defends!\n", player.getName());
                player.defend();
            }
            System.out.println();
        }
        for (Player p : players)
        {
            if (!p.passedOut())
            {
                System.out.printf("Player %s won!\n", p.getName());
            }
        }
    }
}
