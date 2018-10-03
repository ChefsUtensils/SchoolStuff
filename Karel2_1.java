
/**
 * Karel2_1.java 
 *
 * @author - Gordon Moore
 * @author - Period 5
 * @author - Id 3100331
 *
 * @author - I received help from ...
 *
 */

import kareltherobot.*;
import java.awt.Color;

public class Karel2_1 implements Directions
{
    public static void main(String[] args)
    {
        BetterRobot bot = new BetterRobot(2, 7, East, 0);
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.move(2);
        bot.turnLeft();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.turnLeft();
        bot.move(2);
        bot.turnLeft();
        bot.move();
        bot.putBeeper();
    }

    static
    {
        World.setVisible(true);
        World.readWorld("fig2_1.kwld");
        World.setDelay(30);
    }
}