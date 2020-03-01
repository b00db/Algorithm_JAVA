package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/1316

public class _1316 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int[] st = new int[100];
		int tg = 0;
		int cnt=0;
		for(int i =0; i<a; i++) {
			String b = scanner.nextLine();
			
			for(int j=0; j<b.length(); j++) {
				st[j]= b.charAt(j);
				
			}
			for(int j=0; j<b.length(); j++) { 
				for(int x=j+2; x<b.length(); x++) {
					if(st[j]==st[x-1]) {
						
					}else {
						if(st[j]==st[x]) {
							tg=1;
						}
					}
				}
			}
			if(tg==0) {
				cnt++;
			}
			tg=0;
		}
		System.out.println(cnt);
	}

}
