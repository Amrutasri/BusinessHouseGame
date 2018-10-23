public class HotelCell extends Cell {

    private int worth = 200;
    private int rent = 50;
    private String owner;
    private String transaction = "debit";

    int getWorth() {
        return worth;
    }

    int getRent() {
        return rent;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    String getOwner() {
        return owner;
    }

    String getTransaction() {
        return transaction;
    }
}
