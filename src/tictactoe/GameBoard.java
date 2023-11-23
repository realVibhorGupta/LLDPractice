package tictactoe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameBoard {

    char[][] board;
    int boardSize;
    Queue<Player> nextTurn;

    Scanner input;

    public GameBoard(char[][] board, int boardSize, Queue<Player> nextTurn, Scanner input) {
        this.board = new char[2*(boardSize-1)][2*(boardSize-1)];
        this.boardSize = boardSize;

    }
}
