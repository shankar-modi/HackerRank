package com.sk.learn.geeksforgeeks.array;

/**
 * Brute force algorithm.
 * 
 * @author Shankar Modi
 *
 */

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int sum = 26;
		int curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (curr_sum == sum) {
					System.out.println("Sub array with index " + i + "end " + (j - 1));
					return;
				}

				if (curr_sum > sum || j == arr.length) {
					break;
				}

				curr_sum += arr[j];
			}

		}
	}
}
