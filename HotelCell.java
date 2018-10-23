package model;

import model.Cell;

public class HotelCell extends Cell {

    private int worth = 200;
    private int rent = 50;
    private String owner;
    private String transaction = "debit";

    public int getWorth() {
        return worth;
    }

    public int getRent() {
        return rent;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getTransaction() {
        return transaction;
    }
}
