package com.boo.sort;

import java.util.Arrays;
import java.util.Scanner;

public class _1427 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String N = scanner.nextLine();
		
		/* Arrays.sort() 메소드 사용
		char[] array = new char[N.length()];
		
		for(int i=0; i<N.length(); i++) {
			array[i] = N.charAt(i);
		}
		
		Arrays.sort(array);
		
		for(int i=array.length-1; i>=0; i--)
			System.out.print(array[i]);
		*/
		
		int[] array = new int[N.length()];
		for(int i=0; i<N.length(); i++) {
			array[i] = Character.getNumericValue(N.charAt(i));
		}
		
		// selectionSort(array);
		bubbleSort(array);
		
		for(int i=0; i<N.length(); i++) {
			System.out.print(array[i]);
		}
	}
	
	// 선택 정렬(Selection Sort)
	static void selectionSort(int A[]) {
		int size = A.length;
		int max;
		int temp;
		
		for(int i=0; i<size-1; i++) {
			max = i;
			
			for(int j=i+1; j<size; j++) {
				if(A[max] < A[j]) {
					max = j;
				}
			}
			
			temp = A[max];
			A[max] = A[i];
			A[i] = temp;
		}
	}
	
	// 버블 정렬(Bubble Sort)
	static void bubbleSort(int A[]) {
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A.length-i-1; j++) {
				if(A[j] < A[j+1]) {
					int temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
				}
			}
		}
	}
}
