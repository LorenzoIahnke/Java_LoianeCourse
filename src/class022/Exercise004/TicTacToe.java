package class022.Exercise004;

public class TicTacToe {

	private char[][] tictactoe;
	private int play;

	public TicTacToe() {
		tictactoe = new char[3][3];
		play = 1;
	}
		
	public char[][] getTictactoe() {
		return tictactoe;
	}

	public void setTictactoe(char[][] tictactoe) {
		this.tictactoe = tictactoe;
	}

	public int getPlay() {
		return play;
	}

	public void setPlay(int play) {
		this.play = play;
	}

	public boolean validPlay(int row, int column, char sign) {
		if (tictactoe[row][column] == sign || tictactoe[row][column] == 'O') {
			return false;
		} else {
			tictactoe[row][column] = sign;
			play++;
			return true;
		}
	}

	public void showBoard() {
		for (int i = 0; i < tictactoe.length; i++) {
			for (int j = 0; j < tictactoe[i].length; j++) {
				System.out.print(tictactoe[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public boolean validWinner(char sign) {
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

	public boolean turnPlayer1() {
		if (play % 2 == 1) {
			return true;
		}
		return false;
	}

}
