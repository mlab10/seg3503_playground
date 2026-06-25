package tic;

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;

	//Constructor
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}
	
	public boolean boardsEqual(String[][] board1, String[][] board2) {

		if(board1.length != board2.length || board1[0].length != board2[0].length) {
			return false;
		}

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(!board1[i][j].equals(board2[i][j])) {
					return false;
				}
			}
		}
		return true;
	}


}
