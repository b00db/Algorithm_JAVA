package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/1152

public class _1152 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();
		scanner.close();
		
		if(str.isEmpty()){
            System.out.println(0);
        }else{
            String[] words = str.split(" ");
            System.out.println(words.length);
        }

	}

}
