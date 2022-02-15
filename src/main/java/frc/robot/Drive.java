package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

/**
 * COMMENT YOUR CODE!!!!!!!!!!!!!!! In future, I refuse to review any code that is not commented. - Cassie
 */
public class Drive {
    //declaring variables for left and right motors
    private PWMVictorSPX leftMotor;
    private PWMVictorSPX rightMotor;

    /**
     * Constructor for a tank drive
     * @param leftMotorControler reference to motor controller for left side of bot
     * @param rightMotorControler reference to motor controller for right side of bot
     */
    Drive(PWMVictorSPX leftMotorControler, PWMVictorSPX rightMotorControler)
    {
        // Use the parameters passed to initialize the motor controllers of the bot
        this.leftMotor = leftMotorControler;
        this.rightMotor = rightMotorControler;
    }

    /**
     * This drive method is used to set the desired speed of each side of a tank drive.
     * @param leftSpeed desired speed of left side of drive.  Accepted values: -1 to +1
     * @param rightSpeed desired speed of right side of drive.  Aceepted values: -1 to +1
     */
    public void drive(double leftSpeed, double rightSpeed)
    {
        /**
         * HINT:
         * What would happen if you sent a value to one of the parameters that is outside the bounds
         * of acceptable values?  Recommend doing some 
         */
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }


    public void Stop(double leftSpeed, double rightSpeed)
    {
        /**
         * HINT: You don't need parameters for this method.
         * You are ALWAYS setting both left and right to 0.
         * You can do this by simply calling this.drive(0.0, 0.0)
         */
        leftSpeed = 0;
        rightSpeed = 0;
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }
}
