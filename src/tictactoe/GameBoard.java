package tictactoe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameBoard {

    char[][] board;
    int boardSize;
    Queue<Player> nextTurn;
    boolean gameOver;
    int count=0;
    Scanner input;

    public GameBoard(Player[] players) {
        board = new char[][]{
                {' ','|',' ','|',' '},
                {'-','|','-','|','-'},
                {' ','|',' ','|',' '},
                {'-','|','-','|','-'},
                {' ','|',' ','|',' '}
        };
        input = new Scanner(System.in);
        nextTurn = new LinkedList<>();
        nextTurn.offer(players[0]);
        nextTurn.offer(players[1]);
        gameOver = false;
    }
    public void start(){
        printBoard(board);
        while(!gameOver) {
            count++;
            if (count==10){
                System.out.println( "Match draw");
                break;
            }
            Player p = nextTurn.poll();
            int val = nextMove();
            assert p != null;
            board[val/10][val%10] = p.getPlayerSymbol();
            if(checkStatus(p)) {
                gameOver=true;
                System.out.println(p.getPlayerName() + " has won the game");
            }
            printBoard(board);
            nextTurn.offer(p);
        }

    }

    private void printBoard (char[][] board){
        for(char[] row : board){
            for(char col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private boolean checkStatus(Player p){
        if(board[0][0]+board[0][2]+board[0][4] == p.getPlayerSymbol()+p.getPlayerSymbol()+p.getPlayerSymbol()) return true;
        if(board[2][0]+board[2][2]+board[2][4] == p.getPlayerSymbol()+p.getPlayerSymbol()+p.getPlayerSymbol()) return true;
        if(board[4][0]+board[4][2]+board[4][4] == p.getPlayerSymbol()+p.getPlayerSymbol()+p.getPlayerSymbol()) return true;
        if(board[0][0]+board[2][0]+board[4][0] == p.getPlayerSymbol()+p.getPlayerSymbol()+p.getPlayerSymbol()) return true;
        if(board[0][2]+board[2][2]+board[4][2] == p.getPlayerSymbol()+p.getPlayerSymbol()+p.getPlayerSymbol()) return true;
        if(board[0][4]+board[2][4]+board[4][4] == p.getPlayerSymbol()+p.getPlayerSymbol()+p.getPlayerSymbol()) return true;
        if(board[0][0]+board[2][2]+board[4][4] == p.getPlayerSymbol()+p.getPlayerSymbol()+p.getPlayerSymbol()) return true;
        return board[0][4] + board[2][2] + board[4][0] == p.getPlayerSymbol() + p.getPlayerSymbol() + p.getPlayerSymbol();
    }


    private int nextMove(){
        System.out.println("Enter a number from 1-9");
        int position = input.nextInt();
        while(!validPosition(position)){
            System.out.println("Wrong Position, try different position.Enter a number from 1-9");
            position = input.nextInt();
        }
        return getCoordinates(position);
    }

    private boolean validPosition(int pos){
        if(pos<1 || pos>9) return false;
        int val = getCoordinates(pos);
        return board[val / 10][val % 10] != 'X' && board[val / 10][val % 10] != 'O';
    }

    private int getCoordinates(int pos){
        return switch (pos) {
            case 1 -> 0;
            case 2 -> 2;
            case 3 -> 4;
            case 4 -> 20;
            case 5 -> 22;
            case 6 -> 24;
            case 7 -> 40;
            case 8 -> 42;
            case 9 -> 44;
            default -> -1;
        };
    }
}
