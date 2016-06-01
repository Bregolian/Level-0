
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	/*
	 * Ask the user how many hours they spent coding this week.

	 * 1. If it's 3 or more, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
*/
public static void main(String[] args) {
	String Hrs=JOptionPane.showInputDialog("How many hours did you code this week");
int hrs=Integer.parseInt(Hrs);
if (hrs>=5) {
	playBatmanTheme();
}
	else if (hrs>=3) {
	JOptionPane.showMessageDialog(null, "You're a code ninja!");
}
if (hrs<=2) {
	JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead!");
	}

}
private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}}}
	


