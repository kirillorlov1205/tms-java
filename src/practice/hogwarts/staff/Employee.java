package practice.hogwarts.staff;

public abstract class Employee {

    private String name;
    private int yearsOfExperience;

    public Employee(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
