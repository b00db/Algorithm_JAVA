package com.boo.level7;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1065

// 1~99�� ��� �Ѽ� -> �� �ڸ� �������� �Ǻ�
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
		
		if (num2 * 2 == num1 + num3) { // �� �ڸ� �� �������� �Ǻ�
			return 1;
		}
		return 0;
	}
	
}
