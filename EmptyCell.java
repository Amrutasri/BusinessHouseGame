package model;

import model.Cell;

public class EmptyCell extends Cell {

    private int cost = 0;
    private String transaction = "debit";

    public int getCost() {
        return cost;
    }

    public String getTransaction() {
        return transaction;
    }
}
