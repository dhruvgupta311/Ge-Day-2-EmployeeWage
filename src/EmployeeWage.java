import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        int WagePerHr = 20;
        int FullDayHrs = 8;
        int PartTimeHrs = 4;
        int WorkingDays = 20;
        int totalWage = 0;

        System.out.println("Calculating Wages for a Month (20 Working Days)");
        for (int day = 1; day <= WorkingDays; day++) {
            int attendance = (int) Math.floor(Math.random() * 10) % 3;

            switch (attendance) {
                case 1:
                    totalWage += FullDayHrs * WagePerHr;
                    break;
                case 2:
                    totalWage += PartTimeHrs * WagePerHr;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Total Wage for the Month: " + totalWage);
    }
}
