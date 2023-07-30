package lesson10_collections_1.task1_college;

import java.util.ArrayList;
import java.util.List;

public class Group {

    String name;
    private List<Student> studentList;

    public Group(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void showStudentWithMarkLessThen(int mark) {
        System.out.println("Students with mark less then " + mark + ":" );

        for (Student student : studentList) {
            if (student.getMark() > mark) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "name: " + name +
                " studentList=" + studentList +
                '}';
    }
}
