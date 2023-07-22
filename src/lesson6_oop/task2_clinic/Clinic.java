package lesson6_oop.task2_clinic;

import lesson6_oop.task2_clinic.Staff.Dentist;
import lesson6_oop.task2_clinic.Staff.Doctor;
import lesson6_oop.task2_clinic.Staff.Surgeon;
import lesson6_oop.task2_clinic.Staff.Therapist;

import java.util.ArrayList;

public class Clinic {

    private ArrayList<Patient> patientsList;
    private ArrayList<Doctor> doctorsList;

    public Clinic() {
        this.patientsList = new ArrayList<>();
        this.doctorsList = new ArrayList<>();
    }

    public static void getDoctorByTreatmentPlan(Patient patient) {
        switch (patient.getTreatmentPlan().getNumber()) {
            case 1 -> patient.getTreatmentPlan().setDoctor(Surgeon.getBestSurgeon());
            case 2 -> patient.getTreatmentPlan().setDoctor(Dentist.getBestDentist());
            default -> patient.getTreatmentPlan().setDoctor(Therapist.getBestTherapist());
        }
    }

    public ArrayList<Doctor> getDoctorsList() {
        return doctorsList;
    }

    public ArrayList<Patient> getPatientsList() {
        return patientsList;
    }
}