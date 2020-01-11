package com.boo.level6;
import java.io.*;

// https://www.acmicpc.net/problem/10818

public class _10818 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int n = Integer.parseInt(br.readLine());
		int[] intArray = new int[n];
		String array[] = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			intArray[i] = Integer.parseInt(array[i]);
			
			min = (min > intArray[i])? intArray[i] : min;
			max = (max < intArray[i])? intArray[i] : max;
		}
		
		bw.write(min + " " + max);
		bw.close();
		
	}
}
