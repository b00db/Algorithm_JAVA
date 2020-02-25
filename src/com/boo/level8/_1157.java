package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/1157

public class _1157 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] count = new int [26]; // ���ĺ� ī��Ʈ�� ������ ������ �迭
		int max = Integer.MIN_VALUE; // ���� ���� ���� ���ĺ� ���� ������ ������ ����
		char answer = '?'; // ������ ������ ������ ����
		
		String word = scanner.next().toUpperCase(); // �ܾ �Է¹ް�, ��� ���ڸ� �빮�ڷ� �ٲ۴�
		
		for(int i = 0; i < word.length(); i++) {
			count[word.charAt(i)-65]++;
			if(max < count[word.charAt(i)-65]) { // �빮�� A�� ASCII code ���� 65 
													// �Է¹��� ���ڰ� a,A(toUpperCase �Լ��� ���� �빮�ڷ� ��ȯ)��� ġ�� 
													// 65 - 65 = 0 �̹Ƿ� ���� count �迭�� 0��°���� a���� ���������� ������ ����. A ~ Z ����
				answer = word.charAt(i);
				max = count[word.charAt(i)-65];
			}
			else if(max == count[word.charAt(i)-65])
				answer = '?';
		}
		
		System.out.println(answer);

	}

}
