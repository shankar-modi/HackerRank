package com.sk.learn.hackerearth;

import java.util.Scanner;

/**
 * 
 * @author Shankar Modi
 * 
 *         Hackerearth practice problem
 *
 *         Print "Fizz" for number is multiple of three Print "Buzz" for number
 *         is multiple of five Print "FizzBuzz" for number is multiple of three
 *         and five
 */
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 != 0) {
					System.out.println("Fizz");
				} else if (i % 3 != 0 && i % 5 == 0) {
					System.out.println("Buzz");
				} else if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println(i);
				}
			}
			t--;
		}
		sc.close();
	}
}
