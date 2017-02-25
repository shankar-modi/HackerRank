package com.sk.learn.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Shankar Modi
 *
 */
public class StringValidation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	         int length = input.length();
	         if(!(length % 2 == 0)){
	        	 System.out.println(false);
	         }else if(length == 0){
	        	 System.out.println(true);
	         }else{
	        	 char [] arr = input.toCharArray();
	        	 Stack<Character> s = new Stack<Character>();
	        	 for (char c : arr) {
					switch (c) {
					case '[':
					case '{':
					case '(': s.push(c);
						break;
					case ']':
						if(!s.isEmpty() && s.peek() == '['){
							s.pop();
						}
						break;
					case '}':
						if(!s.isEmpty() && s.peek() == '{'){
							s.pop();
						}
						break;
					case ')':
						if(!s.isEmpty() && s.peek() == '('){
							s.pop();
						}
						break;
					

					default:
						break;
					}
				}
	        	 
	        	 System.out.println(s.isEmpty());
	         }
	         

	      }
	}
}
