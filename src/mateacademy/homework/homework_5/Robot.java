package mateacademy.homework.homework_5;

public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean connectionStatus = false;
        RobotConnection currentRobotConnection = null;
        for (int i = 0; i < 3; i++) {
            if (!connectionStatus) {
                try {
                    currentRobotConnection = robotConnectionManager.getConnection();
                    currentRobotConnection.moveRobotTo(toX, toY);
                    connectionStatus = true;
                } catch (RobotConnectionException ex) {
                    if (i == 2) {
                        throw new RobotConnectionException("bad day :(");
                    }
                } finally {
                    try {
                        if (currentRobotConnection != null) {
                            currentRobotConnection.close();
                        }
                    } catch (RobotConnectionException ex) {
                    }
                }
            }
        }
    }
}
