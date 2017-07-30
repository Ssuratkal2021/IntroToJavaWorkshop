package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot sara= new Robot ();
		sara.penDown();
for (int i = 0; i < 4; i++) {
sara.move(100);
sara.turn(90);
}
		
		
		
	}
}
