package day3;

import javax.swing.JOptionPane;

public class how_are_you {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, name);
	JOptionPane.showMessageDialog(null, "hi, how are you "+ name );
	
}
}
