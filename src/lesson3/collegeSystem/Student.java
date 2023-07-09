package lesson3.collegeSystem;

public class Student {
	private String name;
	private Enums.Groups group;
	double mark;

	public Student (String name, Enums.Groups group, double mark) {
		this.name = name;
		this.group = group;
		this.mark = mark;
	}

	public double getMark() {
		return this.mark;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", group='" + group + '\'' +
				", mark=" + mark +
				'}';
	}

	public Enums.Groups getGroup() {
		return this.group;
	}

	public String getName() {
		return this.name;
	}
}