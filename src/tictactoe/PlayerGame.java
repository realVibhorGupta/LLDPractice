package tictactoe;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerGame {
    GameBoard gameBoard;
    Queue<Player> player;

    public PlayerGame(Player[] players) {
        gameBoard = new GameBoard(players);
        player = new LinkedList<>();
    }
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.setPlayerId(1);
        player1.setPlayerName("Vibhor");
        player1.setPlayerSymbol('X');

        Player player2 = new Player();
        player2.setPlayerId(2);
        player2.setPlayerName("Robot");
        player2.setPlayerSymbol('0');

        Player[] players = new Player[]{player1,player2};
        PlayerGame playGame = new PlayerGame(players);
        playGame.play();
    }
    private void play(){
        gameBoard.start();
    }

}
