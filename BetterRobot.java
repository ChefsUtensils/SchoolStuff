import kareltherobot.*;
import java.awt.Color;
public class BetterRobot extends UrRobot
{
    public BetterRobot(int street, int avenue, Direction dir, int beepers)
    {
        super(street, avenue, dir, beepers);
    }

    public BetterRobot(int street, int avenue, Direction dir, int beepers,

    Color col)

    {
        super(street, avenue, dir, beepers, col);
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }

    public void turnRight()
    {
        turnLeft();
        turnAround();
    }

    public void move(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            move();
        }
    }
    
    public void pickBeeper(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            pickBeeper();
        }
    }
    
    public void strafeL()
    {
        turnLeft();
        move();
        turnRight();
    }
    public void strafeR()
    {
        turnRight();
        move();
        turnLeft();
    }
    public void turnLGo()
    {
        turnLeft();
        move();
    }
    public void turnRGo()
    {
       turnRight();
       move();
    }
}