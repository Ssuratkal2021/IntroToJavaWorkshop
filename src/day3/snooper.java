package day3;

import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Congrats, you just won a million dollars, what's your name?");
		JOptionPane.showMessageDialog(null, "Hi " +name+ " thanks for participating in this contest.");
		String address =JOptionPane.showInputDialog("to send the check, we need to know your address.");
		JOptionPane.showMessageDialog(null, "Great, we will be sending the check to " +address);
		String age= JOptionPane.showInputDialog("Next, we need to know your date of birth?");
		JOptionPane.showMessageDialog(null, "Good! Your "+age+ " is limits.");
		String color= JOptionPane.showInputDialog("We wanted to send balloons, so we need to know what your favorite color is.");
		JOptionPane.showMessageDialog(null, "Awesome! Let's move onto the next question.");
		String number= JOptionPane.showInputDialog("For the balloons, we want to know what your favorite number is.");
		JOptionPane.showMessageDialog(null, "Ok, we will be sending you "+number+ " balloons.");
		JOptionPane.showMessageDialog(null, "Thanks again for participating! We will be sending you A MILLION DOLLARS soon!");
}
}
