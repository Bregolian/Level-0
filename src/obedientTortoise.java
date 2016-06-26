import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class obedientTortoise {
	static String color;
	public static void main(String[] args) {
		String Shape = JOptionPane.showInputDialog("What shape would you like the tortoise to draw?");
		color = JOptionPane.showInputDialog("What color would you like the tortoise to draw in?");
		Tortoise.show();
getColor();
		if (Shape.equalsIgnoreCase("triangle")) {

			Tortoise.penUp();
			Tortoise.turn(270);
			Tortoise.move(50);
			Tortoise.penDown();
			drawTriangle();
		} else if (Shape.equalsIgnoreCase("square")) {
			Tortoise.penUp();
			Tortoise.turn(270);
			Tortoise.move(50);
			Tortoise.penDown();
			drawSquare();
		} else if (Shape.equalsIgnoreCase("circle")) {
			Tortoise.setSpeed(10);
			Tortoise.penUp();
			Tortoise.turn(270);
			Tortoise.move(50);
			Tortoise.penDown();

			drawCircle();
		}
	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(50);
			Tortoise.turn(120);
		}
	}

	public static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(3);
			Tortoise.turn(1);
		}
	}
public static void getColor(){
	if (color.equalsIgnoreCase("red")) {
		Tortoise.setPenColor(Color.RED);
	}

	else if (color.equalsIgnoreCase("blue")){
	Tortoise.setPenColor(Color.BLUE);
	}
	else if (color.equalsIgnoreCase("Green")){
	Tortoise.setPenColor(Color.GREEN);
	}
	else if (color.equalsIgnoreCase("Yellow")){
	Tortoise.setPenColor(Color.YELLOW);
	}
	else if (color.equalsIgnoreCase("orange")){
	Tortoise.setPenColor(Color.ORANGE);
	}
	else if (color.equalsIgnoreCase("white")){
	Tortoise.setPenColor(Color.WHITE);
	}
	else if (color.equalsIgnoreCase("pink")){
	Tortoise.setPenColor(Color.PINK);
	}
	else {
	Tortoise.setPenColor(Color.BLACK);
	}
}
}
