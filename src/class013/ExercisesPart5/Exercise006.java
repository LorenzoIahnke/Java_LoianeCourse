package class013.ExercisesPart5;

import java.util.Scanner;

public class Exercise006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[][] tictactoe = new char[3][3];

		System.out.println("---Tic Tac Toe---");
		System.out.println("Player 1 = 'X' | Player 2 = 'O'");

		boolean win = false;
		int play = 1;
		char sign;
		int row = 0, column = 0;
		while (!win) {
			if (play % 2 == 1) {
				System.out.println("Player 1 - Choose a row and a column (1, 2, 3): ");
				sign = 'X';
			} else {
				System.out.println("Player 2 - Choose a row and a column (1, 2, 3): ");
				sign = 'O';
			}

			boolean validRow = false;
			while (!validRow) {
				System.out.println("Enter a row (1, 2, 3): ");
				row = scanner.nextInt();
				if (row >= 1 && row <= 3) {
					validRow = true;
				} else {
					System.out.println("Invalid! Try again!");
				}
			}

			boolean validColumn = false;
			while (!validColumn) {
				System.out.println("Enter a column (1, 2, 3): ");
				column = scanner.nextInt();
				if (column >= 1 && column <= 3) {
					validColumn = true;
				} else {
					System.out.println("Invalid! Try again!");
				}
			}

			row--;
			column--;
			if (tictactoe[row][column] == 'X' || tictactoe[row][column] == 'O') {
				System.out.println("Invalid position, already used! Try again!");
			} else {
				tictactoe[row][column] = sign;
				play++;
			}

			for (int i = 0; i < tictactoe.length; i++) {
				for (int j = 0; j < tictactoe[i].length; j++) {
					System.out.print(tictactoe[i][j] + " | ");
				}
				System.out.println();
			}

			if ((tictactoe[0][0] == 'X' && tictactoe[0][1] == 'X' && tictactoe[0][2] == 'X')
					|| (tictactoe[1][0] == 'X' && tictactoe[1][1] == 'X' && tictactoe[1][2] == 'X')
					|| (tictactoe[2][0] == 'X' && tictactoe[2][1] == 'X' && tictactoe[2][2] == 'X')
					|| (tictactoe[0][0] == 'X' && tictactoe[1][0] == 'X' && tictactoe[2][0] == 'X')
					|| (tictactoe[0][1] == 'X' && tictactoe[1][1] == 'X' && tictactoe[2][1] == 'X')
					|| (tictactoe[0][2] == 'X' && tictactoe[1][2] == 'X' && tictactoe[2][2] == 'X')
					|| (tictactoe[0][0] == 'X' && tictactoe[1][1] == 'X' && tictactoe[2][2] == 'X')
					|| (tictactoe[2][0] == 'X' && tictactoe[1][1] == 'X' && tictactoe[0][2] == 'X')) {
				win = true;
				System.out.println("Player 1 won!!");
			} else if ((tictactoe[0][0] == 'O' && tictactoe[0][1] == 'O' && tictactoe[0][2] == 'O')
					|| (tictactoe[1][0] == 'O' && tictactoe[1][1] == 'O' && tictactoe[1][2] == 'O')
					|| (tictactoe[2][0] == 'O' && tictactoe[2][1] == 'O' && tictactoe[2][2] == 'O')
					|| (tictactoe[0][0] == 'O' && tictactoe[1][0] == 'O' && tictactoe[2][0] == 'O')
					|| (tictactoe[0][1] == 'O' && tictactoe[1][1] == 'O' && tictactoe[2][1] == 'O')
					|| (tictactoe[0][2] == 'O' && tictactoe[1][2] == 'O' && tictactoe[2][2] == 'O')
					|| (tictactoe[0][0] == 'O' && tictactoe[1][1] == 'O' && tictactoe[2][2] == 'O')
					|| (tictactoe[2][0] == 'O' && tictactoe[1][1] == 'O' && tictactoe[0][2] == 'O')) {
				win = true;
				System.out.println("Player 2 won!!");

			} else if (play > 9) {
				win = true;
				System.out.println("Tie! Nobody won!");
			}

		}

		scanner.close();
	}

}
