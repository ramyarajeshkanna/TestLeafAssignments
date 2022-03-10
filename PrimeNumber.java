package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// Declare an integer Input and assign a value 13
		int input = 293;
		int remainder = 0;

		// Declare a boolean variable flag as false
		boolean flag = false;

		/*
		 * Iterate from 2 to half of the input Divide the input with each for loop
		 * variable and check the remainder Set the flag as true when there is no
		 * remainder Break the iterator
		 */
		for (int i = 2; i <= input / 2; i++) {
			remainder = input % i;
			if (remainder == 0) {
				flag = true;
				break;
			}
		}

		/*
		 * Check the flag (Provide a condition) Print 'Prime' when the condition matches
		 * Print 'Not a Prime' when the condition doesn't match
		 */
		if (flag)
			System.out.println(input + " is Not a Prime Number");
		else if(input<2) 
			  System.out.println(input+ " is a Prime Number");
		else
			System.out.println(input + " is a Prime Number");
	}
}
