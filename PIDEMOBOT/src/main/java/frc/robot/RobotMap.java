/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //Drive train talons
  public static final int drive_lf = 10;
  public static final int drive_lr = 13;
  public static final int drive_rf = 12;
  public static final int drive_rr = 11;
  //control system
  public static final int oi_driver = 0;
  //pneumatics
  public static final int cannon_piston1 = 0;
  public static final int cannon_piston2 = 1;
  public static final int cannon_wheels = 20;

  public static final double deadzoneX = 0.1;
  public static final double deadzoneY = 0.1;
  public static final double deadzoneZ = 0.1;

}
