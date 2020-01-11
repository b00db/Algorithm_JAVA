package com.boo.level7;

// https://www.acmicpc.net/problem/4673

public class _4673 {

	//boolean type�� �⺻���� false�̱� ������ ���� �ѹ��� �ƴ� �׸��� true�� üũ�ϰ�, üũ���� ����(false) �׸��� ���
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

	// n���� d(n)�� ã�� �Լ�
	private static int getDn(int n) {
		int dn = n;
		while(n > 0) {
			dn += n % 10;
			n /= 10;
		}
		return dn;
	}

}
