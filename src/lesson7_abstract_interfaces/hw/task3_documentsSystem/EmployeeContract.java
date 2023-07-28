package lesson7_abstract_interfaces.hw.task3_documentsSystem;

import java.util.Date;

public class EmployeeContract extends Document {

    private Date expireDate;
    private String employeeName;

    public EmployeeContract(int documentNumber, Date documentDate, Date expireDate, String employeeName) {
        super(documentNumber, documentDate);
        this.expireDate = expireDate;
        this.employeeName = employeeName;
    }

    public EmployeeContract() {
    }

    @Override
    public String toString() {
        return "EmployeeContract{" +
                "expireDate=" + expireDate +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
