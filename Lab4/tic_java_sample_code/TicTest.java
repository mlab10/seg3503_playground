package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	/**
	 * Test if the boardsEqual method correctly identifies two boards as equal or not equal.
	 */
	@Test
	void boardsEqualTest() {
		Tic board = new Tic(4, 4);
		Tic board2 = new Tic(3, 5);
		assertFalse(board.boardsEqual(board.board, board2.board));
	}
}
