package com.aurionpro.test;

import java.util.Scanner;

public class BasicLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number: ");
		int number = sc.nextInt();
		System.out.println("\nfactorial: " + factorial(number));
		System.out.println("prime or not: " + isPrime(number));
		System.out.print("fibonacci Series: ");
		for (int i : fibonacciSeries(number)) {
			System.out.print(i + " ");
		}

	}

	private static int[] fibonacciSeries(int number) {
		int[] arr = new int[number];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < number; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		return arr;
	}

	private static String isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return "Not prime";
			}
		}
		return "Prime";
	}

	private static int factorial(int number) {
		if (number <= 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}

}
