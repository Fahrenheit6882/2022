package frc.robot;


public class Teleop {
  
    
     /** This function is run once each time the robot enters Teleop mode. */
    public static void teleopInit()
    {
      
    }

    /** This function is called periodically during Teleop. */
    public static void teleopPeriodic()
      {
        //myButton.toggleWhenPressed(new StartEndCommand(mySubsystem::onMethod, mySubsystem::offMethod, mySubsystem));
        //in Teleop, call the Drive.drive method using the Joystick
        //axis parameters that will control either side of the drive train. 
        //Remember to multiply by -1 so that pushing the Joystick forward will
        // give a +1 to the drive function, per our discussion yesterday
        if(hardware.driveController.getRawButtonPressed(1))
        {
          double LYaxis = hardware.driveController.getRawAxis(1);
          double RYaxis = hardware.driveController.getRawAxis(5);
          System.out.println(LYaxis);
          System.out.println(RYaxis);
        }
      }
    }

