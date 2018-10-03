
import kareltherobot.*;
public class RacerRunner implements Directions
{
    public static void main (String [] args)
    {
        Racer bot = new Racer(1, 1, East, 0);
        bot.runRace();

    
    }

    static
    { 
        World.readWorld("Racer.kwld");
        World.setVisible(true);
        World.setDelay(5);
        World.showSpeedControl(true);
    }

}
