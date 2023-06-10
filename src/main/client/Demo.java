package client;

import java.util.ArrayList;
import rpg.Player;
import rpg.Ranger;
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
        randomBrawl(players);
    }

    public static void randomBrawl(ArrayList<Player> players)
    {
        while (!onlyOneLeft(players))
        {
            int currPlayer = (int) (Math.random() * 3);
            Player player = players.get(currPlayer);
            if (Math.random() > .5)
            {
                int target = (int) (Math.random() * 3);
                while (target == currPlayer)
                {
                    target = (int) (Math.random() * 3);
                }
                System.out.printf("%s attacks!\n", player.getName());
                int dmg = player.attack();
                players.get(target).takeDamage(dmg);
                System.out.printf("%s is injured for %d hp!\n", players.get(target).getName(), dmg);
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

    public static boolean onlyOneLeft(ArrayList<Player> players)
    {
        int numLeft = 0;
        for (Player p : players)
        {
            if (!p.passedOut())
            {
                numLeft++;
            }
        }
        return numLeft <= 1;
    }
}
