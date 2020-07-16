
package _02_loop_variables._3_robot_walk_of_fame;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left.
		rob.setX(200);
		// You also need to show the robot to see the result of this line.
		rob.penDown();
		rob.setPenColor(Color.black);
		rob.setSpeed(15);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		for(int i = 0; i<10; i++) {
		for(int x = 0; x<5; x++) {
			rob.move(30);
			rob.turn(144);
		}
			rob.penUp();
			rob.turn(90);
			rob.move(50);
			rob.turn(-90);
			rob.penDown();
		}
		rob.penUp();
		rob.turn(90);
		rob.move(100);
		rob.turn(-90);
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
