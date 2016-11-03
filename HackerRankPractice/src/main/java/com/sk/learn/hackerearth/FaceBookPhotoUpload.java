package com.sk.learn.hackerearth;

import java.util.Scanner;

/**
 * 
 * @author Shankar Modi
 *
 *         HackerEarth Problem Checking photo size to upload.
 */
public class FaceBookPhotoUpload {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] dimension = str.split(" ");
			int w = Integer.valueOf(dimension[0]);
			int h = Integer.valueOf(dimension[1]);
			if ((w == l && h == l) || w == h) {
				System.out.println("ACCEPTED");
			} else if (w < l || h < l) {
				System.out.println("UPLOAD ANOTHER");
			} else {
				System.out.println("CROP IT");
			}
		}
		sc.close();
	}
}
