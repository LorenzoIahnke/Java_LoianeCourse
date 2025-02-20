package class018.Exercise004;

public class TicTacToe {

	char[][] tictactoe = new char[3][3];
	int play = 1;

	boolean validPlay(int row, int column, char sign) {
		if (tictactoe[row][column] == sign || tictactoe[row][column] == 'O') {
			return false;
		} else {
			tictactoe[row][column] = sign;
			play++;
			return true;
		}
	}

	void showBoard() {
		for (int i = 0; i < tictactoe.length; i++) {
			for (int j = 0; j < tictactoe[i].length; j++) {
				System.out.print(tictactoe[i][j] + " | ");
			}
			System.out.println();
		}
	}

	boolean validWinner(char sign) {
		if ((tictactoe[0][0] == sign && tictactoe[0][1] == sign && tictactoe[0][2] == sign)
				|| (tictactoe[1][0] == sign && tictactoe[1][1] == sign && tictactoe[1][2] == sign)
				|| (tictactoe[2][0] == sign && tictactoe[2][1] == sign && tictactoe[2][2] == sign)
				|| (tictactoe[0][0] == sign && tictactoe[1][0] == sign && tictactoe[2][0] == sign)
				|| (tictactoe[0][1] == sign && tictactoe[1][1] == sign && tictactoe[2][1] == sign)
				|| (tictactoe[0][2] == sign && tictactoe[1][2] == sign && tictactoe[2][2] == sign)
				|| (tictactoe[0][0] == sign && tictactoe[1][1] == sign && tictactoe[2][2] == sign)
				|| (tictactoe[2][0] == sign && tictactoe[1][1] == sign && tictactoe[0][2] == sign)) {
			return true;
		}
		return false;
	}

	boolean turnPlayer1() {
		if (play % 2 == 1) {
			return true;
		}
		return false;
	}

}
