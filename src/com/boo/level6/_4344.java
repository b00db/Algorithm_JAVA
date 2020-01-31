package com.boo.level6;
import java.util.*;

// https://www.acmicpc.net/problem/4344

public class _4344 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		int n, total, count;
		double average;
		int scores[] = new int[1000];
		
		for(int i=0; i<c; i++) {
			n = scanner.nextInt();
			total = 0;
			count = 0;
			
			for(int j=0; j<n; j++) {
				scores[j] = scanner.nextInt();
				total += scores[j];
			}
			average = (double)total/n;
			
			for(int j=0; j<n; j++) {
				if(scores[j] > average) {
					count++;
				}
			}
			
			System.out.printf("%.3f", 100.0 * count / n);
			System.out.println("%");
		}
		
		scanner.close();
		
	}

}
