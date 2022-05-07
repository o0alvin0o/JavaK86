package lessson8.act8_1;

import java.time.LocalDate;

public class Journal extends Document {
    private int issueNumber;
    private int monthIssue;

    public Journal(String id, String publisher, int quantity,int issueNumber, int monthIssue) {
        super(id, publisher, quantity);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    @Override
    public void printInformation() {
        System.out.println(
                "Journal ID: " + getId() + "\r\n"
                +"Publisher: " + getPublisher() + "\r\n"
                +"Quantity: " + getQuantity() + "\r\n"
                +"Issue number: " + issueNumber + "\r\n"
                +"Month issue: " + monthIssue);
        System.out.println("---------------");
    }
}
