package com.sk.learn.geeksforgeeks.array;

/**
 * WAP that, given an array A[] of n numbers and another number x, determines
 * whether or not there exist two elements in S whose sum is exactly x.
 * 
 * A [] = {1, 4, 45, 6, 10, -8} and x= 16
 * 
 * ans = 6 and 10
 * 
 * @author Shankar Modi
 *
 */

public class CheckPairWithMaxSum {

	public static final int N = 10000;
	static boolean[] tempArr = new boolean[N];

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, -8 };
		int sum = 16;

		FindPairWithMaxSum(arr, sum);

	}

	public static void FindPairWithMaxSum(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++) {
			int t = sum - arr[i];

			if (t >= 0 && tempArr[t]) {
				System.out.println("Pair for " + sum + " (" + t +", "+ arr[i] + ")");
				break;
			}

			tempArr[arr[i]] = true;
		}
	}

}
