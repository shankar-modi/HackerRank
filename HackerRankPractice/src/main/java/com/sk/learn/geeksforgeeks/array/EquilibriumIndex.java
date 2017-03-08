package com.sk.learn.geeksforgeeks.array;

/**
 * Equilibrium index of an array is an index such that the sum of elements at
 * lower indexes is equal to the sum of elements at higher indexes.
 * 
 * @author Shankar Modi
 *
 */

public class EquilibriumIndex {

	public static void main(String[] args) {
		// int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		int arr[] = { -7, 0, 0, 0, 4, 3, 0 };

		int sum = 0;
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			sum -= arr[i];
			if (leftSum == sum) {
				System.out.println("EquilibriumIndex : " + i);
				break;
			}

			leftSum += arr[i];
		}

		findEquilibriumIndex(arr);

	}

	/**
	 * Alternative for first solution. not covering some corner cases.
	 * 
	 * @param arr
	 */
	private static void findEquilibriumIndex(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int leftSum = 0;
		int rightsum = 0;

		while (i < j) {
			leftSum += arr[i++];
			rightsum += arr[j--];
			if (leftSum == rightsum) {
				System.out.println("Idx " + i);
				break;
			}

		}
	}
}
