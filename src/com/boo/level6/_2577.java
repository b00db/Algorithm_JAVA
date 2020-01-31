package com.boo.level6;
import java.util.Scanner;
// https://www.acmicpc.net/problem/2577

public class _2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		scanner.close();

		int[] counts = new int[10];
		int number = A * B * C;
		while (number > 0) {
			counts[number % 10]++;
			number /= 10;
		}

		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}
	}


}
