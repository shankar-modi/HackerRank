package com.sk.learn.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkandWelcomeProblem {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] a = new int[N];
		String s1 = br.readLine();
		String s2 = br.readLine();
		String[] s1arr = s1.split(" ");
		String[] s2arr = s2.split(" ");
		
		for (int i = 0; i <N; i++) {
			a[i] = (Integer.parseInt(s1arr[i]) + Integer.parseInt(s2arr[i]));
			System.out.print(a[i] + " ");
		}
		
		
	}
}
