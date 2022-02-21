package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.Joystick;

public class hardware 
{
    // Use this Class for keeping hardware declarations in one place.  :)   

    /**
     * Joysticks
     */
    //private static Joystick drivecContorller = new Joystick(1); (for use if we need to use other controller. check for port number in frc drive station)
    public static Joystick driveController;
    //motor controlers for declaring the drive constructor 
    private WPI_VictorSPX leftMotor; 
    private WPI_VictorSPX rightMotor;
    
    /**
     * Motor Controllers
     */
    public static Drive drive; //declears drive? i thought we did this in drive.java

     /**
      * Sensors
      */
    
      public static void init()
      {
          driveController = new Joystick(2);
          drive = new Drive(new WPI_VictorSPX(0), new WPI_VictorSPX(1)); //example of initializing Drive variable
      }
}
