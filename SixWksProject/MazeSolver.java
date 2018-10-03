import kareltherobot.*;
import java.awt.Color;
public class MazeSolver extends Robot
{
    int Movement;
    int TurnCount;
    public MazeSolver(int street, int avenue, Direction dir, int beepers, int movement, int turnCount)
    {
        super(street, avenue, dir, beepers);
        Movement = movement;
        TurnCount = turnCount;
    }

    public void solveMaze()
    {
        while(!nextToABeeper())
        {    
            spinBot();
        }
        pickBeeper();
        countStuff();
        move();
    }

    public void spinBot()
    {
        turnLeft();
        //checks if, to the left of the robot, the front is clear, if so, it will move and increment the Movement value
        if(frontIsClear())
        {
            move();
            Movement ++;
        }
        else
        {
            /*should the left not be clear, it will check in front of itself for a spot to move, if clear it will 
             * move there and and increment the Movement value
             */
            turnRight();
            if(frontIsClear())
            {
                move();
                Movement ++;
            }
            else
            {
                //checks if behind it is clear, if so it will move and increment the Movement value
                turnRight();
                if(frontIsClear())
                {
                    move();
                    Movement ++;
                }
                else
                {
                    //checks if its left is clear and if so will move and increment the Movement value
                    turnRight();
                    if(frontIsClear())
                    {
                        move();
                        Movement ++;
                    }
                }
            }
        }
    }

    public void countStuff()
    {
        //places as many beepers as movement commands in the entire program
        for(int i = 1; i <= Movement; i++)
        {
            putBeeper();
        }
        turnAround();
        move();
        //places as many beepers as turn commands in the entire program
        for(int i = 1; i <= TurnCount; i++)
        {
            putBeeper();
        }
        //prints the values of Movement an TurnCount in the console
        System.out.println("Treasure bot moved " + Movement + " times");
        System.out.println("Treasure bot turned " + TurnCount + " times");
    }

    public void turnRight()
    {
        //turns right and increments TurnCount by 3
        turnLeft();
        turnLeft();
        turnLeft();
        TurnCount += 3;
    }
    
    public void turnAround()
    {
        //turns around and increments TurnCount by 2
        turnLeft();
        turnLeft();
        TurnCount += 2;
    }
}