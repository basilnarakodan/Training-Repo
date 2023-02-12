package com.aurionpro.test;

import java.util.Random;

import java.util.Scanner;

public class BookCricket {

	public static void main(String[] args) {
		int score = 1, turn1 = 0, turn2 = 0, totalScore1=0, totalScore2=0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("player 1");
		System.out.print("Open book(enter y): ");

		while (sc.next().equals("y") && score != 0) {
			++turn1;
			score = (random.nextInt(300) + 1)% 7;
			System.out.println(score);
			totalScore1 += score;
			if (score == 0)
				break;
			else
				System.out.print("Open book(enter y): ");
		}

		System.out.println("Player 1 Score: " + totalScore1);
		System.out.println("Player 1 Turns: " + turn1);

		System.out.println("--------------------");

		System.out.println("player 2");
		System.out.print("Open book(enter y): ");
		
		score = 1;
		while (sc.next().equals("y") && score != 0 && totalScore2 <= totalScore1) {
			++turn2;
			score = (random.nextInt(300) + 1)% 7;
			System.out.println(score);
			totalScore2 += score;
			if (score == 0 || totalScore2>totalScore1)
				break;
			else
				System.out.print("Open book(enter y): ");
		}
		
		System.out.println("Player 2 Score: " + totalScore2);
		System.out.println("Player 2 Turns: " + turn2);

		if (totalScore1 > totalScore2) {
			System.out.println("\n**** Player 1 Won ****");
		}
		if (totalScore2 > totalScore1) {
			System.out.println("\n**** Player 2 Won ****");
		}
		if (totalScore1 == totalScore2) {
			if (turn1 < turn2) {
				System.out.println("\n**** Player 1 Won ****");
			}
			System.out.println("\n**** Player 2 Won ****");
		}

	}
}
