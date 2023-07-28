package lesson6_oop.task2_clinic;

import lesson6_oop.task2_clinic.Staff.Doctor;

public class TreatmentPlan {

    private int number;
    private Doctor doctor;

    public TreatmentPlan(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}