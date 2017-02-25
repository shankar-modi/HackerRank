package com.sk.learn.hackerearth;

import java.util.Scanner;

/**
 * 
 * @author Shankar Modi
 *
 */

public class BestInternateBrowser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCaces = sc.nextInt();
		String website = "";
		while(testCaces > 0){
			
			website = sc.next();
			String[] str = website.split("\\.");
			String webName = str[1];
			char[] arr = webName.toCharArray();
			int normalBrowser = 0;
			int bestBrowser = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
					normalBrowser++;
				}else{
					normalBrowser++;
					bestBrowser++;
				}
			}
			
			normalBrowser = normalBrowser + str[2].length() + 1 + str[0].length() + 1;
			bestBrowser = bestBrowser + str[2].length() + 1;
			
			System.out.println(bestBrowser +"/" +normalBrowser);
			testCaces--;
		}
		sc.close();
	}
}
