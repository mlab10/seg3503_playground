package tic;

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turnX;
	String turnO;
	String currentTurn;

	//Constructor
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turnO = "O";
		turnX = "X";
		currentTurn = turnX; // Always start with X
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}


	//Getters
	public String getCell(String[][] board, int row, int col) {
		return board[row-1][col-1];
	}

	public String[][] getBoard() {
		return board;
	}

	public String getTurn() {
    	return currentTurn;
	}

	//Methods to place X and O on the board
	public void placeX(String[][] board, int row, int col) {
		if (cellEmpty(board, row, col)) {
			board[row-1][col-1] = turnX;
			switchTurn();
		}
	}

	public void placeO(String[][] board, int row, int col) {
		if (cellEmpty(board, row, col)) {
			board[row-1][col-1] = turnO;
			switchTurn();
		}
	}

	//Method to check if two cells are equal
	public boolean cellsEqual(String[][] board2, int row, int col) {
		if(board[row][col].equals(board2[row][col])) {
			return true;
		}
		return false;
	}

	//Methods to check if two boards are equal
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

	//Method to check if a cell is empty
	public boolean cellEmpty(String[][] board, int row, int col) {
		return board[row-1][col-1].equals("_");
	}


	//Method to check if the board is full
	public boolean boardFull(String[][] board) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(board[i][j].equals("_")) {
					return false;
				}
			}
		}
		return true;
	}

	//Method to switch turns
	private void switchTurn() {
		if (currentTurn.equals(turnX)) {
			currentTurn = turnO;
		} 
		else {
			currentTurn = turnX;
		}
	}

	/**
	 * Method to check if there is a winner
	 * @param board
	 * @return
	 */
	public String winner(String [][] board) {

		// Check rows
		for (int i = 0; i < rows; i++) {
			String first = board[i][0];

			if (first.equals("_")) {
				continue;
			}

			boolean win = true;

			for (int j = 1; j < cols; j++) {
				if (!board[i][j].equals(first)) {
					win = false;
					break;
				}
			}

			if (win) {
				return first;
			}
		}

		// Check columns
		for (int j = 0; j < cols; j++) {
			String first = board[0][j];

			if (first.equals("_")) {
				continue;
			}

			boolean win = true;

			for (int i = 1; i < rows; i++) {
				if (!board[i][j].equals(first)) {
					win = false;
					break;
				}
			}

			if (win) {
				return first;
			}
		}

		// Only square boards have diagonals
		if (rows == cols) {

			// Main diagonal
			String first = board[0][0];

			if (!first.equals("_")) {
				boolean win = true;

				for (int i = 1; i < rows; i++) {
					if (!board[i][i].equals(first)) {
						win = false;
						break;
					}
				}

				if (win) {
					return first;
				}
			}

			// Secondary diagonal
			first = board[0][cols - 1];

			if (!first.equals("_")) {
				boolean win = true;

				for (int i = 1; i < rows; i++) {
					if (!board[i][cols - 1 - i].equals(first)) {
						win = false;
						break;
					}
				}

				if (win) {
					return first;
				}
			}
		}

		return "_";
	}


	/**
	 * Method to print the board
	 */
	public void printBoard() {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Tic board = new Tic(3, 3);
		board.placeX(board.board, 1, 1);
		board.placeO(board.board, 2, 1);
		board.placeX(board.board, 2, 2);
		board.placeO(board.board, 2, 3);
		board.placeX(board.board, 3, 3);
		board.printBoard();
	}


}
