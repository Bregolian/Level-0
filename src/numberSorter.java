import java.util.Arrays;

import javax.swing.JOptionPane;

public class numberSorter {
	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("Give me a number.");
		String second = JOptionPane.showInputDialog("Give me a number.");
		String third = JOptionPane.showInputDialog("Give me a number.");
		int First = Integer.parseInt(first);
		int Second = Integer.parseInt(second);
		int Third = Integer.parseInt(third);
		int[] ints={First,Second,Third};
		Arrays.sort(ints);
		JOptionPane.showMessageDialog(null, ints[0]+" "+ints[1] +" "+ints[2]);
		JOptionPane.showMessageDialog(null, ints[2]+" "+ints[1] +" "+ints[0]);
		if (First > Second && Second > Third) {
			JOptionPane.showMessageDialog(null, First + Second + Third);
		} else if (Second > First && First > Third) {
			JOptionPane.showMessageDialog(null, Second + First + Third);

		} else if (First > Third && Third > Second) {
			JOptionPane.showMessageDialog(null, First + Third+Second);

		} else if (Second>Third&&Third>First) {
			JOptionPane.showMessageDialog(null, Second+Third+First);

		}
	}

}
