import kareltherobot.*;
import java.awt.Color;
public class SuperRobot extends Robot
{
    public SuperRobot(int street, int avenue, Direction dir, int beepers)
    {
        super(street, avenue, dir, beepers);
    }
    
    public SuperRobot(int street, int avenue, Direction dir, int beepers,

    Color col)

    {
        super(street, avenue, dir, beepers, col);
    }

    public void move(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            if (frontIsClear())
            {
                super.move();
            }
            else if(!frontIsClear())
            {
                turnAround();
            }
        }
    }
    
    public void moveIfClear()
    {
       if (frontIsClear())
            {
                super.move();
            } 
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
    
    public void pickBeeper(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            if (nextToABeeper())
            {
                super.pickBeeper();
            }
        }
    }
    
    public void faceSouth()
    {
        while(!facingSouth())
        {
            turnLeft();
        }
    }
    
    public void faceNorth()
    {
        while(!facingNorth())
        {
            turnLeft();
        }
    }
    
    public void faceEast()
    {
        while(!facingEast())
        {
            turnLeft();
        }
    }
    
    public void faceWest()
    {
        while(!facingWest())
        {
            turnLeft();
        }
    }
    
    public void putIfBeeper()
    {
        if(anyBeepersInBeeperBag())
        {
            putBeeper();
        }
        else
        {
            move();
        }
    }
    
    public void pickIfBeeper()
    {
        if(nextToABeeper())
        {
            pickBeeper();
        }
        else
        {
            move();
        }
    }
}
