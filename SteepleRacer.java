import kareltherobot.*;
import java.awt.Color;
public class SteepleRacer extends Racer
{
    public SteepleRacer(int street, int avenue, Direction dir, int beepers)
    {
        super(street, avenue, dir, beepers);
    }
    
    public void jumpUp()
    {
       boolean top = false;
       turnLeft();
       while(top == false)
       {
           move();
           turnRight();
           if(frontIsClear())
           {
               top = true;
           }
           else
           {
               turnLeft();
           }
       }
    }
    
    public void glideDown()
    {
        move();
        turnRight();
        while(frontIsClear())
        {
            move();
        }
    }
}