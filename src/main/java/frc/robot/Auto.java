package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class Auto 
{
    private static Timer autoTimer = new Timer();
    private static boolean start;

    public static void autoInit()
    {
        autoTimer.reset ();
    }

    public static void autoPeriodic()
    {
        autoTimer.start ();
        if (autoTimer.get()== 2.0)
        {
            autoTimer.stop();
            System.out.println("Timer has stopped");
        }
        
        start = false;
    }
    
}
