package com.boo.level7;

// https://www.acmicpc.net/problem/15596

public class _15596 {

	long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++) 
			ans += a[i];
		return ans;
	}
	
}
