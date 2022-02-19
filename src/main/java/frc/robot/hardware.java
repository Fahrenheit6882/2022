package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.Joystick;

public class hardware 
{
    // Use this Class for keeping hardware declarations in one place.  :)   

    /**
     * Joysticks
     */
    private static Joystick drivergamepad = new Joystick(2);
    private static Joystick operatorGamepad = new Joystick(1);
    //motor controlers for declaring the drive constructor 
    private WPI_VictorSPX leftMotor; 
    private WPI_VictorSPX rightMotor;
    
    /**
     * Motor Controllers
     */
    public static Drive drive(leftMotor, rightMotor); //declears drive? i thought we did this in drive.java

     /**
      * Sensors
      */
    
      public static void init()
      {
          Joystick driveController = new Joystick(2);
          drive = new Drive(new WPI_VictorSPX(0), new WPI_VictorSPX(1)); //example of initializing Drive variable
      }
}
