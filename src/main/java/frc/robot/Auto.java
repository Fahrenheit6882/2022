package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class Auto 
{
    private static Timer autoTimer = new Timer();
    private static boolean started = false;

    public static void autoInit()
    {
        autoTimer.reset ();
        hardware.plowRelease.setAngle(90.0);
        System.out.println(hardware.autoSwitch.get());
    }

    public static void autoPeriodic()
    {
     //if(hardware.autoEdgeStart.get()==high)
       //{
            if(started == false)
            { //starts time only once
                autoTimer.start();
                started = true;
            }
            //this lets it run for five-ish seconds where the robot goes forward at speed five/6
            if (autoTimer.get() <= 1.5)
            {
                hardware.drive.drive(0.5, 0.6);
            }
            else //stops the motors when timer is more than 1.5 seconds
            {
                hardware.drive.stop();
            }
            //after the timer is past 1.5 it will turn for .4 seconds (change turn time or speeds to adjust angle) and stop all motors
            if (autoTimer.get() >= 1.5 && autoTimer.get() <= 2.5) 
            {
                hardware.drive.drive(-0.8, 0.9);
            }
            else //stops motors after timer reaches 1.9 seconds or more
            {
                hardware.drive.stop();
        }

    //}
    }
    
}
