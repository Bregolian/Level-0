import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score = 0;
		String Catch = JOptionPane.showInputDialog("What can you catch but not throw?");
		if (Catch.equalsIgnoreCase("A cold")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Score++;
		} else {
			JOptionPane.showInputDialog("Wrong!");

		}
		String M = JOptionPane.showInputDialog("What occurs once in every minute, "
				+ "twice in every moment, yet never in a thousand years?");
		if (M.equalsIgnoreCase("m")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Score++;
		} else {
			JOptionPane.showInputDialog("Wrong!");

		}
		String Mary = JOptionPane.showInputDialog("Mary’s father has 5 daughters – Nana, Nene, Nini, Nono. What is the fifth daughters name?");
		if (Mary.equalsIgnoreCase("Mary")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Score++;
		} else {
			JOptionPane.showInputDialog("Wrong!");

		}
		String MT = JOptionPane.showInputDialog("What 5 letter word can you remove the first middle and last letter and still read it the same.");
		if (MT.equalsIgnoreCase("empty")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Score+=4;
		} else {
			JOptionPane.showInputDialog("Wrong!");

		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Congratulations your score is "+Score);
	}
}
