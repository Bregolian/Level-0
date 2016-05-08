
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter and print
 * their boarding pass. You need to collect the following information: First name Last name Destination airport Birthday
 * (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY, M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String First = JOptionPane.showInputDialog("Welcome to airline registration please state your first name.");
		String Last = JOptionPane.showInputDialog("Please state your last name.");
		String Birth = JOptionPane.showInputDialog("Please state your date of birth.");
		String Gender = JOptionPane.showInputDialog("Please state your gender.");
		String Destination = JOptionPane.showInputDialog("Please state your desired destination.");
		JOptionPane.showMessageDialog(null, Last + "/" + First + " (" + Birth + "," + Gender + ")" + "Traveling to: " + Destination);
	}
}
