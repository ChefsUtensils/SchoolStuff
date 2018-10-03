
import kareltherobot.*;
public class MazeSolverRobot implements Directions
{
    public static void main (String [] args)
    {
        MazeSolver bot = new MazeSolver(1, 1, East, 10000000, 0, 0);
        bot.solveMaze();
    }

    static
    { 
        World.readWorld("TreasureFinder1.kwld");
        World.setVisible(true);
        World.setDelay(1);
        World.showSpeedControl(true);
    }

}
