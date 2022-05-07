package lesson8.act8_1;


import java.io.Serializable;
import java.time.LocalDate;

public class Newspaper extends Document implements Serializable {
    private LocalDate dayIssue ;

    public Newspaper(String id, String publisher, int quantity,LocalDate dayIssue) {
        super(id, publisher, quantity);
        this.dayIssue = dayIssue;
    }

    @Override
    public void printInformation() {
        System.out.println(
                "Newspaper ID: " + getId() + "\r\n"
                +"Publisher: " + getPublisher() + "\r\n"
                +"Quantity: " + getQuantity() + "\r\n"
                +"Day issue: " + dayIssue);
        System.out.println("---------------");
    }
}
