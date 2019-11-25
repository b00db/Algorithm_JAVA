package com.boo.level4;
import java.util.*;

// https://www.acmicpc.net/problem/1110

public class _1110 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = n / 10; // �� �ڸ� �� �� ������ �ڸ� ��
		int y = n % 10; // �� �ڸ� �� �� ���� �ڸ� ��
		int xTemp = 0;
		int count = 0;
		
		while(true) {
			xTemp = x;
			x = y;
			y = (xTemp + y) % 10;
			
			int m = x * 10 + y; // ���ο� ��
			if(m == n) {
				count++;
				break;
			}
				
			count++;
		}
		
		System.out.println(count);
		scanner.close();

	}

}
