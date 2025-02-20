package org.frcteam2910.mk3;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import org.frcteam2910.common.robot.UpdateManager;
import org.frcteam2910.mk3.subsystems.DrivetrainSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
    private RobotContainer robotContainer;
    private UpdateManager updateManager;
    

    @Override
    public void robotInit() {
        robotContainer = new RobotContainer();
        updateManager = new UpdateManager(
                robotContainer.getDrivetrainSubsystem()
        );
        updateManager.startLoop(5.0e-3);
    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
        SmartDashboard.putNumber("Gyro Angle", robotContainer.getGyroAngle());
        
    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void testInit() {
    }

    @Override
    public void testPeriodic() {
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void teleopInit() {
    }
}
