package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void boardsEqualTest() {
		Tic board = new Tic(4, 4);
		Tic board2 = new Tic(3, 5);
		assertFalse(board.boardsEqual(board2.board));
	}
}
