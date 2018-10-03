import kareltherobot.*;
public class Karel2_4 implements Directions
{
    public static void main (String [] args)
    {
        BetterRobot bot = new BetterRobot(5, 4, East, 0);
        for (int i = 0; i <= 4; i++)
        {
            bot.move(3);
            bot.turnLeft();
        }
    }
    static
    { 
        World.readWorld("fig2_4.kwld");
        World.setVisible(true);
        World.setDelay(30);
    }

}