package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/11720

public class _11720 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(Character.toString(s.charAt(i)));
		}
		
		System.out.println(sum);
		
	}

}
