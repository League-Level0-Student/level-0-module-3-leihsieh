package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		else if(happy.equalsIgnoreCase("no")) {
			String happy2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(happy2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else if(happy.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		}
	}
}
