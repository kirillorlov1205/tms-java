package lesson4_arrays.collegeSystem;

public class Main {
    public static void main(String[] args) {

        Group groupA = new Group("A");
        groupA.addStudents(new Student[]{new Student("Kirill", "A", 10),
                new Student("Dany", "A", 2)});

        Group groupB = new Group("B");
        groupB.addStudents(new Student[]{new Student("Denis", "B", 3),
                new Student("Mark", "B", 10.4)});

        Group groupC = new Group("C");
        groupC.addStudents(new Student[]{new Student("Johny", "C", 4.4),
                new Student("Tomas", "C", 3.6)});


        Journal.addGroupsToJournal(new Group[]{groupA, groupB, groupC});

        Journal.menu();
    }
}