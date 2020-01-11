package com.boo.level7;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1065

// 1~99는 모두 한수 -> 세 자리 수에서만 판별
public class _1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		if (n < 100) {
			System.out.println(n);
		} else {
			int result = 99;
			
			for (int i = 100; i <= n; ++i) {
				result += isHanNumber(i);
			}
			
			if (n == 1000) result--;
			
			System.out.println(result);
		}
	}
	
	private static int isHanNumber(int number) {
		int num1 = number / 100 % 10;
		int num2 = number / 10 % 10;
		int num3 = number % 10;
		
		if (num2 * 2 == num1 + num3) { // 세 자리 수 등차수열 판별
			return 1;
		}
		return 0;
	}
	
}
