package lesson6.hw.task3_documentsSystem;

import java.util.ArrayList;

public class Register {

    private static ArrayList<Document> documentsList = new ArrayList<>();

    public static void addDocument(Document document) {
        documentsList.add(document);
    }

    public static ArrayList<Document> getDocumentsList() {
        return documentsList;
    }
}
