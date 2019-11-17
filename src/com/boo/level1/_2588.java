package com.boo.level1;
import java.util.*;

// https://www.acmicpc.net/problem/2588

public class _2588 {

	public static void main(String[] args) {
		
		int x, y, result1, result2, result3, result;
		int b[] = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		b[0] = y / 100;
		b[1] = (y % 100) / 10;
		b[2] = y % 10;
		
		result1 = x * b[2];
		result2 = x * b[1];
		result3 = x * b[0];
		result = result1 + result2 * 10 + result3 * 100; // result = x * y;
		
		System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result);
        
		scanner.close();
		
	}

}
