package com.auriopro.test;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
	public static int turn = 0, total = 0;

	public static void main(String[] args) {
		int die;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		while (total < 20) {
			int score = 0;
			++turn;
			System.out.println("\nTurn " + turn);
			System.out.println("-------------------");

			System.out.print("Roll or Hold(r/h): ");

			while (sc.next().equals("r") && total < 20) {
				die = random.nextInt(6) + 1;
				score += die;
				total += die;
				System.out.println(die);
				if (die == 1) {
					score = 0;
					total = 0;
					System.out.println("Turn over: No score");
					break;
				}
				if (total < 20)
					System.out.print("Roll or Hold(r/h): ");
				else
					break;
			}
			System.out.println("Turn Score: " + score);
			if (total >= 20) {
				System.out.println("\nYou won in " + turn + " turns");
			}
			System.out.println("Total Score: " + total);
		}
	}

}
