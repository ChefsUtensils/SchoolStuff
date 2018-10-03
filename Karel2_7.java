import kareltherobot.*;
public class Karel2_7 implements Directions
{
    public static void main (String [] args)
    {
        BetterRobot bot = new BetterRobot(5, 7, East, 0);
        bot.turnAround();
        bot.move(2);
        bot.pickBeeper();
        bot.move();
        bot.turnRGo();
        bot.pickBeeper();
        bot.turnLGo();
        bot.turnRGo();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.turnAround();
        bot.move(3);
        bot.turnLeft();
        bot.move(4);
    }
    static
    { 
        World.readWorld("fig2_7.kwld");
        World.setVisible(true);
        World.setDelay(30);
    }

}