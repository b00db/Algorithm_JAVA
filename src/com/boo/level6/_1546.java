package com.boo.level6;
import java.util.*;

// https://www.acmicpc.net/problem/1546

public class _1546 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 
		 int n = scanner.nextInt(); // 시험 본 과목의 개수
		 int[] scores = new int[n];
			 
		int max = 0;
		int total = 0;
		for(int i=0; i<n; i++) {
			scores[i] = scanner.nextInt();
			total += scores[i];
			if(scores[i] > max)
				max= scores[i];
		}
		
		double average = 100.0 * total / max / n;
		
		System.out.printf("%.2f", average);
	
	}

}

