package tictactoe;

public class PlayerGame {
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.setPlayerId(1);
        player1.setPlayerName("Vibhor");
        player1.setPlayerSymbol('X');

        Player player2 = new Player();
        player2.setPlayerId(2);
        player2.setPlayerName("Robot");
        player2.setPlayerSymbol('0');
    }
}
