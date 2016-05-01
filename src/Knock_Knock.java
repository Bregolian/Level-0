import javax.swing.JOptionPane;

public class Knock_Knock {
public static void main(String[] args) {
	JOptionPane.showInputDialog("Knock Knock");
String Answer=	JOptionPane.showInputDialog("A broken pencil");
if (Answer.equalsIgnoreCase("A broken pencil who")) {
	JOptionPane.showMessageDialog(null,"Oh never mind it's pointless");
} else {JOptionPane.showMessageDialog(null,"You weren't supposed to say that");

}	
	
}
}
