import kareltherobot.*;
public class Karel2_5 implements Directions
{
    public static void main (String [] args)
    {
        BetterRobot bot = new BetterRobot(3, 4, West, 0);
        bot.turnRight();
        bot.move(2);
        bot.turnLeft();
        bot.move(2);
        bot.turnLeft();
        bot.move(2);
        bot.turnLeft();
        bot.move();
        bot.pickBeeper();
        for (int i = 0; i <= 1; i++)
        {
            bot.turnLeft();
            bot.move();
        }
        bot.turnRight();
        bot.move();
        bot.turnRight();
        bot.move(2);
        bot.turnRight();
        bot.move(2);
    }
    static
    { 
        World.readWorld("fig2_5.kwld");
        World.setVisible(true);
        World.setDelay(30);
    }

}