package lesson3.collegeSystem;

import lesson3.Utilities;

import java.util.ArrayList;

public class System {

	public static ArrayList<Student> journal = new ArrayList<>();

	public static void menu() {
		int choice = 0;
		do {
			java.lang.System.out.println("Choose option:");
			java.lang.System.out.println("1. Get group with lower average mark\n" +
					"2. Remove students with lowest mark (<4)\n" +
					"3. Show all students\n" +
					"4. Show group\n" +
					"5. Exit");

			choice = Utilities.getConsoleNumber();

			switch (choice) {
				case 1:
					getGroupWithLowerAverageMark();
					break;
				case 2:
					removeStudentsWithLowestMark();
					break;
				case 3:
					showAllStudents();
					break;
				case 4:
					java.lang.System.out.println("Select group 1 or 2");
					int group = Utilities.getConsoleNumber();
					if (group == 1) {
						showGroup(Enums.Groups.GROUP_1);
					} else if (group == 2) {
						showGroup(Enums.Groups.GROUP_2);
					} else {
						java.lang.System.out.println("There is no such group");
					}
					break;
				case 5:
					java.lang.System.out.println("Good day!");
					break;
			}
		} while (choice != 5);
	}

	private static void showAllStudents() {
		java.lang.System.out.println(journal);
	}

	private static void showGroup(Enums.Groups groupNumber) {
		ArrayList<Student> group = new ArrayList<>();

		for (Student student : journal) {
			if (student.getGroup() == groupNumber) {
				group.add(student);
			}
		}
		java.lang.System.out.println(group);
	}

	private static void removeStudentsWithLowestMark() {
		ArrayList<Student> studentToRemove = new ArrayList<>();

		for (Student student : journal) {
			if (student.getMark() < 4) {
				studentToRemove.add(student);
				java.lang.System.out.println("Student: '" + student.getName() + "' has been removed");
			}
		}
		journal.removeAll(studentToRemove);
	}

	private static void getGroupWithLowerAverageMark() {
		double averageValueOfGroup1 = 0;
		double averageValueOfGroup2 = 0;

		for (Student student : journal) {
			if (student.getGroup() == Enums.Groups.GROUP_1) {
				averageValueOfGroup1 += student.getMark();
			} else {
				averageValueOfGroup2 += student.getMark();
			}
		}

		java.lang.System.out.println("Group 1 average mark is: '" + averageValueOfGroup1 + "'\n" +
				"Group 2 average mark is: '" + averageValueOfGroup2 + "'");

		if (averageValueOfGroup1 > averageValueOfGroup2) {
			java.lang.System.out.println("Group 2 has lower average mark than group 1");
		} else if (averageValueOfGroup1 < averageValueOfGroup2) {
			java.lang.System.out.println("Group 1 has lower average mark than group 2");
		} else {
			java.lang.System.out.println("Group 1 and group 2 have equal average marks");
		}
	}
}