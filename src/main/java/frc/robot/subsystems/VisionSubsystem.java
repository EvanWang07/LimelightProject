package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.LimelightConstants;

import frc.robot.LimelightHelpers;

// import edu.wpi.first.networktables.NetworkTable;
// import edu.wpi.first.networktables.NetworkTableEntry;
// import edu.wpi.first.networktables.NetworkTableInstance;

public class VisionSubsystem extends SubsystemBase {
    private double tx;
    private double ty;
    private double ta;
    private boolean tv;

    // NetworkTable table = NetworkTableInstance.getDefault().getTable("scorps");
    // NetworkTableEntry tx = table.getEntry("tx");

    public VisionSubsystem() {
        // LimelightHelpers.SetFiducialIDFiltersOverride(LimelightConstants.limelightName, LimelightConstants.validAprilTags);
    }

    public double getTX() {
        return tx;
    }

    public double getTY() {
        return ty;
    }

    public double getTA() {
        return ta;
    }

    public boolean hasValidTargets() {
        return tv;
    }

    @Override
    public void periodic() {
        tx = LimelightHelpers.getTX(LimelightConstants.limelightName);
        ty = LimelightHelpers.getTY(LimelightConstants.limelightName);
        ta = LimelightHelpers.getTA(LimelightConstants.limelightName);
        tv = LimelightHelpers.getTV(LimelightConstants.limelightName);
        System.out.println(tx + ", " + ty + ", " + ta + ", " + tv);
        // double TX = tx.getDouble(0.0);
        // System.out.println(TX);
    }
}
