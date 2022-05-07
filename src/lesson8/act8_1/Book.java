package lesson8.act8_1;

import java.io.Serializable;

public class Book extends Document implements Serializable {
    private String author;
    private int numberOfPage;

    public Book() {

    }

    public Book(String id, String publisher, int quantity,String author, int numberOfPage) {
        super(id, publisher, quantity);
        this.author = author;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public void printInformation() {
        System.out.println(
                "Book ID: " + getId() + "\r\n"
                +"Publisher: " + getPublisher() + "\r\n"
                +"Quantity: " + getQuantity() + "\r\n"
                +"Author: " + author + "\r\n"
                +"Number of page: " + numberOfPage);
        System.out.println("---------------");
    }
}
