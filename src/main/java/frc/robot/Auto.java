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
        //this lets it run for five-ish seconds where the robot goes forward at speed five and the hopefully stops
        if (autoTimer.get() <= 5.0)
        {
            hardware.drive.drive(0.5, 0.5);
        }
        else
        {
            hardware.drive.stop();
        }
        //I might need a line of code to stop the motors? I don't know for sure though
    }
    
}
