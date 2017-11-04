import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot it= new Robot();
	it.setSpeed(10);
	it.penDown();
	it.turn(90);
		it.move(200);
		it.turn(180);
		it.move(100);
		it.turn(-90);
		it.move(150);
		it.turn(90);
		it.move(80);
		it.penUp();
		it.move(100);
		it.turn(90);
		it.sparkle();
		



}
}
