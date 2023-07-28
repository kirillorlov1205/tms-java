package lesson6_oop.universitySystem.structure;

import java.util.ArrayList;

public class Room {

    private int number;
    private ArrayList<Student> studentsList;

    public Room (int number) {
        this.number = number;
        this.studentsList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", studentsList=" + studentsList +
                '}';
    }
}