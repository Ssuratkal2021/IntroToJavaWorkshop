package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		

		// Get the user to enter an adjective
String adj= JOptionPane.showInputDialog("Enter in an adjective.");
		// Get the user to enter a type of liquid
String liquid= JOptionPane.showInputDialog("Enter in a type of liquid.");
		// Get the user to enter a body part
String body= JOptionPane.showInputDialog("Enter in a body part");
		// Get the user to enter a verb
String verb= JOptionPane.showInputDialog("Enter in a verb");
		// Get the user to enter a place
String place= JOptionPane.showInputDialog("Enter in a place");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null,"Piranhas are more "+adj+ " during the day, so cross the river at night.\n" +"Piranhas are attracted to fresh" +liquid+ " and will most likely take a bite out of your " +body+ " if you " +verb+" . \n+ "+ " Whatever you do, if you have an open wound, try to find another way to get back to the" +place+ " .\n" + " Good luck!");
		
		// use +\n to create a new line and also before that you will have to end the string on the previous line.

	}
}

