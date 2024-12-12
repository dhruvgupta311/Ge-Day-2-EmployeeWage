public class EmployeeWage {

    private String company;
    private int wagePerHr;
    private int fullDayHrs;
    private int partTimeHrs;
    private int maxWorkingHrs;
    private int maxWorkingDays;
    private int totalWage;


    public EmployeeWage(String company, int wagePerHr, int fullDayHrs, int partTimeHrs, int maxWorkingHrs, int maxWorkingDays) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.fullDayHrs = fullDayHrs;
        this.partTimeHrs = partTimeHrs;
        this.maxWorkingHrs = maxWorkingHrs;
        this.maxWorkingDays = maxWorkingDays;
    }


    public void calculateWage() {
        int totalHrs = 0;
        int totalDays = 0;

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


    public int getTotalWage() {
        return totalWage;
    }

    public static void main(String[] args) {

        EmployeeWage companyA = new EmployeeWage("Company A", 20, 8, 4, 100, 20);
        EmployeeWage companyB = new EmployeeWage("Company B", 25, 9, 5, 120, 25);
        EmployeeWage companyC = new EmployeeWage("Company C", 30, 7, 3, 90, 18);

        companyA.calculateWage();
        companyB.calculateWage();
        companyC.calculateWage();

        System.out.println("\nSummary of Total Wages:");
        System.out.println(companyA.company + ": " + companyA.getTotalWage());
        System.out.println(companyB.company + ": " + companyB.getTotalWage());
        System.out.println(companyC.company + ": " + companyC.getTotalWage());
    }
}
