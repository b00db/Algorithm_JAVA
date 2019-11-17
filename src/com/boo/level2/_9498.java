package com.boo.level2;
import java.util.*;

// https://www.acmicpc.net/problem/9498

public class _9498 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		char grade;
		
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		
		System.out.println(grade);
		
		scanner.close();

	}

}
