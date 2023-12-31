package com.anees;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("Enter the String for reverse");
		str = sc.next();
		for(int i=str.length()-1;i>0-1; i--)
			System.out.print(str.charAt(i));

	}

}
