package frc.robot;


public class Teleop {
  
    
     /** This function is run once each time the robot enters Teleop mode. */
    public static void teleopInit()
    {
      hardware.plowRelease.set(-90.0);
    }

    /** This function is called periodically during Teleop. */
    public static void teleopPeriodic()
      {
       // to print out the switch position
       if(hardware.driveController.getRawButtonPressed(constants.BtnA))
       {
        System.out.println(hardware.positionHolder);
       }

        // Add code to drive based on driver input
        hardware.drive.drive(hardware.driveController.getRawAxis(constants.AxisLY) * -1.0, hardware.driveController.getRawAxis(constants.AxisRY) * -1.0);

        // Add code to change speed factor when either bumper is pressed
        if(hardware.driveController.getRawButtonPressed(constants.BtnRB) || hardware.driveController.getRawButtonPressed(constants.BtnLB))
        {
          hardware.drive.changeSpeed();
        }
      }
    }

