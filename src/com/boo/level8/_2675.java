package com.boo.level8;
import java.util.*;

// https://www.acmicpc.net/problem/2675

public class _2675 {

	public static void main(String[] args) {
		
		int t, r;
		String s;
	
        Scanner scanner = new Scanner(System.in);
		
        t = scanner.nextInt();
        for(int tc=0; tc<t; tc++){
            r = scanner.nextInt();
            s = scanner.next();
            for(int i=0; i<s.length(); i++)
                for(int j=0; j<r; j++)
                    System.out.print(s.charAt(i));
            System.out.println();
        }
       scanner.close();

	}

}
