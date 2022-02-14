package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class Drive {
 //declaring variables for left and right motors
private PWMVictorSPX leftMotorControler = new PWMVictorSPX(0); //ports 0 and 1
private PWMVictorSPX rightMotorControler = new PWMVictorSPX(2); //ports 2 and 3

Drive(double leftSpeed, double rightSpeed)
{
    leftMotorControler.set(leftSpeed);
    rightMotorControler.set(rightSpeed);
}

}
