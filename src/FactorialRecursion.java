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

public class FactorialRecursion {
	public static void main(String[] args) {

		int number = 0;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Please enter a number larger than 0");
			number = keyboard.nextInt();
		} while (number <= 0);

		keyboard.close();
		System.out.println(number + "! = " + factorialRecur(number));

		/***
		 * SAMPLE INPUT/OUTPUT ***
		 * 
		 * Please enter a number larger than zero: 9 
		 * 
		 * 9! = 362880
		 */
	}

	public static int factorialRecur(int num) {
		if (num >= 1)
			return num * factorialRecur(num - 1);
		else
			return 1;
	}

}
