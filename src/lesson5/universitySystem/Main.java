package lesson5.universitySystem;

import lesson5.universitySystem.structure.Dormitory;
import lesson5.universitySystem.structure.University;

public class Main {
    public static void main(String[] args) {
        University oxford = new University();
        Dormitory dormitory1 = new Dormitory("Minsk Mihaila savickaha", "dormitory1");
        oxford.getDormitories().add(dormitory1);
        System.out.println(oxford.getDormitories());

        oxford.menu();
    }
}