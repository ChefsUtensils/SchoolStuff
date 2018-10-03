import kareltherobot.*;
import java.awt.Color;
public class Racer extends SuperRobot
{
    public Racer(int street, int avenue, Direction dir, int beepers)
    {
        super(street, avenue, dir, beepers);
    }
    
    public void runRace()
    {
        while(!nextToABeeper())
        {
           if(nextToABeeper())
           {
               pickBeeper();
               turnOff();
            }
           raceStride();
        }
        pickBeeper();
        turnOff();
    }
    
    public void raceStride()
    {
       if(frontIsClear())
       {
        move();
       }
       else
       {
        jumpHurdle();
       }
    }
    
    public void jumpHurdle()
    {
        jumpUp();
        glideDown();
        turnLeft();
    }
    
    public void jumpUp()
    {
        turnLeft();
        move();
        turnRight();
        move();
    }
    
    public void glideDown()
    {
        turnRight();
        move();
    }
}