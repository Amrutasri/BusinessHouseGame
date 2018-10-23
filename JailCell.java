package model;

import model.Cell;

public class JailCell extends Cell {

    private int fine = 50;
    private String transaction = "debit";

    public int getFine() {
        return fine;
    }

    public String getTransaction() {
        return transaction;
    }
}
