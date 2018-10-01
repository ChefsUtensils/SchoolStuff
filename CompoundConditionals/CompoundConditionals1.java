import kareltherobot.*;
public class CompoundConditionals1 implements Directions
{
    public static void main (String [] args)
    {
        Robot bot = new Robot(5, 1, East, 0);
        while(true)
        {
            if(!bot.frontIsClear() && bot.nextToABeeper() || bot.frontIsClear() && bot.nextToABeeper())
            {
                bot.turnLeft();
            }
            else if(!bot.frontIsClear())
            {
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
            }
            bot.move();
        }

    
    }

    static
    { 
        World.readWorld("CompoundConditionals1.kwld");
        World.setVisible(true);
        World.setDelay(30);
        World.showSpeedControl(true);
    }

}
