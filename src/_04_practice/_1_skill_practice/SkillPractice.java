package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String numberdimes = JOptionPane.showInputDialog(" How many dime do you have?");

		int dimes = Integer.parseInt(numberdimes);
		int cents = dimes * 10;
		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have " + cents + " cents");

		// Ask the user how tall they are (inches)
		String heights = JOptionPane.showInputDialog("What is your height???");
		int heighti = Integer.parseInt(heights);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (heighti < 36) {
			JOptionPane.showMessageDialog(null, "You need to eat your wheaties");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random r = new Random();
		int i = r.nextInt(20);
		int t = r.nextInt(10);
		System.out.println(i);
		// Get another random number that is less than 10 and print it to the console
		System.out.println(t);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		System.out.println(i - t);
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("Which city do you live in?");
		if (city.contentEquals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City.");
		} else {
			JOptionPane.showMessageDialog(null, "You need to move to San Diego");
		}
		// If they answered "San Diego", tell them they live in America's Finest City

		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		int cars = 2;
		if(cars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		}else if(cars == 1) {
			JOptionPane.showMessageDialog(null, "I do not know what to do with your numbers of cars.");
		}else if (cars >= 2) {
			JOptionPane.showMessageDialog(null,"You have many wheels on your cars");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
String school = JOptionPane.showInputDialog(" What  is the name of your school");
		// In another pop-up, tell the user, that their school is a fantastic school. //
JOptionPane.showMessageDialog(null, school + " Is a great school.");
		// You must include the name of the school in the message.

	}
}
