package lessson8.act8_1;

public abstract class Document {
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
