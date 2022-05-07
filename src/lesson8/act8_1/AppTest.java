package lessson8.act8_1;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        int command;
        DocumentManagement manager1 = new DocumentManagement();
        // App running
        do {
            System.out.println(
                    "Command list: \r\n"
                            + "1. Add document \r\n"
                            + "2. Get all document details \r\n"
                            + "3. Remove document \r\n"
                            + "4. Search by Genre \r\n"
                            + "5. Exit \r\n");
            System.out.print("Enter command: ");
            command = input.nextInt();
            input.nextLine(); //Gathering left over \r\n
            if (command < 1 || command > 5) {
                System.out.print("Wrong command. Re-enter command.");
                continue;
            }

            if (command == 1) {
                System.out.print("Type of document (1 for BOOK, 2 for JOURNAL, 3 for Newspaper): ");
                int type = input.nextInt();
                input.nextLine(); //Gathering left over \r\n
                manager1.addDocument(gatheringDocumentDetails(type));
            }

            if (command == 2) {
                if(manager1.isEmpty()) System.out.println("There's no book. No information to print.");
                else manager1.printInformation();
            }

            if (command == 3) {
                if(manager1.isEmpty()) {
                    System.out.println("There's no book. You need to add more to delete.");
                    continue;
                }
                System.out.print("Enter document id to delete: ");
                String id = input.nextLine();
                manager1.deleteDocument(id);
            }

            if (command == 4) {
                System.out.print("Enter document type (1 for Book, 2 for Journal, 3 for Newspaper: ");
                int type = input.nextInt();
                input.nextLine(); //Gathering left over \r\n
                manager1.printInformationByGenre(type);
            }

        } while (command != 5);
        System.out.println("Have a good time!");
    }

    public static Document gatheringDocumentDetails(int type) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter document id: ");
        String id = input.nextLine();
        System.out.print("Enter publisher name: ");
        String publisher = input.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine(); //Gathering left over \r\n

        final int BOOK = 1, JOURNAL = 2;
        if (type == BOOK) {
            System.out.print("Enter author's name: ");
            String author = input.nextLine();
            System.out.print("Enter number of pages: ");
            int numberOfPage = input.nextInt();
            input.nextLine(); //Gathering left over \r\n
            return new Book(id, publisher, quantity, author, numberOfPage);
        }
        else if (type == JOURNAL) {
            System.out.print("Enter issue number: ");
            int issueNumber = input.nextInt();
            System.out.print("Enter month issue: ");
            int monthIssue = input.nextInt();
            input.nextLine(); //Gathering left over \r\n
            return new Journal(id, publisher, quantity, issueNumber, monthIssue);
        }
        else {
            System.out.print("Enter issue date(yyyy mm dd): ");
            LocalDate dayissue = LocalDate.of(input.nextInt(), input.nextInt(),input.nextInt());
            input.nextLine(); //Gathering left over \r\n
            return new Newspaper(id,publisher,quantity,dayissue);
        }
    }


}
