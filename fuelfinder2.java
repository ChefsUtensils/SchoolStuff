
/**
 * fuelfinder2.java  
 *
 * @author - Jane Doe
 * @author - Period n
 */ 

import kareltherobot.*;
public class fuelfinder2 implements Directions
{
    public static void main (String [] args)
    {
    // create and exercise robots here.
    FuelFinderRobot bot = new FuelFinderRobot(1, 1, North, 0, 5);
    for (int b = 0; b<=4; b++)
        {
            bot.turnRight();
            bot.move(4);
            bot.turnLeft();
            bot.move();
            bot.pickBeeper();
            bot.turnLeft();
            bot.move(4);
            bot.turnRight();
            bot.move();
            bot.pickBeeper();
        }
    bot.pickBeeper(9);
    }

    static
    { 
        World.readWorld("fuelfinder2.kwld");
        World.setVisible(true);
        World.setDelay(5);
        World.showSpeedControl(true);
    }

}
