package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	public static void main(String [] args) {
	Robot n = new Robot();
	String shape = JOptionPane.showInputDialog(" which shape would you like to draw.");
	if(shape.contentEquals("square")) {
		drawsquare(n,100);
	}else if(shape.contentEquals("triangle")) {
		drawTri(n,100);
	}else {
		drawcircle(n,100);
	}
}
public static void drawsquare(Robot robot,int size) {
	robot.setSpeed(100);
	robot.penDown();
for(int i= 1; i <= 4;i++) {
	robot.move(size);
	robot.turn(90);
}
}
public static void drawTri(Robot robot, int size) {
robot.setSpeed(100);
robot.penDown();
	for (int i = 1; i <=  3; i ++) {
		robot.move(size);
		robot.turn(120);
	}
}
public static void drawcircle(Robot robot, int size) {
	robot.setSpeed(300000);
	robot.penDown();
	for(int i = 1; i <= 360; i ++) {
	robot.move(size/100);
	robot.turn(1);
	}
}
}

