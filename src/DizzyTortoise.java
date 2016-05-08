
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		String NumberOfSpins = JOptionPane.showInputDialog("How dizzy do you want the tortoise from 1-10?");
		int numberOfSpins = Integer.parseInt(NumberOfSpins);
		dance(numberOfSpins);
		/*
		 * 1. Use the dance method to make the Tortoise spin.
		 * 
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		 */

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
