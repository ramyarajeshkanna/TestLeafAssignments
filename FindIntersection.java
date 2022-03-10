package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare An array for {3,2,11,4,6,7}
		int[] firstArray = {3,2,11,4,6,7};
		
		//Declare another array for {1,2,8,4,9,7}
		int[] secondArray = {1,2,8,4,9,7};
		
		//Initialize the Result Array
		int[] resultArray = new int[6];
		
		/*
		 * Declare for loop iterator from 0 to array length 
		 * Declare a nested for another * array from 0 to array length 
		 * Compare Both the arrays using a condition statement 
		 * Print the first array (should match item in both arrays)
		 */
		System.out.println("The Matched Elements from First Arrays are");
		
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if(firstArray[i] == secondArray[j]){
					resultArray[i] = firstArray[i];
					System.out.println(resultArray[i]);
				}
			}
		}
	}
}
