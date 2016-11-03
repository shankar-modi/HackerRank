package com.sk.learn.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Shankar Modi 
 *      HackerRank Problem.
 */
public class JavaList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while(size > 0){
			int number = sc.nextInt();
			list.add(number);
			size--;
		}
		int q = sc.nextInt();
		while (q > 0) {
			String query = sc.next();
			if("Insert".equalsIgnoreCase(query)){
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x, y);
			}
			if("Delete".equalsIgnoreCase(query)){
				int x = sc.nextInt();
				list.remove(x);
			}
			q--;
		}
		
		for (Integer element : list) {
			System.out.print(element + " ");
		}
	}
}
