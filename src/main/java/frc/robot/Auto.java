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
        if(start == false)
        {
            autoTimer.start();
            start = true;
        }

        if (autoTimer.get() >= 2.0)
        {
            autoTimer.stop();
            System.out.println("Timer has stopped");
        }
        
    }
    
}
