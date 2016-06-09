import ev3dev.hardware.motor.EV3LargeRegulatedMotor;
import ev3dev.hardware.port.MotorPort;

/**
 * Created by phiber on 6/9/16.
 */
public class SimpleTest {

    public static void main(String[] args) {
        EV3LargeRegulatedMotor motor = new EV3LargeRegulatedMotor(MotorPort.A);
        motor.setIntegerAttribute("duty_cycle_sp", 100);
        motor.setSpeed(500);
        while(true) {
            motor.forward();
        }
    }
}
