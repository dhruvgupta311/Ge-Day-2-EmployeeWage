import java.util.Scanner;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage Computation");
        int WagePerHr = 20;
        int EmpWage;
        int attendanceCheck = (int) (Math.floor(Math.random() * 10) % 3);

        switch (attendanceCheck) {
            case 1:
                System.out.println("Employee is PRESENT");
                EmpWage = 8 * WagePerHr;
                System.out.println("Employee's Wage: " + EmpWage);
                break;
            case 2:
                System.out.println("Employee is Part Time");
                EmpWage = 4 * WagePerHr;
                System.out.println("Employee's Wage: " + EmpWage);
                break;
            default:
                System.out.println("Employee is ABSENT");
                EmpWage = 0 * WagePerHr;
                System.out.println("Employee's Wage: " + EmpWage);
                break;
        }
    }
}
