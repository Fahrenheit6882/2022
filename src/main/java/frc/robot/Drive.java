package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class Drive {
 //declaring variables for left and right motors
private PWMVictorSPX leftMotorControler;
private PWMVictorSPX rightMotorControler;

Drive(double leftSpeed, double rightSpeed)
{
    leftMotorControler = leftSpeed;
    rightMotorControler = rightSpeed;
}

}
