public class EmptyCell extends Cell{

    private int cost = 0;
    private String transaction = "debit";

    int getCost() {
        return cost;
    }

    String getTransaction() {
        return transaction;
    }
}
