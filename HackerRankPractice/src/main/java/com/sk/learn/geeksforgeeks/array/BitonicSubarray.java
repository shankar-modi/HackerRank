package com.sk.learn.geeksforgeeks.array;

import java.util.Arrays;

/**
 * 
 * @author Shankar Modi
 *
 */

public class BitonicSubarray {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 78, 90, 45, 23 };

		int length = bitonic(arr, arr.length);

		System.out.println("Bitonic array length is : " + length);
	}

	private static int bitonic(int[] arr, int length) {
		int[] inc = new int[length];
		int[] dec = new int[length];

		int max;

		inc[0] = 1;
		dec[length - 1] = 1;

		for (int i = 1; i < length; i++) {
			inc[i] = (arr[i] > arr[i - 1]) ? inc[i - 1] + 1 : 1;
		}

		for (int i = length - 2; i >= 0; i--) {
			dec[i] = (arr[i] > arr[i + 1]) ? dec[i + 1] + 1 : 1;
		}

		System.out.println(Arrays.toString(inc));
		System.out.println(Arrays.toString(dec));
		max = inc[0] + dec[0] - 1;
		System.out.println(max);
		for (int i = 1; i < length; i++) {
			if ((inc[i] + dec[i] - 1) > max) {
				max = inc[i] + dec[i] - 1;
			}

			System.out.println("new max " + max);
		}

		return max;
	}
}
