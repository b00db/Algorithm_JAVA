package com.boo.level3;
import java.util.*;

// https://www.acmicpc.net/problem/2739

public class _2739 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
		scanner.close();
		
	}

}
