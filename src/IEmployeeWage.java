public interface IEmployeeWage {
    void addCompany(String company, int wagePerHr, int fullDayHrs, int partTimeHrs, int maxWorkingHrs, int maxWorkingDays);
    void calculateWages();
    int getTotalWageByCompany(String companyName); // Method to get total wage by company
}
