package mvc.model;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeBoardTest {

    @Test
    public void testPlacePiece(){
        TicTacToeBoard board = new TicTacToeBoard();
        boolean result = board.placeTicTacToePiece(0,0,TicTacToePiece.X);
        assertTrue("Placing a piece in an empty location", result);
        TicTacToePiece piece = board.getTicTacToePiece(0,0);
        assertTrue("Expect that the piece is X", piece == TicTacToePiece.X);
    }

    @Test
    public void testPlacePieceSameLocation(){
        TicTacToeBoard board = new TicTacToeBoard();
        board.placeTicTacToePiece(0,0,TicTacToePiece.X);
        boolean result = board.placeTicTacToePiece(0,0,TicTacToePiece.O);

        assertFalse("Placing a piece in a non-empty location", result);
        TicTacToePiece piece = board.getTicTacToePiece(0,0);
        assertTrue("Expect that the piece is X", piece == TicTacToePiece.X);
    }

    @Test
    public void testPlacePieceOutsideOfBoard(){
        TicTacToeBoard board = new TicTacToeBoard();
        boolean result = board.placeTicTacToePiece(3,3,TicTacToePiece.X);
        assertFalse("Placing a piece in non-existing location", result);
    }

    @Test
    public void testWinnerHorizontalX(){
        TicTacToeBoard board = new TicTacToeBoard();
        board.placeTicTacToePiece(0,0,TicTacToePiece.X);
        board.placeTicTacToePiece(0,1,TicTacToePiece.X);
        board.placeTicTacToePiece(0,2,TicTacToePiece.X);

        TicTacToePiece winner = board.getWinner();
        assertEquals("Winner ", TicTacToePiece.X, winner);
    }

}
