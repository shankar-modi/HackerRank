package com.sk.learn.geeksforgeeks.array;

/**
 * Majority Element: A majority element in an array A[] of size n is an element
 * that appears more than n/2 times.
 * 
 * @author Shankar Modi
 *
 */

public class MajorityElement {

	public static void main(String[] args) {
//		int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4,};
		int[] arr = {1, 1, 1, 1, 1, 2, 3, 4};
				
		int majorityElement = MooresAlgo(arr);
		
		System.out.println("Majority Element : "  + majorityElement);
	}

	private static int MooresAlgo(int[] arr) {
		int max_index = 0;
		int count = 1;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] == arr[max_index]){
				count++;
			}else{
				count--;
			}
			
			if(count == 0){
				max_index = i;
				count= 1;
			}
		}
		
		return arr[max_index];
		
	}
	
	
}

