package com.boo.level3;
import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/15552

public class _15552 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int TC = Integer.parseInt(br.readLine());
		for(int i = 0; i < TC; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;
			bw.write(sum + "\n");
		}
		bw.close();

	}

}
