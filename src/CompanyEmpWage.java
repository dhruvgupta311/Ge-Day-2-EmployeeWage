public class CompanyEmpWage {
    private String company;
    private int wagePerHr;
    private int fullDayHrs;
    private int partTimeHrs;
    private int maxWorkingHrs;
    private int maxWorkingDays;
    private int totalWage;

    public CompanyEmpWage(String company, int wagePerHr, int fullDayHrs, int partTimeHrs, int maxWorkingHrs, int maxWorkingDays) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.fullDayHrs = fullDayHrs;
        this.partTimeHrs = partTimeHrs;
        this.maxWorkingHrs = maxWorkingHrs;
        this.maxWorkingDays = maxWorkingDays;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String getCompany() {
        return company;
    }

    public int getWagePerHr() { return wagePerHr; }
    public int getFullDayHrs() { return fullDayHrs; }
    public int getPartTimeHrs() { return partTimeHrs; }
    public int getMaxWorkingHrs() { return maxWorkingHrs; }
    public int getMaxWorkingDays() { return maxWorkingDays; }

    @Override
    public String toString() {
        return "Company: " + company + ", Total Wage: " + totalWage;
    }
}
