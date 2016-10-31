package com.sk.learn.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Shankar Modi
 *
 *User name validation using regex.
 */
public class UserNameValidator {

	public static void main(String[] args) {
		String pattern = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name);
		String result = m.find() ? "Valid" : "Invalid";
		System.out.println(result);
		
	}
}
