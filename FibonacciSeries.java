package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// initialize 3 variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		
		// Print first number and Second Number
		System.out.println(firstNum);
		System.out.println(secNum);
		
		/*
		 * Iterate from 1 to the range 
		 * Add first and second number assign to sum 
		 * Assign second number to the first number 
		 * Assign sum to the second number Print sum
		 */ 
		for(int i=1; i<range-1; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}
}
