package driver;

import controller.BusinessGame;
import model.Player;

public class BusinessGameApplication {

    public  static void main(String args[]) {
        Player player1 = new Player("Sindhu");
        Player player2 = new Player("Rajiv");
        Player player3 = new Player("Selena");
        BusinessGame businessGame = new BusinessGame();
        businessGame.addUser(player1);
        businessGame.addUser(player2);
        businessGame.addUser(player3);
        businessGame.start();
    }
}
