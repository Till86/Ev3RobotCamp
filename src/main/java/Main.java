import ev3dev.hardware.motor.EV3LargeRegulatedMotor;
import ev3dev.hardware.port.*;
import ev3dev.hardware.sensor.ev3.*;
import lejos.utility.Delay;

/**
 * Created by tiga on 09.06.2016.
 */
public class Main {


    //Robot Definition
    private final static EV3LargeRegulatedMotor MOTOR_RIGHT = new EV3LargeRegulatedMotor(MotorPort.A);
    private final static EV3LargeRegulatedMotor MOTOR_LEFT = new EV3LargeRegulatedMotor(MotorPort.B);
    private final static EV3IRSensor DISTANCE_SENSOR = new EV3IRSensor(SensorPort.S1);
    private final static EV3ColorSensor COLOR_SENSOR = new EV3ColorSensor(SensorPort.S2);




    //Configuration
    private final static int motorSpeed = 500;

    public static void main(String[] args) {
        EV3LargeRegulatedMotor motor = new EV3LargeRegulatedMotor(MotorPort.A);
        motor.setIntegerAttribute("duty_cycle_sp", 100);
        motor.setSpeed(500);
        int i=0;
        while(i<10000){
            motor.forward();
            i++;
        }
        System.out.println("dance1");

        FightControll fightControll = new FightControll();
        fightControll.startFighting();
//        while (true) {
//            MOTOR_LEFT.setSpeed(motorSpeed);
//            MOTOR_RIGHT.setSpeed(motorSpeed);
//            MOTOR_LEFT.forward();
//            MOTOR_RIGHT.backward();
//        }
//        final SampleProvider sp = DISTANCE_SENSOR.getDistanceMode();
//        final SensorMode redMode = COLOR_SENSOR.getRedMode();
//
//
//        int distance = 255;
//
//        final int distance_threshold = 35;
//
//        //Robot control loop
//        final int iteration_threshold = 100;
//        for(int i = 0; i <= iteration_threshold; i++) {
//            forward();
//
//            float [] sample = new float[sp.sampleSize()];
//            sp.fetchSample(sample, 0);
//            distance = (int)sample[0];
//            if(distance <= distance_threshold){
//                backwardWithTurn();
//            }
//
//            System.out.println("Iteration: " + i);
//            System.out.println("Battery: " + Battery.getInstance().getVoltage());
//            System.out.println("Distance: " + distance);
//            System.out.println();
//        }
//
//        MOTOR_RIGHT.stop();
//        MOTOR_LEFT.stop();
//        System.exit(0);
    }

    private static void forward(){
        MOTOR_RIGHT.setSpeed(motorSpeed);
        MOTOR_LEFT.setSpeed(motorSpeed);
        MOTOR_RIGHT.forward();
        MOTOR_LEFT.forward();
    }

    private static void backwardWithTurn(){
        MOTOR_RIGHT.backward();
        MOTOR_LEFT.backward();
        Delay.msDelay(1000);
        MOTOR_RIGHT.stop();
        MOTOR_LEFT.stop();
        MOTOR_RIGHT.backward();
        MOTOR_LEFT.forward();
        Delay.msDelay(1000);
        MOTOR_RIGHT.stop();
        MOTOR_LEFT.stop();
    }
}
