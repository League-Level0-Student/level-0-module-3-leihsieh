
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 3rd";
		String dadsBirthday = "January 21st";
		String myBirthday = "March 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		String input = JOptionPane.showInputDialog("Which birthday would you like?");
		
		// 3. Print out what the user typed
		
		JOptionPane.showMessageDialog(null, input);
		
		// 4. if user asked for "mom"
		
		if(input.equals("mom")) {
		
			//print mom's birthday
			
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		
		// 5. if user asked for "dad"
		
		else if(input.equals("dad")) {
		
			// print dad's birthday
			
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			
		// 6. if user asked for your name
		
		else if(input.equals("yours")) {
		
			// print myBirthday
			
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	} 
}
