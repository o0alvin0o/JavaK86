package lesson8.act8_1;

import java.io.Serializable;

public abstract class Document implements Serializable {
    private String id;
    private String publisher;
    private int quantity;

    protected Document() {

    }
    protected Document(String id, String publisher, int quantity) {
        this.id = id;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void printInformation();
}
