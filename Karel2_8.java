import kareltherobot.*;
public class Karel2_8 implements Directions
{
    public static void main (String [] args)
    {
        BetterRobot bot = new BetterRobot(4, 3, East, 0);
        bot.turnLGo();
        bot.move();
        bot.turnRGo();
        bot.move();
        bot.turnRight();
        for (int i = 0; i <= 3; i++)
        {
            bot.pickBeeper();
            bot.move();
        }
        bot.pickBeeper();
        bot.turnLGo();
        bot.move();
        bot.turnLGo();
        bot.move();
        bot.turnLeft();
        for (int i = 0; i <= 4; i++)
        {
            bot.putBeeper();
            bot.move();
        }
    }
    static
    { 
        World.readWorld("fig2_8.kwld");
        World.setVisible(true);
        World.setDelay(30);
    }

}