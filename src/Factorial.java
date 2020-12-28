import java.util.Scanner;
/**
 * Create a program that asks the user to enter a
 * number larger than zero and prints out the product
 * of all integers from 1 up to the number entered.
 * 
 * For example:
 * 3! = 6 (because 1*2*3 = 6)
 * 5! = 120 (because 1*2*3*4*5 = 120)
 * 
 * 
 * Implement any type of loop you want to accomplish this.
 * 
 * @author Josh Alcoba
 */
public class Factorial {

	public static void main(String[] args) {
	
		//Your program should reject any number
		//entered that is zero or less.
		
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		int factorial = 1;

		do {
			System.out.println("Please enter a number larger than 0");
			number = keyboard.nextInt();
			for (int i = number; i >= 2; i--)
				factorial *= i;
		} while (number <= 0);
		keyboard.close();
		System.out.println(number + "! = " + factorial);
		
		/*** SAMPLE INPUT/OUTPUT ***
		 * 
		 * Please enter a number larger than zero: 9
		 * 9! = 362880
		 */
	}

}
