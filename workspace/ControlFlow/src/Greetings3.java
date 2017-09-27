/**
 * 
 *  Class to implement the following solution using IF ELSE IF ELSE statements only
 * 
 * 	Write a program to implement following logic.
 * 		1. if hour is less than 12 noon, greet with Good Morning
 * 		2. if hour is greater than or equal to 12 noon but less than 15 (3pm) greet with Good Afternoon
 * 		3. if hour is greater than or equal to 15 (3pm) greet with Good Evening
 * 
 * 
 * 
 * @author G74S
 *
 */
public class Greetings3 {
	public static void main(String [] args) {
		byte hour = 17;
		
		// 1. if hour is less than 12 noon, greet with Good Morning
		if (hour < 12) {
			System.out.println("Good Morning!");
		}
		// 2. if hour is greater than or equal to 12 noon but less than 15 (3pm) greet with Good Afternoon
		else if (hour < 15) {
			System.out.println("Good Afternoon");
		}
		// 3. if hour is greater than or equal to 15 (3pm) greet with Good Evening
		else { // hour >= 15
			System.out.println("Good Evening!");
		}
	}

}
