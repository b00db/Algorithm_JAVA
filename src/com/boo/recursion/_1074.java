package com.boo.recursion;

// https://www.acmicpc.net/problem/1074
	
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1074 {
	static int N;
	static int r;
	static int c;
	static int count = 0;
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		z((int)Math.pow(2, N), 0, 0);
	}
	
	static void z(int size, int row, int col) {
		if(size == 2) { // base case
			if(row == r && col == c) { // 2x2에서의 1사분면 
				System.out.println(count);
				return;
			}
			count++;
			if(row == r && col+1 == c) { // 2x2에서의 2사분면 
				System.out.println(count);
				return;
			}
			count++;
			if(row+1 == r && col == c) { // 2x2에서의 3사분면 
				System.out.println(count);
				return;
			}
			count++;
			if(row+1 == r && col+1 == c) { // 2x2에서의 4사분면 
				System.out.println(count);
				return;
			}
			count++;
		}
		else { // recursive case
			z(size/2, row, col); // 2^N / 2에서의 1사분면
			z(size/2, row, col+size/2); // 2^N / 2에서의 2사분면
			z(size/2, row+size/2, col); // 2^N / 2에서의 3사분면
			z(size/2, row+size/2, col+size/2); // 2^N / 2에서의 4사분면
		}
	}
}
