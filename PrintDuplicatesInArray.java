package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		//Declare the Array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//Get the length of the array
		int arrLength = arr.length;
		
		//Declare an integer variable named count

		/*
		 * Iterate from 0 to the array length-1 (outer loop starts here) 
		 * Assign 0 to count 
		 * Iterate from i to the length of the array by adding 1 to it (inner loop starts here) 
		 * Compare both the loop variables & check they're equal 
		 * Increase the count if both the arrays are equal 
		 * Out of the inner loop, check and print the first array variable if count is more than 0
		 */
		System.out.println("Duplicate values are ");
		
		for (int i = 0; i < arrLength-1; i++) {
			int count = 0;
			for (int j = i+1; j <arrLength; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}	
			if(count>0)
				System.out.println(arr[i]);
		}
	}
}
