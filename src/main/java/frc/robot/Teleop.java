package frc.robot;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;

public class Teleop {
 
       private static final Timer m_timer = new Timer();
  
    
     /** This function is run once each time the robot enters Teleop mode. */
    public static void teleopInit()
    {
        m_timer.reset();
        m_timer.start();

                // Drive for 2 seconds
    // if (m_timer.get() < 2.0) {
    //     m_robotDrive.arcadeDrive(0.5, 0.0); // drive forwards half speed
    //   } else {
    //     m_robotDrive.stopMotor(); // stop robot
    // }
  }

    /** This function is called periodically during Teleop. */
    public static void teleopPeriodic()
      {
        //myButton.toggleWhenPressed(new StartEndCommand(mySubsystem::onMethod, mySubsystem::offMethod, mySubsystem));

      }
    }

