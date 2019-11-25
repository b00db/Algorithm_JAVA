package com.boo.level3;
import java.util.*;

// https://www.acmicpc.net/problem/2439

public class _2439 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();

	    for(int i = 1; i <= n; i++) {
	        for(int j = 1; j <= n - i ; j++) {
	            System.out.print(" ");
	        }
	        for(int k = 1; k <= i; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	    scanner.close();

	}

}
