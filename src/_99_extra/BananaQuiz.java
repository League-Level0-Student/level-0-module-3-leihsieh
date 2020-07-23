
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		
		String input = JOptionPane.showInputDialog("Do you like bananas?");
		
		//2. if they say no, 
		
		if(input.equals("no")) {
		
			//tell them they are crazy 
			
			JOptionPane.showMessageDialog(null, "You're crazy!");
			
			//and end quiz
			
			System.exit(0);
		}

		//3. if they say yes
		
		else if(input.equals("yes")) {
		
		//	ask them what is their favorite hobby
			
			String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
			
		//	show a pop up that says "<your hobby> is much better with bananas!"
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		}
		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		
		else {
		
		//	show a pop up that says "You are bananas!?"
		
			JOptionPane.showMessageDialog(null, "You're bananas!");
		}
	}

}
