
package _02_loop_variables._4_99_bottles;

public class NinetyNineBottles {
	public static void main(String[] args) {
		
		int x = 99;
		for(int i = 0; i<99; i++) {
			if (x == 1) {
				System.out.println(x + " bottle of beer on the wall, " + x + " bottle of beer.");
			}
			else {
				System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer.");
			}
			x--;
			if (x == 1) {
				System.out.println("Take one down, pass it around, " + x + " bottle of beer on the wall.");
			}
			else {
				System.out.println("Take one down, pass it around, " + x + " bottles of beer on the wall.");
			}
			System.out.println( );
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store, buy some more, 99 bottles of beer on the wall.");
	}
}
