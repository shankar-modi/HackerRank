package com.sk.learn.geeksforgeeks.array;

/**
 * Given an array of positive integers. All numbers occur even number of times
 * except one number which occurs odd number of times.
 * 
 * @author Shankar Modi
 *
 */
public class OddNumberOfTime {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 3, 1, 3};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum ^ arr[i];
		}
		
		
		System.out.println(sum +" Occuring odd numer of time.");

	}

}
