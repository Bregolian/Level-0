
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Nickel = JOptionPane.showInputDialog("How many nickels do you have?");

		int nickel = Integer.parseInt(Nickel);

		// Convert their answer to an int using Integer.parseInt()
		String Dime = JOptionPane.showInputDialog("How many dimes do you have?");

		int dime = Integer.parseInt(Dime);
		// Ask the user how many dimes they have, and convert their answer
		String Quarter = JOptionPane.showInputDialog("How many quarters do you have?");

		int quarter = Integer.parseInt(Quarter); // Ask the user how many quarters they have, and convert their answer
		String Penny = JOptionPane.showInputDialog("How many pennies do you have?");

		int penny = Integer.parseInt(Penny);
		// Calculate how much money the user has and save it in a double variable
		int Change = penny + dime * 10 + nickel * 5 + quarter * 25;
		JOptionPane.showMessageDialog(null, Change + " cents");
		// Tell the user how much money they have

	}
}
