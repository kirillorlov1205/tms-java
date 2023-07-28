package lesson5_classes.practise;

public class Student {

    private String name;
    private String group;
    private int diplomaMark;

    public Student(String name, String group, int diplomaMark) {
        this.name = name;
        this.group = group;
        this.diplomaMark = diplomaMark;
    }

    public String getStudentData() {
        return "name = '" + this.name + "', " +
                "group = '" + this.group + "', " +
                "diploma mark = '" + this.diplomaMark + "'";
    }

    public int getDiplomaMark() {
        return this.diplomaMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", diploma mark=" + diplomaMark +
                '}';
    }
}