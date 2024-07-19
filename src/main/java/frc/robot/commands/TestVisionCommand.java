package frc.robot.commands;

import frc.robot.subsystems.VisionSubsystem;
import frc.robot.subsystems.TestMotorSubsystem;

import edu.wpi.first.wpilibj2.command.Command;

public class TestVisionCommand extends Command {
    private VisionSubsystem s_VisionSubsystem;
    private TestMotorSubsystem s_TestMotorSubsystem;
    
    public TestVisionCommand(VisionSubsystem s_VisionSubsystem, TestMotorSubsystem s_TestMotorSubsystem) {
        this.s_TestMotorSubsystem = s_TestMotorSubsystem;
        addRequirements(s_TestMotorSubsystem);

        this.s_VisionSubsystem = s_VisionSubsystem;
    }

    public void initialize() {

    }

    public void execute() {
        double speedMultiplier = 1 - s_VisionSubsystem.getTA();
        if (s_VisionSubsystem.hasValidTargets()) {
            s_TestMotorSubsystem.setTestMotorSpeed(speedMultiplier);
        }
    }

    public boolean isFinished() {
        return false;
    }

    public void end(boolean interrupted) {
        s_TestMotorSubsystem.brakeTestMotor();
    }
}
