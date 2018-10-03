import kareltherobot.*;
public class Karel2_6 implements Directions
{
    public static void main (String [] args)
    {
        BetterRobot bot = new BetterRobot(1, 2, East, 1);
        bot.move();
        bot.turnLeft();
        bot.move(2);
        bot.turnRGo();
        bot.turnLeft();
        bot.move(2);
        bot.turnRGo();
        bot.putBeeper();
        bot.move();
        bot.turnRight();
        bot.move(2);
        bot.turnLGo();
        bot.turnRight();
        bot.move(2);
        bot.turnLGo();
    }
    static
    { 
        World.readWorld("fig2_6.kwld");
        World.setVisible(true);
        World.setDelay(30);
    }

}