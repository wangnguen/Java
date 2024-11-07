package bai6;

public class Test {
    public static void main(String[] args) {
        PartTimeEmployee[] partTimeEmployees = new PartTimeEmployee[5];
        for (int i = 0; i < 2; i++) {
            partTimeEmployees[i] = new PartTimeEmployee();
            partTimeEmployees[i].input();
        }
        for (int i = 0; i < 2; i++) {
            partTimeEmployees[i].toString();
        }
    }
}
