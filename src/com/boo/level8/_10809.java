package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/10809

public class _10809 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 String s = scanner.next();

		 for (char c = 'a' ; c <= 'z' ; c++)
				System.out.print(s.indexOf(c) + " ");
		 
		 scanner.close();

	}

}
