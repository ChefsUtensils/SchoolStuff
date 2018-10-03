import kareltherobot.*;
import java.awt.Color;
public class StonemasonBot extends SuperRobot
{
    public StonemasonBot(int street, int avenue, Direction dir, int beepers)
    {
        super(street, avenue, dir, beepers);
    }

    public StonemasonBot(int street, int avenue, Direction dir, int beepers,

    Color col)

    {
        super(street, avenue, dir, beepers, col);
    }

    public void moveUntilWall()
    {
        while(frontIsClear())
        {
            move();
        }
    }

    public void fixChurch()
    {
        while(frontIsClear())
        {
            turnLeft();
            while(frontIsClear())
            {
                if(!nextToABeeper())
                {
                    putBeeper();
                }

                move();
            }
            if(!nextToABeeper())
            {
                putBeeper();
            }
            turnAround();
            moveUntilWall();
            turnLeft();
            if(frontIsClear())
            {
                move(4);
            }
            else
            {
                turnOff();
            }
        }
        turnLeft();
        while(frontIsClear())
        {
            if(!nextToABeeper())
            {
                putBeeper();
            }

            move();
        }
        if(!nextToABeeper())
        {
            putBeeper();
        }
    }
}
