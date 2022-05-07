package lessson8.act8_1;

import java.io.Serializable;
import java.util.*;

public class DocumentManagement {

    public static final int BOOK = 1, JOURNAL = 2, NEWSPAPER = 3;

    private List<Document> documentList = new ArrayList<>();
    private Map<String,Integer> idMap =new HashMap<>();


    public DocumentManagement() {

    }

    public void addDocument(Document document) {
        documentList.add(document); // add document to the list
        idMap.put(document.getId(), documentList.indexOf(document));
    }

    public void printInformation() {
        documentList.forEach(document -> document.printInformation());
    }

    public boolean isEmpty() {
        return documentList.isEmpty();
    }
    public void deleteDocument(String id) {
        documentList.remove((int)idMap.get(id));
        idMap.clear(); // clear the map after remove
        documentList.forEach(document -> {
            idMap.put(document.getId(), documentList.indexOf(document)); //refresh new map
        });

    }

    public void printInformationByGenre(int genre) {
        List<Document> listByGenre = new ArrayList<>(); // create a list that contains only one type
        if (genre == BOOK) {
            documentList.forEach(document -> {
                if (document instanceof Book) listByGenre.add(document);
            });
        } else if (genre == JOURNAL) {
            documentList.forEach(document -> {
                if (document instanceof Journal) listByGenre.add(document);
            });
        } else if (genre == NEWSPAPER) {
            documentList.forEach(document -> {
                if (document instanceof Newspaper) listByGenre.add(document);
            });
        }
        if (listByGenre.isEmpty()) System.out.println("There's no book of this type. Please add more.");
        else listByGenre.forEach(document -> document.printInformation());
    }

}
