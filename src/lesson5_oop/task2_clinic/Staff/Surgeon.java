package lesson5_oop.task2_clinic.Staff;

public class Surgeon extends Doctor{
    private static final Surgeon BEST_SURGEON = new Surgeon();

    @Override
    public void treat() {
        System.out.println("Surgeon will be the best choice");
    }

    public static Surgeon getBestSurgeon() {
        return BEST_SURGEON;
    }

}