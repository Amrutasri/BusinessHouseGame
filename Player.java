package model;

public class Player {

    private String name;
    private int money = 200;
    private int position = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
