import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String Input=JOptionPane.showInputDialog("What's your zodiac sign?");
//Leo, Sagittarius. Earth: Taurus, Virgo, Capricorn. Air: Gemini, Libra, Aquarius. Water: Cancer, Scorpio, Pisces.
if (Input.equalsIgnoreCase("Aquarius")) {
	String Aquarius="Aquarius-born are shy and quiet , but on the other hand they can be eccentric and energetic. However, in both cases, they are deep thinkers and highly intellectual people who love helping others. They are able to see without prejudice, on both sides, which makes them people who can easily solve problems.+ \n +Although they can easily adapt to the energy that surrounds them, Aquarius-born have a deep need to be some time alone and away from everything, in order to restore power. People born under the Aquarius sign, look at the world as a place full of possibilities."
			+"Aquarius is an air sign, and as such, uses his mind at every opportunity. If there is no mental stimulation, they are bored and lack a motivation to achieve the best result."+
			"The ruling planet of Aquarius, Uranus has a timid, abrupt and sometimes aggressive nature, but it also gives Aquarius visionary quality. They are capable of perceiving the future and they know exactly what they want to be doing five or ten years from now."
			+"Uranus also gave them the power of quick and easy transformation, so they are known as thinkers, progressives and humanists. They feel good in a group or a community, so they constantly strive to be surrounded by other people."
			+"The biggest problem for Aquarius-born is the feeling that they are limited or constrained. Because of the desire for freedom and equality for all, they will always strive to ensure freedom of speech and movement. Aquarius-born have a reputation for being cold and insensitive persons, but this is just their defence mechanism against premature intimacy. They need to learn to trust others and express their emotions in a healthy way."
			;
JOptionPane.showMessageDialog(null,Aquarius );
}
else if (Input.equalsIgnoreCase("Aries")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Leo")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Sagittarius")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Taurus")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Virgo")) {
	JOptionPane.showMessageDialog(null, "Have fun.");
}
else if (Input.equalsIgnoreCase("Capricorn")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Gemini")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Libra")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}

else if (Input.equalsIgnoreCase("Cancer")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Scorpio")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else if (Input.equalsIgnoreCase("Pisces")) {
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
else{
	JOptionPane.showMessageDialog(null, "You are gonna die.");
}
}
}
