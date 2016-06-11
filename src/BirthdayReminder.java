 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String sistersBirthday = "March 23th";
		String dadsBirthday = "July 31th";
		String myBirthday = "November 23th";

		String Rule=JOptionPane.showInputDialog(null, "Whos birthday do you want to know?");
		// 2. Find out which birthday the user wants and and store their response in a variable
	if (Rule.equals("sister")) {
		JOptionPane.showMessageDialog(null, sistersBirthday);
	}
	else if (Rule.equals("dad")){
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}
	else if (Rule.equals("mine")){
		JOptionPane.showMessageDialog(null, myBirthday);
	}
	else{
		JOptionPane.showMessageDialog(null, "Sorry,I dont know "+Rule+ "'s birthday.");
	}
	// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
