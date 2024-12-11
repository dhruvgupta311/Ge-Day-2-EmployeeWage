import java.util.Scanner;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage Computation");
        double attendanceCheck = Math.floor(Math.random() * 10) % 2;
        int WagePerHr = 20;
        int EmpWage;
        if(attendanceCheck == 1){
            System.out.println("Employee is PRESENT");
            System.out.println("Employee's Wage: " + 8*WagePerHr);
        }
        else {
            System.out.println("Employee is ABSENT");
            System.out.println("Employee's Wage: " + 0*WagePerHr);
        }


    }
}
