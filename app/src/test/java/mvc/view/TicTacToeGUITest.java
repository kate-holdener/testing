package mvc.view;

import org.junit.*;
import static org.junit.Assert.*;

import mvc.controller.*;
import mvc.model.*;

public class TicTacToeGUITest {

    GameControllerTwoPlayer controller;
    TicTacToeBoard board;

   /**
     * Sets up the test fixture. 
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        board = new TicTacToeBoard();
        controller = new GameControllerTwoPlayer(board);
    }

    /**
     * Tears down the test fixture. 
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
    }

    @Test
    public void testFirstMove() {
    }
}
