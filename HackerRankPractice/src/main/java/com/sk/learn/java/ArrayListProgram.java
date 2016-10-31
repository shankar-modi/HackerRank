package com.sk.learn.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Shankar Modi
 *Find the position of given number.
 */
public class ArrayListProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 1; i <= n; i++) {
			int d = sc.nextInt();
			List<Integer> subList = new ArrayList<Integer>();
			for(int j=0;j<d;j++){
				subList.add(sc.nextInt());
			}
			list.add(subList);
		}
		int d = sc.nextInt();
		for (int i = 0; i < d; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			List<Integer> subList = list.get(x-1);
			
			try {
				System.out.println(subList.get(y-1));
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("ERROR!");
			}
			
		}
		sc.close();
	}
}
