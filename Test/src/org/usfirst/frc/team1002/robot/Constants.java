/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1002.robot;

import edu.wpi.first.wpilibj.SerialPort;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class Constants {
	// We will have 4 CIMs running 4 sets of 2 mecanum wheels, each driven by a
	// VictorSP
	// basic robot info:
	public static double wheelDiameter = 4;
	public static double wheelCircumference = wheelDiameter * Math.PI;
	
	// umm, where should I start? how about motor controllers.
	public static int frontLeft = 0;
	public static int backLeft = 1;
	public static int frontRight = 2;
	public static int backRight = 3;
	// ok. now what? oh yeah, PID!
	public static double leftP = 0;
	public static double leftI = 0;
	public static double leftD = 0;
	public static double rightP = 0;
	public static double rightI = 0;
	public static double rightD = 0;
	// alright, onto a controller.
	public static int controller = 0;
	// encoders? sure!
	public static double pulsesPerRev = 128;
	public static double distancePerPulse = wheelCircumference / pulsesPerRev;
	
	public static boolean leftEncInverted = true;
	public static int leftEnc1 = 0;
	public static int leftEnc2 = 1;
	
	public static boolean rightEncInverted = false;
	public static int rightEnc1 = 2;
	public static int rightEnc2 = 3;
	// Gyro? Why not!
	public static Port gyro = SerialPort.Port.

}
