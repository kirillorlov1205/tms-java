package lesson3.collegeSystem;

import support.Utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class Journal {

    private static final ArrayList<Group> journalWithGroups = new ArrayList<>();

    public static void menu() {
        int choice = 0;
        do {
            System.out.println("Choose option:");
            System.out.println("1. Get group with lowest average mark\n" +
                    "2. Remove students with lowest mark (<4)\n" +
                    "3. Show all students\n" +
                    "4. Show group\n" +
                    "5. Exit");

            choice = Utilities.getConsoleNumber();

            switch (choice) {
                case 1:
                    getGroupWithLowestAverageMark();
                    break;
                case 2:
                    removeStudentsWithLowestMark();
                    break;
                case 3:
                    showAllStudents();
                    break;
                case 4:
                    System.out.println("Provide group name");
                    String groupName = Utilities.getConsoleString();
                    System.out.println(getGroupByName(groupName));
                    break;
                case 5:
                    System.out.println("Good day!");
                    break;
            }
        } while (choice != 5);
    }

    private static void showAllStudents() {
        for (Group group : journalWithGroups) {
            System.out.println(group.getListOfStudentsInGroup());
        }
    }

    private static void removeStudentsWithLowestMark() {

        for (Group group : journalWithGroups) {
            ArrayList<Student> studentToRemove = new ArrayList<>();

            for (Student student : group.getListOfStudentsInGroup()) {
                if (student.getMark() < 4) {
                    studentToRemove.add(student);
                    System.out.println("Student: '" + student.getName() + "' has been removed");
                    group.subtractGrade(student.getMark());
                    group.reduceMark();
                }
            }

            group.getListOfStudentsInGroup().removeAll(studentToRemove);
        }
    }

    private static void getGroupWithLowestAverageMark() {

        Group groupWithLowestAverageMark = getGroupByName("A");

        for (Group group : journalWithGroups) {
            if (groupWithLowestAverageMark.getGroupAverageMark() > group.getGroupAverageMark()) {
                groupWithLowestAverageMark = group;
            }
        }
        System.out.println("Group: '" + groupWithLowestAverageMark.getGroupName() + "' has the lowest average mark = '" + groupWithLowestAverageMark.getGroupAverageMark() + "'");
    }

    public static Group getGroupByName(String name) {

        Group newGroup = new Group();

        for (Group group : journalWithGroups) {
            if (group.getGroupName().equals(name)) {
                newGroup = group;
                return newGroup;
            }
        }

        if (newGroup.getGroupName() == null) {
            System.out.println("There is no such group with name: '" + name + "'");
        }
        return null;
    }

    public static void addGroupsToJournal(Group[] groups) {
        journalWithGroups.addAll(Arrays.asList(groups));
    }
}