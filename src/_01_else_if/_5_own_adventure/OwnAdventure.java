package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("You are backpacking up a mountain when you suddenly encounter a \nmountain lion. What do you do?");
		JOptionPane.showMessageDialog(null,"You " + input);
		JOptionPane.showMessageDialog(null, "You die.");
		JOptionPane.showMessageDialog(null, "What did you expect? It's a mountain lion. Have you seen one of those things?");
	}
}
