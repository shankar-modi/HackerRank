package com.sk.learn.hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Shankar Modi 
 * HackerEath Problem Multiplication of Big numbers.
 */
public class BigIntegerProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger ans = new BigInteger("1");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			BigInteger data = new BigInteger(sc.next());
			ans = ans.multiply(data);
		}
		System.out.println(ans);
		sc.close();
	}

}
