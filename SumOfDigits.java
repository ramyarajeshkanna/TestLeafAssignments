package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// Declare your input number (integer)
		int input =123;
		
		// Initialize an integer variable by name: sum
		int sum = 0;
		int remainder = 0;
		
		/*
		 * Use loop to calculate the sum: use while loop to set condition until the
		 * number goes greater than 0 
		 * Within loop: get the remainder when done by 10 -> Tip: use mod % 
		 * Print the remainder to confirm 
		 * Within loop: add that remainder to the sum 
		 * Print the sum to confirm 
		 * Within loop: get quotient of that number  (tip: quotient should be same variable of loop condition) 
		 * Print the quotient to confirm
		 */
		while(input>0){
			remainder = input%10;
			System.out.println("Remainder="+remainder);
			sum+= remainder;
			System.out.println("sum="+sum);
			input = input/10;
			System.out.println("Quotient="+input);
		}
		
		// Outside the loop: print the final sum
		System.out.println("Sum of the Digits is "+sum);

	}

}
