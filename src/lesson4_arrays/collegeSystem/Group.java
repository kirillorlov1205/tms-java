package lesson4_arrays.collegeSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {

    private String groupName;
    private double marksSum;
    private int marksQuantity;
    private final ArrayList<Student> listOfStudentsInGroup = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
        marksSum = 0;
        marksQuantity = 0;
    }

    public Group() {
    }

    public void addStudents(Student[] studentsArr) {
        this.listOfStudentsInGroup.addAll(Arrays.asList(studentsArr));
        for (Student student : studentsArr) {
            this.marksSum += student.getMark();
            this.marksQuantity++;
        }
    }

    public double getGroupAverageMark() {
        return this.marksSum / this.marksQuantity;
    }

    public String getGroupName() {
        return groupName;
    }

    public ArrayList<Student> getListOfStudentsInGroup() {
        return listOfStudentsInGroup;
    }

    public void subtractGrade(double mark) {
        this.marksSum -= mark;
    }

    public void reduceMark() {
        this.marksQuantity--;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", marksSum=" + marksSum +
                ", marksQuantity=" + marksQuantity +
                ", listOfStudentsInGroup=" + listOfStudentsInGroup +
                '}';
    }
}