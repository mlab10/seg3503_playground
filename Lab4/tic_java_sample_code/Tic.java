package tic;

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turnX;
	String turnO;

	//Constructor
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turnO = "O";
		turnX = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}

	public boolean boardsizeEquals(String[][] board2) {
		if(board.length != board2.length || board[0].length != board2[0].length) {
			return false;
		}
		return true;
	}

	/**
	 * Method to check if two boards are equal
	 * @param board2 the second board to compare with
	 * @return true if the boards are equal, false otherwise
	 */
	
	public boolean boardsEqual(String[][] board2) {

		if(!boardsizeEquals(board2)) {
			return false;
		}

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(!board[i][j].equals(board2[i][j])) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean cellsEqual(String[][] board2, int row, int col) {
		if(board[row][col].equals(board2[row][col])) {
			return true;
		}
		return false;
	}

	public boolean cellEmpty(String[][] board, int row, int col) {
		return board[row-1][col-1].equals("_");
	}



}
