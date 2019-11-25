package com.boo.level3;
import java.io.*;

// https://www.acmicpc.net/problem/11022

public class _11022 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int TC = Integer.parseInt(br.readLine());
			
		for(int i = 1; i <= TC; i++) {
			String array[] = br.readLine().split(" ");
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			int c = a + b;
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + c);
			bw.newLine();
		}
			
		bw.close();

	}

}
