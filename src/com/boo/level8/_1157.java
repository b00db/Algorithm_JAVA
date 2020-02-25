package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/1157

public class _1157 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] count = new int [26]; // 알파벳 카운트를 저장할 정수형 배열
		int max = Integer.MIN_VALUE; // 가장 많이 나온 알파벳 수를 저장할 정수형 변수
		char answer = '?'; // 정답을 저장할 문자형 변수
		
		String word = scanner.next().toUpperCase(); // 단어를 입력받고, 모든 문자를 대문자로 바꾼다
		
		for(int i = 0; i < word.length(); i++) {
			count[word.charAt(i)-65]++;
			if(max < count[word.charAt(i)-65]) { // 대문자 A의 ASCII code 값은 65 
													// 입력받은 문자가 a,A(toUpperCase 함수로 인해 대문자로 변환)라고 치면 
													// 65 - 65 = 0 이므로 위의 count 배열의 0번째에는 a부터 순차적으로 개수를 샌다. A ~ Z 까지
				answer = word.charAt(i);
				max = count[word.charAt(i)-65];
			}
			else if(max == count[word.charAt(i)-65])
				answer = '?';
		}
		
		System.out.println(answer);

	}

}
