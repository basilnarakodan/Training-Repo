package com.auriopro.test;

import java.util.Scanner;

public class LongestCharacter {

	public static void main(String[] args) {
		int max = 0,count;
		char maxChar = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.next().toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				maxChar = str.charAt(i);
			}
		}
		System.out.println("Most repeated character is \""+maxChar+"\" : "+max+" times");

	}
}
