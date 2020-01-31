package com.boo.level6;
import java.util.*;

// https://www.acmicpc.net/problem/8958

public class _8958 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

		    int TC = scanner.nextInt(); // 테스트케이스의 개수

		    String str[] = new String[TC];

		    for(int i=0; i<TC; i++) {
		    	int count = 0, sum = 0;
		    	
		        str[i] = scanner.next();

		        for(int j=0; j<str[i].length(); j++) {
		            if(str[i].charAt(j) == 'O')
		                sum += ++count;
		            else
		                count = 0;
		        }

		        System.out.println(sum);
		    }

		    scanner.close();
				
	}

}
