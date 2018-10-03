
/**
 * Stonebot.java  
 *
 * @author - Jane Doe
 * @author - Period n
 */ 

import kareltherobot.*;
public class Stonebot implements Directions
{
    public static void main (String [] args)
    {
        StonemasonBot bot = new StonemasonBot(1,1,East,100000);
        bot.fixChurch();

    }

    static
    { 
        World.readWorld("Stonemason2.kwld");
        World.setVisible(true);
        World.setDelay(1);
        World.showSpeedControl(true);
    }

}
