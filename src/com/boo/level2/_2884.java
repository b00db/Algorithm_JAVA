package com.boo.level2;
import java.util.*;

// https://www.acmicpc.net/problem/2884

public class _2884 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if(m >= 45) {
			System.out.println(h + " " + (m-45));
		} else {
			if(h == 0) {
				h = 24;
			}
			System.out.println((h-1) + " " + (m+60-45));
		}
		
		scanner.close();

	}

}
