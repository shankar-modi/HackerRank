package com.sk.learn.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SolitaryString {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<Character> set = new HashSet<Character>();
		int max = 0;
		while (N > 0) {
			String line = br.readLine();
			boolean isSamechar = false; 
			char[] arr = line.toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if(!set.add(arr[i])){
					isSamechar = true;
					break;
				}
				
			}
			
			if(isSamechar){
				int diff = 0;
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] == arr[j]) {
							diff = (j - (i + 1));
							//break;
						}
					}
					max = Math.max(max, diff);
				}
				N--;
				System.out.println(max);
			}else{
				System.out.println(-1);
			}
			
		}
		
	}
}
