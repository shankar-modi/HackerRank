package com.sk.learn.geeksforgeeks.array;

import java.util.Arrays;

/**
 * Brute force algorith.
 * 
 * @author Shankar Modi
 *
 */

public class Countsmallerelementsonright {

	public static void main(String[] args) {
		// int[] arr = {12, 1, 2, 3, 0, 11, 4};
		int[] arr = { 5, 4, 3, 2, 1 };
		int[] counterArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < counterArr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}

			counterArr[i] = count;
		}

		System.out.println(Arrays.toString(counterArr));

	}
}
