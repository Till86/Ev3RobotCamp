import ev3dev.hardware.motor.EV3LargeRegulatedMotor;
import ev3dev.hardware.port.MotorPort;

/**
 * Created by tiga on 09.06.2016.
 */
public class FightControll {
    private final static EngineControll ENGINE = new EngineControll();

    public void startFighting(){
        ENGINE.turnDegreesRight(180);
        ENGINE.fullForward();
        waitForMillis(1500);
        ENGINE.stop();
        waitForMillis(1500);
        ENGINE.fullBackward();
        waitForMillis(1500);
        ENGINE.halfForward();
        waitForMillis(1500);
        ENGINE.stop();
        waitForMillis(1500);
        ENGINE.halfBackward();
        waitForMillis(1500);
        ENGINE.fullLeft();
        waitForMillis(1500);
        ENGINE.fullRight();
        waitForMillis(1500);
        ENGINE.halfLeft();
        waitForMillis(1500);
        ENGINE.halfRight();
        waitForMillis(1500);
        ENGINE.stop();
        waitForMillis(1500);
        ENGINE.turnDegreesLeft(90);

    }

    private void waitForMillis(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
