
/**
 * fuelfinderrobot.java  
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 */ 
import kareltherobot.*;
public class FuelFinderRobot extends UrRobot
{
    int Fuel;
    public FuelFinderRobot(int streets, int avenues, Direction dir, int beepers, int fuel)
    {
        super(streets, avenues, dir, beepers);
        Fuel = fuel;
    }
    
    public void move(int times)
    {
       for (int i = 1; i <= times; i++)
       {
            if(Fuel>0)
            {
                super.move();
                Fuel -= 1;
            }
            else
            {
                turnOff();
            }
       }
    }
    
    public void pickBeeper()
    {
        super.pickBeeper();
        Fuel += 5;
    }
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void pickBeeper(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            super.pickBeeper();
            Fuel += 5;
        }
    }
}
