package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	//int ra;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	int ra = ran.nextInt(4);
		// 3. Print your variable to the console
	System.out.println(ra);
		// 4. Get the user to enter something that they think is awesome
	String prompt =  JOptionPane.showInputDialog("Enter something cool");
		// 5. If your variable is  0
	if (ra == 0) {
		String cool = "That's awesome!";
		JOptionPane.showMessageDialog(null,cool);
	}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if (ra == 1) {
		String cool = "That's ok";
		JOptionPane.showMessageDialog(null,cool);
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if (ra == 2) {
		String cool = "That's boring";
		JOptionPane.showMessageDialog(null,cool);
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	if (ra == 3) {
		String cool = "Crepuscular animals like lions are active at dawn and dusk.";
		JOptionPane.showMessageDialog(null,cool);
	}
			// -- invent your own message to give to the user (be nice).
	}
}
