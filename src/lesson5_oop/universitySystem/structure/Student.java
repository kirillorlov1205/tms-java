package lesson5_oop.universitySystem.structure;

public class Student {

    private String firstname;
    private String lastName;
    private int groupNumber;
    private String livingPlace;

    public Student(String firstname, String lastName, int groupNumber, String livingPlace) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.livingPlace = livingPlace;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                ", livingPlace='" + livingPlace + '\'' +
                '}';
    }
}