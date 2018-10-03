
/**
 * Fuelfinder1.java  
 *
 * @author - Jane Doe
 * @author - Period n
 */ 

import kareltherobot.*;

public class Fuelfinder1 implements Directions
{
    public static void main (String [] args)
    {
    // create and exercise robots here.
        FuelFinderRobot bot = new FuelFinderRobot(1, 1, North, 0, 5);
        bot.move(3);
        bot.turnRight();
        bot.move();
        bot.pickBeeper();
        bot.move(2);
        bot.turnLeft();
        bot.move();
        bot.turnRight();
        bot.move();
        bot.pickBeeper();
        bot.move(3);
        bot.turnRight();
        bot.move();
        bot.pickBeeper();
        bot.turnLeft();
        bot.move();
        bot.turnRight();
        bot.move(3);
        bot.pickBeeper(10);
    }

    static
    { 
        World.readWorld("fuelfinder1.kwld");
        World.setVisible(true);
        World.setDelay(5);
        World.showSpeedControl(true);
    }

}
