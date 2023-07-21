package lesson5_oop.task2_clinic.Staff;

public class Therapist extends Doctor{

    private static final Therapist BEST_THERAPIST = new Therapist();

    @Override
    public void treat() {
        System.out.println("Therapist will be the best choice");
    }

    public static Therapist getBestTherapist() {
        return BEST_THERAPIST;
    }

}