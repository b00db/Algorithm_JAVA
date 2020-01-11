package com.boo.level7;

// https://www.acmicpc.net/problem/4673

public class _4673 {

	//boolean type의 기본값은 false이기 때문에 셀프 넘버가 아닌 항목을 true로 체크하고, 체크되지 않은(false) 항목을 출력
	public static void main(String[] args) {
		boolean[] isNotSelfNumber = new boolean[10001]; 
			
		for (int i = 1; i <= 10000; ++i) {
			int dn = getDn(i);
			if (dn <= 10000) {
				isNotSelfNumber[dn] = true;				
			}
		}
			
		for (int i = 1; i < isNotSelfNumber.length; ++i) {
			if (!isNotSelfNumber[i]) {
				System.out.println(i);				
			}
		}
	}

	// n으로 d(n)을 찾는 함수
	private static int getDn(int n) {
		int dn = n;
		while(n > 0) {
			dn += n % 10;
			n /= 10;
		}
		return dn;
	}

}
