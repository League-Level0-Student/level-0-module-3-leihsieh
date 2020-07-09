
package _01_else_if._1_robot_color_chooser;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.*;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
		Random rand = new Random();
	    //2. Make the robot draw a shape (this will take more than one line of code)

		//3. Set the pen width to 10
			robot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
			for(int i = 0; i < 100; i++) {
			String input = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(input.equalsIgnoreCase("blue")) {
			robot.setPenColor(Color.BLUE);
		}
		else if(input.equalsIgnoreCase("red")) {
			robot.setPenColor(Color.red);
		}
		else if (input.equalsIgnoreCase("green")) {
			robot.setPenColor(Color.green);
		}
		else if (input.equalsIgnoreCase("yellow")) {
			robot.setPenColor(Color.yellow);
		}
		else {
			robot.setPenColor(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		}
			robot.penDown();
			robot.setSpeed(10);
		for(int z = 0; z <= 3; z++) {
			robot.move(100);
			robot.turn(90);
		}
	}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
