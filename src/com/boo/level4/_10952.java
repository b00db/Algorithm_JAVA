package com.boo.level4;
import java.io.*;

// https://www.acmicpc.net/problem/10952

public class _10952 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String array[] = br.readLine().split(" ");
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			
			if(a==0 && b==0)
				break;
			
			bw.write(a + b + "\n");
		}
		
		bw.close();
		
	}
	
}