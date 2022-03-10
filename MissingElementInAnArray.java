package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array
		Arrays.sort(arr);
		
		/*
		 * Loop through the array (start i from arr[0] till the length of the array)
		 * Check if the iterator variable is not equal to the array values respectively
		 * Print the number 
		 * Once printed break the iteration
		 */
		for (int i = 1; i <= arr.length; i++) {
			if(i != arr[i-1]) {
				System.out.println("The Missing Element in the Array is "+i);
			     break;
			}
		}
	}
}
