public class EmployeeWage {

    public static void calculateWage(String company, int wagePerHr, int fullDayHrs, int partTimeHrs, int maxWorkingHrs, int maxWorkingDays) {
        int totalHrs = 0;
        int totalDays = 0;
        int totalWage = 0;

        System.out.println("Calculating Wage for " + company);

        while (totalHrs < maxWorkingHrs && totalDays < maxWorkingDays) {

            int attendance = (int) Math.floor(Math.random() * 10) % 3;
            totalDays++;

            switch (attendance) {
                case 1:
                    if (totalHrs + fullDayHrs <= maxWorkingHrs) {
                        totalHrs += fullDayHrs;
                        totalWage += fullDayHrs * wagePerHr;
                    }
                    break;
                case 2:
                    if (totalHrs + partTimeHrs <= maxWorkingHrs) {
                        totalHrs += partTimeHrs;
                        totalWage += partTimeHrs * wagePerHr;
                    }
                    break;
                default:
                    break;
            }
        }


        System.out.println("Total Working Days for " + company + ": " + totalDays);
        System.out.println("Total Working Hours for " + company + ": " + totalHrs);
        System.out.println("Total Wage for " + company + ": " + totalWage);
    }


    public static void main(String[] args) {
        // Company 1 details: Company A
        String companyA = "Company A";
        int wagePerHrA = 20;
        int fullDayHrsA = 8;
        int partTimeHrsA = 4;
        int maxWorkingHrsA = 100;
        int maxWorkingDaysA = 20;
        calculateWage(companyA, wagePerHrA, fullDayHrsA, partTimeHrsA, maxWorkingHrsA, maxWorkingDaysA);

        // Company 2 details: Company B
        String companyB = "Company B";
        int wagePerHrB = 25;
        int fullDayHrsB = 9;
        int partTimeHrsB = 5;
        int maxWorkingHrsB = 120;
        int maxWorkingDaysB = 25;
        calculateWage(companyB, wagePerHrB, fullDayHrsB, partTimeHrsB, maxWorkingHrsB, maxWorkingDaysB);

        // Company 3 details: Company C
        String companyC = "Company C";
        int wagePerHrC = 30;
        int fullDayHrsC = 7;
        int partTimeHrsC = 3;
        int maxWorkingHrsC = 90;
        int maxWorkingDaysC = 18;
        calculateWage(companyC, wagePerHrC, fullDayHrsC, partTimeHrsC, maxWorkingHrsC, maxWorkingDaysC);
    }
}
