package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class Auto 
{
    private static Timer autoTimer = new Timer();
    private static boolean start = false;

    public static void autoInit()
    {
        autoTimer.reset ();
    }

    public static void autoPeriodic()
    {
        //create and object for driving in auto
        Drive autoDrive = new Drive(); //I'm stuck on this error here
        if(start == false)
        { //starts time only once
            autoTimer.start();
            start = true;
        }
        //this lets it run for five-ish seconds where the robot goes forward at speed five and the hopefully stops
        if (autoTimer.get() <= 5.0)
        {
            autoDrive.drive(0.5, 0.5);
        }
        //I might need a line of code to stop the motors? I don't know for sure though
    }
    
}
