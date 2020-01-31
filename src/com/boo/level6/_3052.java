package com.boo.level6;
import java.util.Scanner;

// https://www.acmicpc.net/problem/3052

public class _3052 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	    int[] number = new int[10];
	    int[] counts = new int[42];

	    for(int i=0; i<10; i++)
	        number[i] = scanner.nextInt();
	    scanner.close();

	    for(int i=0; i<10; i++)
	        counts[(number[i]%42)]++;

	    int total = 0; // 서로 다른 나머지

	    for(int i=0; i<counts.length; i++) {
	        if(counts[i] != 0)
	            total++;
	    }

	    System.out.println(total);

	}

}
