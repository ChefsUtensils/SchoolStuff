
import kareltherobot.*;
public class Testbot implements Directions
{
    public static void main (String [] args)
    {
        SuperRobot bot = new SuperRobot(4,5,North,1);
        bot.pickIfBeeper();
        bot.pickIfBeeper();
    }

    static
    { 
        World.readWorld("fig2_7.kwld");
        World.setVisible(true);
        World.setDelay(60);
        World.showSpeedControl(true);
    }

}
