public class JailCell extends Cell{

    private int fine = 50;
    private String transaction = "debit";

    int getFine() {
        return fine;
    }

    String getTransaction() {
        return transaction;
    }
}
