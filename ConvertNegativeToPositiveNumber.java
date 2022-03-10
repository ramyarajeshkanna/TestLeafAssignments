package week1.day2;

public class ConvertNegativeToPositiveNumber {

	public static void main(String[] args) {
		//Initialize an integer with a negative number like, number = -40;
		int number = -98;
		int positiveNumber = 0;
		
		/*
		 * Check if the number is a negative number Hint : any number that is lesser
		 * than zero is a negative number If so, convert the number to a positive number
		 * Print as "The number -40 is converted to 40"
		 */
		if(number<0) {
			System.out.println(number+" is a Negative Number");
	        positiveNumber = number *(-1);
	        System.out.println("The Negative number "+number+" is converted to Postive Number "+positiveNumber);
		}
		else if(number>0)
			System.out.println("The Number "+number+" is a Positive Number");
		else
			System.out.println("The Number is Zero");

	}

}
