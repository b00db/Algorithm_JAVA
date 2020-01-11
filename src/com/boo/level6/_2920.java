package com.boo.level6;
import java.util.*;

// https://www.acmicpc.net/problem/2920

public class _2920 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] scale = new int[8];
		for(int i=0; i<scale.length; i++)
			scale[i] = scanner.nextInt();
		scanner.close();
		
		String output = "";
		for(int i=0; i<scale.length-1; i++) {
			if(scale[i] + 1 == scale[i+1])
				output = "ascending";
			else if(scale[i] - 1 == scale[i+1])
				output = "descending";
			else {
				output = "mixed";
				break; // 한 번 틀리면 절대 ascending이나 descending이 될 수 없음.
			}
		}
		
		System.out.println(output);
	}

}
