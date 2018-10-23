public class GameApplication {

    public  static void main(String args[]) {
        Player player1 = new Player("Sindhu");
        Player player2 = new Player("Rajiv");
        Game game = new Game();
        game.addUser(player1);
        game.addUser(player2);
        game.start();
    }
}
