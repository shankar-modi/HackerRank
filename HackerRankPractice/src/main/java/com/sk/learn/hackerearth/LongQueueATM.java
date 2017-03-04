package com.sk.learn.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongQueueATM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s1 = br.readLine();
		String[] a = s1.split(" ");
		int count = 1;
		
		for (int i = 0; i < a.length-1; i++) {
			if(Integer.parseInt(a[i]) > Integer.parseInt(a[i+1])){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
