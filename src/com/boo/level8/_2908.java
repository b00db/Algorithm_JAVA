package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/2908

public class _2908 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = reverse(scanner.nextInt());
		int b = reverse(scanner.nextInt());
		scanner.close();
		
		int result = (a > b) ? a : b;
		System.out.println(result);
	}
	
	public static int reverse(int i) {
		String temp = new String();
		String s = Integer.toString(i);
		
		for(int j = 2; j >= 0; j--) {
			temp = temp.concat(Character.toString(s.charAt(j)));
		}
		
		return Integer.parseInt(temp);
	}

}
