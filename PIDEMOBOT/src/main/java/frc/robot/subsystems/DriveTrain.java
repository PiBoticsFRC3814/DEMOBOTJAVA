/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveJoy;

import com.ctre.phoenix.motorcontrol.can.*;
import com.kauailabs.navx.frc.AHRS;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  
  WPI_TalonSRX lf;
  WPI_TalonSRX lr;
  WPI_TalonSRX rf;
  WPI_TalonSRX rr;

  MecanumDrive piboticsDrive;

  AHRS gyro;

  public DriveTrain(){
    lf = new WPI_TalonSRX(RobotMap.drive_lf);
    lr = new WPI_TalonSRX(RobotMap.drive_lr);
    rf = new WPI_TalonSRX(RobotMap.drive_rf);
    rr = new WPI_TalonSRX(RobotMap.drive_rr);

    piboticsDrive = new MecanumDrive(lf, lr, rf, rr);

    gyro = new AHRS(Port.kMXP);
  }
  
  public void mecanumDrive(double x, double y, double z, double gyro){
    piboticsDrive.driveCartesian(y, x, z, gyro);
  }

  public double getAngle(){
    return gyro.getYaw();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveJoy());
  }
}
