//package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Teleop {
    private  final PWMSparkMax m_leftDrive = new PWMSparkMax(0);
    private  final PWMSparkMax m_rightDrive = new PWMSparkMax(1);
    private  final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftDrive, m_rightDrive);
    private  final Joystick m_stick = new Joystick(0);
    private  final Timer m_timer = new Timer();

     /** This function is run once each time the robot enters Teleop mode. */
    public static void teleopInit()
    {
        m_timer.reset();
        m_timer.start();

                // Drive for 2 seconds
    if (m_timer.get() < 2.0) {
        m_robotDrive.arcadeDrive(0.5, 0.0); // drive forwards half speed
      } else {
        m_robotDrive.stopMotor(); // stop robot
    }

    /** This function is called periodically during Teleop. */
    public static void teleopPeriodic()
    {
        //myButton.toggleWhenPressed(new StartEndCommand(mySubsystem::onMethod, mySubsystem::offMethod, mySubsystem));

      }
    }
}
