package com.sirma.itt.javacourse.intro;

import java.util.Scanner;

public class NOD {
	
	public static int nod(int x, int y) {
		while(x!=y) {
			if(x>y) {
				x=x-y;
			} else {
				y=y-x;
			}
		}
		return x;
	}
	
	public static int nok(int x, int y) {
		
		return x*y/(nod(x,y));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println(nok(x,y));
	}
}
