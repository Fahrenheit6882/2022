package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class Drive {
 //declaring variables for left and right motors
private PWMVictorSPX leftMotor = new PWMVictorSPX(0); //ports 0 and 1
private PWMVictorSPX rightMotor = new PWMVictorSPX(2); //ports 2 and 3

Drive(PWMVictorSPX leftMotorControler, PWMVictorSPX rightMotorControler)
{
 leftMotorControler = leftMotor;
 rightMotorControler = rightMotor;
}

public void drive(double leftSpeed, double rightSpeed)
{
    leftMotor.set(leftSpeed);
    rightMotor.set(rightSpeed);
}


public void Stop(double leftSpeed, double rightSpeed)
{
    leftSpeed = 0;
    rightSpeed = 0;
    leftMotor.set(leftSpeed);
    rightMotor.set(rightSpeed);
}
}
