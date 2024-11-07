package bai6;

import java.util.Scanner;

public class Employee extends Person {
    private String employeeId;
    private String dateHired;

    Employee() {
        super();
    }

    public Employee(String name, int age, char gender, String employeeId, String dateHired) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.dateHired = dateHired;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            super.input();
            this.employeeId = sc.nextLine();
            this.dateHired = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Employee [employeeId=" + employeeId + ", dateHired=" + dateHired + "]";
    }

}
