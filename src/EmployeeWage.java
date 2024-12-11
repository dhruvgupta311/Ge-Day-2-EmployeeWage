import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        int WagePerHr = 20;
        int FullDayHrs = 8;
        int PartTimeHrs = 4;
        int MaxWorkingHrs = 100;
        int MaxWorkingDays = 20;

        int totalHrs = 0;
        int totalDays = 0;
        int totalWage = 0;



        System.out.println("Calculating Wages till Total Working Hours or Days is Reached");

        while (totalHrs < MaxWorkingHrs && totalDays < MaxWorkingDays) {
            int attendance = (int) Math.floor(Math.random() * 10) % 3;
            totalDays++;

            switch (attendance) {
                case 1:
                    if (totalHrs + FullDayHrs <= MaxWorkingHrs) {
                        totalHrs += FullDayHrs;
                        totalWage += FullDayHrs * WagePerHr;
                    }
                    break;
                case 2:
                    if (totalHrs + PartTimeHrs <= MaxWorkingHrs) {
                        totalHrs += PartTimeHrs;
                        totalWage += PartTimeHrs * WagePerHr;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHrs);
        System.out.println("Total Wage: " + totalWage);
    }
}
