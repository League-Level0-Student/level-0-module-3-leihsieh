package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {
		
		String year = JOptionPane.showInputDialog("What year were you born?");
		int yearInt = Integer.parseInt(year);
		for(int i = yearInt; i<=2020; i++) {
		JOptionPane.showMessageDialog(null, yearInt++);
		}
	}
	
}
