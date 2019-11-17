package com.boo.level2;
import java.util.*;

// https://www.acmicpc.net/problem/1330

public class _1330 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a > b) System.out.println(">");
		if(a < b) System.out.println("<");
		if(a == b) System.out.println("==");
		
		scanner.close();

	}

}
