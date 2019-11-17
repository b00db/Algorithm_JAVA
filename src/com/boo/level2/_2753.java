package com.boo.level2;
import java.util.*;

// https://www.acmicpc.net/problem/2753

public class _2753 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println(0);
		}
		
		scanner.close();

	}

}
