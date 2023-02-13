import java.util.Scanner;

import javax.swing.WindowConstants;

class TicTacToe {

    static int[] board = new int[9];
    static boolean isPlayer1Played = false;
    static Scanner scanner = new Scanner(System.in);
    static int position;
    static int player1 = 1, player2 = 4;

    public static void showBoard() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("\n-------------\n");
        for (int i = 0; i < board.length; i++) {

            if (board[i] == 0) {
                System.out.print("|   ");
            } else if (board[i] == 1) {
                System.out.print("| x ");
            } else {
                System.out.print("| o ");
            }

            if ((i + 1) % 3 == 0) {
                System.out.print("|");
                System.out.print("\n-------------");
                System.out.println("");
            }
        }
    }

    public static boolean isEmpty(int position) {
        if (board[position] == 0) {
            return true;
        }
        return false;
    }

    public static void readPosition(int player) {
        position = scanner.nextInt();
        if (isEmpty(position - 1)) {
            board[position - 1] = player;
        } else {
            System.out.print("\nPosition already taken , Enter again : ");
            readPosition(player);
        }
    }

    // player = 1 is player 1 and
    public static void play() {
        if (!isPlayer1Played) {
            System.out.print("\nPlayer-1 (x)" + " \n Enter your position(1-9) : ");
            readPosition(player1);
            isPlayer1Played = true;
        } else {
            System.out.print("\nPlayer-2 (o)" + " \n Enter your position(1-9) : ");
            readPosition(player2);
            isPlayer1Played = false;
        }
    }

    public static int whoWon() {
        // check horizontally
        int winCondition1 = board[0] + board[1] + board[2];
        int winCondition2 = board[3] + board[4] + board[5];
        int winCondition3 = board[6] + board[7] + board[8];

        // check vertically
        int winCondition4 = board[0] + board[3] + board[6];
        int winCondition5 = board[1] + board[4] + board[7];
        int winCondition6 = board[2] + board[5] + board[8];

        // check diagonally
        int winCondition7 = board[0] + board[4] + board[8];
        int winCondition8 = board[2] + board[4] + board[6];

        if (winCondition1 == 3 || winCondition2 == 3 || winCondition3 == 3 ||
                winCondition4 == 3 || winCondition5 == 3 || winCondition6 == 3 ||
                winCondition7 == 3 || winCondition8 == 3) {
            return 1;
        } else if (winCondition1 == 12 || winCondition2 == 12 || winCondition3 == 12 ||
                winCondition4 == 12 || winCondition5 == 12 || winCondition6 == 12 ||
                winCondition7 == 12 || winCondition8 == 12) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            showBoard();
            if (whoWon() == 1 || whoWon() == 2) {
                System.out.println("Player - " + whoWon() + " Won the game");
                break;
            } else if ((i == 9) && whoWon() == 0) {
                System.out.println("Draw\nGAME OVER");
                break;
            } else {
                play();
            }
        }
    }
}
