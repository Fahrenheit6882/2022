package frc.robot;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration;

import edu.wpi.first.wpilibj.Joystick;

public class hardware 
{
    // Use this Class for keeping hardware declarations in one place.  :)   

    /**
     * Joysticks
     */
    public static Joystick driveController;

    /**
     * Motor Controllers
     */


     /**
      * Sensors
      */
    
      public static void init()
      {
          driveController = new Joystick(2);
      }
}
