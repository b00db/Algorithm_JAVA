package com.boo.level1;
import java.util.*;

// https://www.acmicpc.net/problem/10430

public class _10430 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c * b%c)%c);
		
		scanner.close();

	}

}
