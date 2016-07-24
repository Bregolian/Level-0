import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
for (int i = 0; i < 8; i++) {
	
	int One=new Random().nextInt(69)+1;
	int Two=new Random().nextInt(69)+1;
	int Three=new Random().nextInt(69)+1;
	int Four=new Random().nextInt(69)+1;
	int Five=new Random().nextInt(69)+1;
	int Power=new Random().nextInt(26)+1;
System.out.println(One+","+Two+","+Three+","+Four+","+Five+",  "+Power);
}}
}
