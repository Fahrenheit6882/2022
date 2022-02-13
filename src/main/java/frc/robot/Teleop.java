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
        //when button A (1) is pressed ==> print out LY and RY axis
        if(hardware.driveController.getRawButtonPressed(1))
        {
          double LYaxis = hardware.driveController.getRawAxis(9);
          double RYaxis = hardware.driveController.getRawAxis(9);
          System.out.println(LYaxis);
          System.out.println(RYaxis);
        }
      }
    }

