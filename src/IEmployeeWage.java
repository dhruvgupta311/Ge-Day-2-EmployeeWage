import java.util.ArrayList;

interface IEmployeeWage {
    void addCompany(String company, int wagePerHr, int fullDayHrs, int partTimeHrs, int maxWorkingHrs, int maxWorkingDays);
    void calculateWages();
}
