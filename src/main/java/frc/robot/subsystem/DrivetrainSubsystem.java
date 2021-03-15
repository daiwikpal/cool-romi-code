// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new DrivetrainSubsystem. */

  Spark leftmotor, rightmotor;
  public DrivetrainSubsystem() {
    leftmotor = new Spark(Constants.DrivetrainConstants.LEFT_MOTOR_PORT);
    rightmotor = new Spark(Constants.DrivetrainConstants.RIGHT_MOTOR_PORT);
    rightmotor.setInverted(true);
  }

  public void Drive(double left_percent, double right_percent){
    leftmotor.set(left_percent);
    rightmotor.set(right_percent);
  }

  @Override
  public void periodic() {

    // This method will be called once per scheduler run
  }
}
