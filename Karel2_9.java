import kareltherobot.*;
public class Karel2_9 implements Directions
{
    public static void main (String [] args)
    {
        BetterRobot bot = new BetterRobot(3, 5, North, 0);
        bot.turnLGo();
        for (int b = 0; b <= 3; b++)
        {
            for (int i = 0; i <= 1; i++)
            {
                bot.turnRGo();
                bot.move();
            }
            for (int i = 0; i <= 3; i++)
            {
                bot.turnLGo();
                bot.move();
            }
            bot.turnRGo();
            bot.move();
            bot.turnRGo();
            bot.move();
        }
    }
    static
    { 
        World.readWorld("fig2_9.kwld");
        World.setVisible(true);
        World.setDelay(30);
    }

}