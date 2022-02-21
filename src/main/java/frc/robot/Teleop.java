package frc.robot;


public class Teleop {
  
    
     /** This function is run once each time the robot enters Teleop mode. */
    public static void teleopInit()
    {
      
    }

    /** This function is called periodically during Teleop. */
    public static void teleopPeriodic()
      {
        // Add code to drive based on driver input
        hardware.drive.drive(hardware.driveController.getRawAxis(1) * -1.0, hardware.driveController.getRawAxis(5) * -1.0);
      }
    }

