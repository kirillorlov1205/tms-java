package lesson5.universitySystem.structure;

import java.util.ArrayList;

public class Room {

    int number;
    private ArrayList<Student> studentsList;

    public Room (int number) {
        this.number = number;
        this.studentsList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }
}