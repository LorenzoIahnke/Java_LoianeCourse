package class022.Exercise004;

import java.util.Scanner;

public class MainTicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		TicTacToe ttt = new TicTacToe();

		System.out.println("---Tic Tac Toe---");
		System.out.println("Player 1 = 'X' | Player 2 = 'O'");

		boolean win = false;
		char sign;
		int row = 0, column = 0;

		while (!win) {
			if (ttt.turnPlayer1()) {
				System.out.println("Player 1 - Choose a row and a column (1, 2, 3): ");
				sign = 'X';
			} else {
				System.out.println("Player 2 - Choose a row and a column (1, 2, 3): ");
				sign = 'O';
			}
			row = value("Row", scanner);
			column = value("Column", scanner);
			ttt.validPlay(row, column, sign);
			ttt.showBoard();
			if (ttt.validWinner('X')) {
				win = true;
				System.out.println("Player 1 WINS!");
			} else if (ttt.validWinner('O')) {
				win = true;
				System.out.println("Player 2 WINS!");
			} else if (ttt.getPlay() > 9) {
				win = true;
				System.out.println("Tie! Nobody won!");
			}
		}

		scanner.close();
	}

	static int value(String valueType, Scanner scanner) {
		int value = 0;
		boolean validValue = false;
		while (!validValue) {
			System.out.println("Enter a " + valueType + "(1, 2, 3): ");
			value = scanner.nextInt();
			if (value >= 1 && value <= 3) {
				validValue = true;
			} else {
				System.out.println("Invalid! Try again!");
			}
		}
		value--;
		return value;
	}

}
