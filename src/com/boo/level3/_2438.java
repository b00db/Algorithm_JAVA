package com.boo.level3;
import java.util.*;

// https://www.acmicpc.net/problem/2438

public class _2438 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
