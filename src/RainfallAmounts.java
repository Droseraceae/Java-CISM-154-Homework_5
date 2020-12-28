import java.util.Scanner;
/**
 * Create a program that asks the user to enter
 * rainfall amount data over a period of years and calculate
 * the total and average rainfall.
 * 
 * Your program will first prompt the user to enter the number
 * of years.
 * 
 * For each year, the program will prompt the user to enter the
 * rainfall amount (in inches) for each of the 12 months.
 * 
 * Your program will then print the total rainfall and the
 * average rainfall per month.
 * 
 * HINTS:
 * You will need to use nested loops (a loop within a loop)
 * You will need to keep a running total of rainfall amounts (to get the total rainfall)
 * The average monthly rainfall is the total rainfall amount divided by (12 * Number Of Years)
 * 
 * @author Josh Alcoba
 */
public class RainfallAmounts {

	public static void main(String[] args) {
		
		// See instructions above.
		// Your program should reject a number less than 1 for number of years.
		// Your program should reject negative numbers for monthly rainfall amounts.
		
		double totalRain = 0;
		double averageRain = 0;
		int years = 0;

		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.print("Please enter the number of years: ");
			years = Integer.parseInt(keyboard.nextLine());
		} while (years < 1);

		for (int i = 1; i <= years; i++) {

			for (int j = 1; j <= 12; j++) {
				System.out.print("Please enter the rainfall amount for month " + j + " of year " + i + ": ");
				int rainFall = Integer.parseInt(keyboard.nextLine());
				while (rainFall < 0) {
					System.out.println("Rain must be 0 or greater");
					rainFall = Integer.parseInt(keyboard.nextLine());
				}
				totalRain += rainFall;
				averageRain = totalRain / (years * j);
			}

		}

		System.out.println("Total Rainfall: " + (int)totalRain + " inches");
		System.out.printf("Average Rainfall: %.2f", averageRain);
		keyboard.close();
		
		/*** SAMPLE INPUT/OUTPUT ***
		 * 
		 * 
		 * Please enter the number of years: 2
		 * Please enter the rainfall amount for month 1 of year 1: 5
		 * Please enter the rainfall amount for month 2 of year 1: 4
		 * Please enter the rainfall amount for month 3 of year 1: 3
		 * Please enter the rainfall amount for month 4 of year 1: 2
		 * Please enter the rainfall amount for month 5 of year 1: 1
		 * Please enter the rainfall amount for month 6 of year 1: 1
		 * Please enter the rainfall amount for month 7 of year 1: 2
		 * Please enter the rainfall amount for month 8 of year 1: 3
		 * Please enter the rainfall amount for month 9 of year 1: 4
		 * Please enter the rainfall amount for month 10 of year 1: 5
		 * Please enter the rainfall amount for month 11 of year 1: 6
		 * Please enter the rainfall amount for month 12 of year 1: 7
		 * Please enter the rainfall amount for month 1 of year 2: 1
		 * Please enter the rainfall amount for month 2 of year 2: 2
		 * Please enter the rainfall amount for month 3 of year 2: 3
		 * Please enter the rainfall amount for month 4 of year 2: 4
		 * Please enter the rainfall amount for month 5 of year 2: 5
		 * Please enter the rainfall amount for month 6 of year 2: 5
		 * Please enter the rainfall amount for month 7 of year 2: 4
		 * Please enter the rainfall amount for month 8 of year 2: 3
		 * Please enter the rainfall amount for month 9 of year 2: 2
		 * Please enter the rainfall amount for month 10 of year 2: 1
		 * Please enter the rainfall amount for month 11 of year 2: 2
		 * Please enter the rainfall amount for month 12 of year 2: 3
		 * Total Rainfall: 78 inches
		 * Average Monthly Rainfall: 3.25 inches
		 * 
		 */

	}

}
