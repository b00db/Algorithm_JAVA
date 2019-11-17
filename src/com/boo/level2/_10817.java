package com.boo.level2;
import java.util.*;

// https://www.acmicpc.net/problem/10817

public class _10817 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int array[] = new int[3];
		for(int i=0; i<array.length; i++) 
			array[i] = scanner.nextInt();
		
		Arrays.sort(array);
		
		System.out.println(array[1]);
		
		scanner.close();
		
	}

}
