// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;

import frc.robot.commands.*;
import frc.robot.subsystems.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  // Controllers
  private final Joystick testController = new Joystick(OperatorConstants.controllerID);

  // Buttons
  private final JoystickButton testVision = new JoystickButton(testController, XboxController.Button.kA.value);

  // Subsystems 
  private final TestMotorSubsystem s_TestMotorSubsystem = new TestMotorSubsystem();
  private final VisionSubsystem s_VisionSubsystem = new VisionSubsystem();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    testVision.whileTrue(new TestVisionCommand(s_VisionSubsystem, s_TestMotorSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
