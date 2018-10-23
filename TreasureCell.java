package model;

import model.Cell;

public class TreasureCell extends Cell {

    private int value = 200;
    private String transaction = "credit";

    public int getValue() {
        return value;
    }

    public String getTransaction() {
        return transaction;
    }
}
