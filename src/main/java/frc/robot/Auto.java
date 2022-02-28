package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class Auto 
{
    private static Timer autoTimer = new Timer();
    private static boolean started = false;

    public static void autoInit()
    {
        autoTimer.reset ();
    }

    public static void autoPeriodic()
    {
        
        if(started == false)
        { //starts time only once
            autoTimer.start();
            started = true;
        }
        //this lets it run for five-ish seconds where the robot goes forward at speed five
        if (autoTimer.get() <= 5.0)
        {
            hardware.drive.drive(0.5, 0.5);
        }
        else //stops the motors when timer is more than five seconds
        {
            hardware.drive.stop();
        }
       
    }
    
}
