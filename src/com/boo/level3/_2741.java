package com.boo.level3;
import java.io.*;

// https://www.acmicpc.net/problem/2741

public class _2741 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter rw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			rw.write(i + "\n");
		}
		
		rw.flush();
		rw.close();

	}

}
