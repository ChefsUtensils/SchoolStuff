
import kareltherobot.*;
public class CompoundConditionals2 implements Directions
{
    public static void main (String [] args)
    {
        Robot bot = new Robot(5, 1, East, 0);
        while(true)
        {
            if(!bot.nextToABeeper() && !bot.frontIsClear() || bot.frontIsClear() && (bot.facingNorth() || bot.facingSouth()))
            {
                bot.turnLeft();
                bot.move();
            }
            else if(bot.nextToABeeper() && (bot.facingEast() || bot.facingWest()))
            {
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
                bot.move();
            }
            bot.move();
        }
    
    }

    static
    { 
        World.readWorld("CompoundConditionals2.kwld");
        World.setVisible(true);
        World.setDelay(30);
        World.showSpeedControl(true);
    }

}
