package lesson5.task2_clinic;

public class Patient {

    private TreatmentPlan treatmentPlan;

    public Patient(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }
}