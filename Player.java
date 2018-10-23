public class Player {

    private String name;
    private int money = 200;
    private int position = 0;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getMoney() {
        return money;
    }

    int getPosition() {
        return position;
    }

    void setPosition(int position) {
        this.position = position;
    }

    void setMoney(int money) {
        this.money = money;
    }
}
