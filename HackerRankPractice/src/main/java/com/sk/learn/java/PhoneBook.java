package com.sk.learn.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author Shankar Modi
 *HackerRank Problem : PhoneBook using Map.
 */
public class PhoneBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String, Integer> phoneBook = new HashMap<String, Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         phoneBook.put(name, phone);
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if(phoneBook.containsKey(s)){
	        	 System.out.println(s+"="+phoneBook.get(s));
	         }else{
	        	 System.out.println("Not found");
	         }
	      }
	      in.close();
	}
}
