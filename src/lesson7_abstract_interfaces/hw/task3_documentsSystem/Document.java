package lesson7_abstract_interfaces.hw.task3_documentsSystem;

import java.util.Date;

public abstract class Document {

    private int documentNumber;
    private Date documentDate;

    public Document(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public Document() {
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentNumber=" + documentNumber +
                ", documentDate=" + documentDate +
                '}';
    }
}
