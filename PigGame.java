
import java.util.Random;
import java.util.Scanner;

public class PigGame2 {
	public static int turn = 1, totalScore = 0, holdScore = 0, turnScore = 0;
	static String str;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		startGame();
	}

	private static void startGame() {
		boolean roll;
		System.out.println("\nTurn " + turn);
		System.out.println("-----------------");
		System.out.print("Roll or Hold(r/h): ");
		str = sc.next();
	
		if (str.equals("r")) {
			roll = roll();
			while (roll) {
				if (totalScore >= 20) {
					System.out.println("***You finished in " + turn + " turns***");
					printScore();
					System.exit(0);
				} 
				else {
				System.out.print("Roll or Hold(r/h): ");
				str = sc.next();
				roll = roll();
				}
			}
		}
		if (str.equals("h")) {
			hold();
			turn++;
			printScore();

			startGame();
		}
		if(!str.equals("r") && !str.equals("h")) {
			System.out.println("invalid input. enter r/h.");
			startGame();
		}
		turn++;
		printScore();
		startGame();
	}

	private static void printScore() {
		System.out.println("turn Score: " + turnScore);
		System.out.println("total score: " + totalScore);
		System.out.println("hold score: " + holdScore);
	}

	private static void hold() {
		holdScore = totalScore;
		totalScore = holdScore;
	}

	private static boolean roll() {
		int die;
		if (str.equals("r")) {
			Random random = new Random();
			die = random.nextInt(6) + 1;
			System.out.println(die);
			turnScore += die;
			totalScore +=die;
			if (die == 1) {
				turnScore = 0;
				totalScore = holdScore;
				return false;
			}
			return true;
		}
		return false;
	}

}
