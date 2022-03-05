package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;

public class hardware 
{
    // Use this Class for keeping hardware declarations in one place.  :)   

    /**
     * Joysticks
     */
    //private static Joystick drivecContorller = new Joystick(1); (for use if we need to use other controller. check for port number in frc drive station)
    public static Joystick driveController;
    
    /**
     * Motor Controllers
     */
    public static Drive drive; //declears drive? i thought we did this in drive.java
    /**
     * Switches (not sure how to declare)
     */
    public static autoEdgeStart switch; 
     /**
      * Servo
      */
    public static Servo plowRelease = null;
    
      public static void init()
      {
          driveController = new Joystick(2);

          // Set up drive train
          WPI_VictorSPX rc = new WPI_VictorSPX(1);
          rc.setInverted(true);
          drive = new Drive(new WPI_VictorSPX(0),  rc); //example of initializing Drive variable
      }
}
