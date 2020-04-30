package com.boo.recursion;

import java.math.BigInteger;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1914

public class _1914 {
	static int n;
	//static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		BigInteger count = new BigInteger("1");
		for(int i=0; i<n; i++) {
			count = count.multiply(new BigInteger("2"));
		}
		count = count.subtract(new BigInteger("1"));
		System.out.println(count);
		if(n<=20)
			hanoi(n, 1, 2, 3);
	}
	
	static void move(int start, int end) {
		System.out.println(start + " " + end);
		//count++;
	}
	
	static void hanoi(int n, int start, int mid, int end) {
		if(n==1) {
			move(start, end);
			return;
		}
		else {
			hanoi(n-1, start, end, mid);
			move(start, end);
			hanoi(n-1, mid, start, end);
		}
	}
}
