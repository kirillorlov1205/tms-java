package lesson1.collegeSystem;

public class Student {

	private String name;
	private String group;
	private float mark;

	public Student(String name) {
		this.name = name;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public float getMark() {
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
}