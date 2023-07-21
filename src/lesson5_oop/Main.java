package lesson5_oop;

import lesson5_oop.task1_phone.Phone;
import lesson5_oop.task2_clinic.Clinic;
import lesson5_oop.task2_clinic.Patient;
import lesson5_oop.task2_clinic.TreatmentPlan;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//------Task1 Phone
        ArrayList<Phone> phonesList = new ArrayList<>(Arrays.asList(
                new Phone(299998745, "samsung", 200),
                new Phone(291999945, "iphone", 190),
                new Phone(295469841, "iphone", 190)));

        for (Phone phone : phonesList
        ) {
            phone.receiveCall("Test Caller");
            System.out.println(phone.getNumber());
            phone.receiveCall("Unknown person", 333667754);
        }

        Phone phone4 = new Phone(334589865, "Huawei", 194.3);
        phone4.sendMessage(332345677, 293457698, 334567809);

//------Task2 Clinic

        Clinic superClinic = new Clinic();

        superClinic.getPatientsList().addAll(new ArrayList<>(Arrays.asList(
                new Patient(new TreatmentPlan(1)),
                new Patient(new TreatmentPlan(2)),
                new Patient(new TreatmentPlan(3))
        )));

        for (Patient patient : superClinic.getPatientsList()
        ) {
            Clinic.getDoctorByTreatmentPlan(patient);
        }

        for (Patient patient : superClinic.getPatientsList()
        ) {
            patient.getTreatmentPlan().getDoctor().treat();
        }

    }
}