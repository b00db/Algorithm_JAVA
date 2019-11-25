package com.boo.level3;
import java.util.*;

// https://www.acmicpc.net/problem/10871

public class _10871 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int x = scanner.nextInt();

	    int[] intArray = new int[n];
	    for(int i=0; i<n; i++)
	        intArray[i] = scanner.nextInt();

	    for(int i=0; i<n; i++)
	        if(intArray[i] < x)
	            System.out.print(intArray[i] + " ");

	    scanner.close();

	}

}
