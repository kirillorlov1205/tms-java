package lesson5.task2_clinic.Staff;

public class Dentist extends Doctor{

    private static final Dentist BEST_DENTIST = new Dentist();

    @Override
    public void treat() {
        System.out.println("Dentist will be the best choice");
    }

    public static Dentist getBestDentist() {
        return BEST_DENTIST;
    }
}