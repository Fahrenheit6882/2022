package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

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
    public static Drive drive; 
   // public static WPI_VictorSPX climbMotorCtrl = new WPI_VictorSPX(3);
   public static CANSparkMax climbMotorCtrl = new CANSparkMax(4, MotorType.kBrushed);

    /**
     * Switches 
     */
    public static DigitalInput autoSwitch = new DigitalInput(9);
    //switch position holder
    public static boolean positionHolder = autoSwitch.get();
     /**
      * Servos
      */
    public static Servo plowRelease= new Servo(0);
    /**
     * camera
     */
   // public static UsbCamera pOVCamera = new UsbCamera("driverCamera", 0);
    
      public static void init()
      {
          driveController = new Joystick(2);
          // Set up drive train
          WPI_VictorSPX rc = new WPI_VictorSPX(1);
          rc.setInverted(true);
          drive = new Drive(new WPI_VictorSPX(0),  rc); //example of initializing Drive variable
      }




}
