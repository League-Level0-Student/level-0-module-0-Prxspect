import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotTriangle {
public static void main(String[] args) {
	Robot it= new Robot();
	String color=JOptionPane.showInputDialog("What is your favorite color?");
	System.out.println(color);
	if(color.equals("red")) {
		it.penDown();
		it.setPenColor(Color.RED);
	}
	else if(color.equals("blue")) {
		it.penDown();
		it.setPenColor(Color.BLUE);
	}
	else if(color.equals("yellow")) {
		it.penDown();
		it.setPenColor(Color.YELLOW);
	}
	else {
		it.penDown();
		it.setRandomPenColor();
	}
	it.setSpeed(10);
	for (int i = 0; i < 3; i++) {
		it.turn(120);
	it.move(100);
	}
	it.penUp();
	it.move(100);
	it.sparkle();
	
			
}
}
