package lesson10_collections_1.task1_college;

import java.util.Arrays;

public class Main {

    private static College oxford = new College();
    private static Group group1 = new Group("Group1");
    private static Group group2 = new Group("Group2");

    public static void main(String[] args) {

        oxford.getGroupsList().addAll(Arrays.asList(group1, group2));

        group1.getStudentList().addAll(Arrays.asList(
                new Student("student1", 2),
                new Student("student2", 10),
                new Student("student3", 9)
        ));

        group2.getStudentList().addAll(Arrays.asList(
                new Student("student1", 1),
                new Student("student2", 7)
        ));

        group1.showStudentWithMarkLessThen(8);

        System.out.println(oxford.getGroupWithMinStudentsQuantity());
    }
}
