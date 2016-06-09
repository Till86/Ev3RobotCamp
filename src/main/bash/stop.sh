export PATH=$PATH:/home/robot/ejre1.7.0_60/bin
#java -jar ev3-1.0-SNAPSHOT.jar
echo 100 > /sys/class/tacho-motor/motor10/duty_cycle_sp
echo -100 > /sys/class/tacho-motor/motor9/duty_cycle_sp

echo stop > /sys/class/tacho-motor/motor10/command
echo -500 > /sys/class/tacho-motor/motor9/speed_sp
echo stop > /sys/class/tacho-motor/motor9/command

