
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		
		String cats = JOptionPane.showInputDialog("How many cats do you have?");
		
		// 2. Convert their answer into an int
		
		int catsInt = Integer.parseInt(cats);
		
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		
		if(catsInt >= 3) {
			JOptionPane.showMessageDialog(null, "You're a crazy cat lady!");
		}
		
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		
		if(catsInt<3 && catsInt>0) {
			JOptionPane.showMessageDialog(null, "Wow what a great method this is that i totally just called");
		}
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

