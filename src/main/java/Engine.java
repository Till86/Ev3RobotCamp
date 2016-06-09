import ev3dev.hardware.motor.EV3LargeRegulatedMotor;

/**
 * Created by tiga on 09.06.2016.
 */
public class Engine {
    private final static int fullSpeed = 500;
    private final static int halfSpeed = 250;
    private final EV3LargeRegulatedMotor motor;

    public Engine(String motorPort) {
        motor=new EV3LargeRegulatedMotor(motorPort);
    }

    public void fullForward(){
        motor.setSpeed(fullSpeed);
        motor.forward();
    }

    public void halfForward(){
        motor.setSpeed(halfSpeed);
        motor.forward();
    }

    public void stop(){
        motor.stop();
    }

    public void fullBackward(){
        motor.setSpeed(fullSpeed);
        motor.backward();
    }

    public void halfBackward(){
        motor.setSpeed(halfSpeed);
        motor.backward();
    }
}
