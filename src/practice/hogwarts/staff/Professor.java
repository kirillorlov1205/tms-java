package practice.hogwarts.staff;

public class Professor extends Employee {

    String subject;
    String classRoom;

    public Professor(String name, int yearsOfExperience, String subject, String classRoom) {
        super(name, yearsOfExperience);
        this.subject = subject;
        this.classRoom = classRoom;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassRoom() {
        return classRoom;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name= '" + super.getName() + '\'' +
                "experience = '" + super.getName() + '\'' +
                "subject='" + subject + '\'' +
                "classRoom='" + classRoom + '\'' +
                '}';
    }
}
