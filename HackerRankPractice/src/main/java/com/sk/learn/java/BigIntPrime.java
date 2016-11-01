package com.sk.learn.java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Shankar Modi
 *
 *Using BigInteger's  isProbablePrime() method
 */
public class BigIntPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		System.out.println(a.isProbablePrime(1));
		sc.close();
	}

}
