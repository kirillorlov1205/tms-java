package lesson6.hw.task3_documentsSystem;

import java.util.Date;

public class Invoice extends Document {

    private double monthSum;
    private int departmentCode;

    public Invoice(int documentNumber, Date documentDate, double monthSum, int departmentCode) {
        super(documentNumber, documentDate);
        this.monthSum = monthSum;
        this.departmentCode = departmentCode;
    }

    public Invoice() {
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "monthSum=" + monthSum +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
