package com.boo.level3;
import java.util.*;

// https://www.acmicpc.net/problem/8393

public class _8393 {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		scanner.close();

	}

}
