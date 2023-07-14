package lesson5.task2_clinic;

import lesson5.task2_clinic.Staff.Dentist;
import lesson5.task2_clinic.Staff.Surgeon;
import lesson5.task2_clinic.Staff.Therapist;

public class Clinic {

    public static void getDoctorByTreatmentPlan(Patient patient) {

        switch (patient.getTreatmentPlan().getNumber()) {
            case 1 -> Surgeon.getBestSurgeon().treat();
            case 2 -> Dentist.getBestDentist().treat();
            default -> Therapist.getBestTherapist().treat();
        }
    }
}