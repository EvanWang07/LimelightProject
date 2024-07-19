package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.TestMotorConstants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class TestMotorSubsystem extends SubsystemBase {
    public CANSparkMax testMotor;
    
    public TestMotorSubsystem() {
        testMotor = new CANSparkMax(TestMotorConstants.testMotorID, MotorType.kBrushless);
        testMotor.setInverted(TestMotorConstants.testMotorInvert);
    }

    public void setTestMotorSpeed(double speed) {
        testMotor.set(speed * TestMotorConstants.testMotorOutput);
    }

    public void brakeTestMotor() {
        testMotor.set(0);
    }

    @Override
    public void periodic() {

    }
}
