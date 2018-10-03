
import kareltherobot.*;
public class SteepleRacerRunner implements Directions
{
    public static void main (String [] args)
    {
        SteepleRacer bot = new SteepleRacer(1, 1, East, 0);
        bot.runRace();
    }

    static
    { 
        World.readWorld("SteepleRacer.kwld");
        World.setVisible(true);
        World.setDelay(5);
        World.showSpeedControl(true);
    }

}
