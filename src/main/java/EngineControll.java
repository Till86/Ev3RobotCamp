import ev3dev.hardware.port.MotorPort;

/**
 * Created by tiga on 09.06.2016.
 */
public class EngineControll {
    public static long TIME_FOR_360 = 3000;
    public Engine engineLeft = new Engine(MotorPort.B);
    public Engine engineRight = new Engine(MotorPort.A);

    public void fullForward() {
        engineLeft.fullForward();
        engineRight.fullForward();
    }

    public void halfForward() {
        engineLeft.halfForward();
        engineRight.halfForward();
    }

    public void stop() {
        engineLeft.stop();
        engineRight.stop();
    }

    public void fullBackward() {
        engineLeft.fullBackward();
        engineRight.fullBackward();
    }

    public void halfBackward() {
        engineLeft.halfBackward();
        engineRight.halfBackward();
    }

    public void fullLeft() {
        engineLeft.fullBackward();
        engineRight.fullForward();
    }

    public void halfLeft() {
        engineLeft.halfBackward();
        engineRight.halfForward();
    }

    public void fullRight() {
        engineLeft.fullForward();
        engineRight.fullBackward();
    }

    public void halfRight() {
        engineLeft.halfForward();
        engineRight.halfBackward();
    }

    public void turnDegreesLeft(int degrees) {
        fullLeft();
        try {
            Thread.sleep(getTimeToTurn(degrees));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop();
    }

    public void turnDegreesRight(int degrees) {
        fullRight();
        try {
            Thread.sleep(getTimeToTurn(degrees));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop();
    }

    private long getTimeToTurn(int degrees) {
        return (long) TIME_FOR_360 / (360 * degrees);
    }
}
