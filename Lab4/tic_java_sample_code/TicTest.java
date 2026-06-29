package tic;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void boardsEqualTest() {
		Tic board = new Tic(4, 4);
		Tic board2 = new Tic(3, 5);
		assertFalse(board.boardsEqual(board2.board));
	}

	@Test
	void cellEmptyTest() {
		Tic board = new Tic(4, 4);
		board.board[3][3] = "X";
		assertFalse(board.cellEmpty(board.board, 4, 4));
	}

	@Test
	void PlaceXTest() {
		Tic board = new Tic(4, 4);
		board.placeX(board.board, 2, 2);
		assertEquals("X", board.board[1][1]);
	}
}
