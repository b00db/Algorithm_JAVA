package com.boo.level6;
import java.util.*;

// https://www.acmicpc.net/problem/2562

public class _2562 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[9];
		int index[] = new int[9];
		
		int max = 0;
		
		for(int i=0; i<9; i++) {
			intArray[i] = scanner.nextInt();
			index[i] = i+1; // 몇 번째 수인지를 나타내는 index를 정의.
		}
		
		int index_result = 0;
	
		for(int i=0; i<9; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
				index_result = index[i]; // i번 째 배열이 최댓값이면 i번 째 수의 index값 반환.
			}
		}
		
		System.out.print(max + "\n" + index_result);
		scanner.close();	

	}

}
