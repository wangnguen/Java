package bai6;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    private int hoursPerWeek;

    PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(String name, int age, char gender, String employeeId, String dateHired, int hoursPerWeek) {
        super(name, age, gender, employeeId, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            super.input();
            this.hoursPerWeek = sc.nextInt();
        }

    }

    @Override
    public String toString() {
        return super.toString() + " PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
    }

}
