package com.sk.learn.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMatch {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		String a = br.readLine();
		String b = br.readLine();
		int aHash = 0;
		int bHash = 0;
		
		if(a == null || b == null || (a.length() != b.length())){
			System.out.println("NO");
			return;
		}
		
		for (int i = 0; i < a.length(); i++) {
			Character c = a.charAt(i);
			Character d = b.charAt(i);
			
			aHash+=c.hashCode();
			bHash+=d.hashCode();
		}
		
		if(aHash == bHash){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
