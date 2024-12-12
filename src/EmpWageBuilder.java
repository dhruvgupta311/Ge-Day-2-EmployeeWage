import java.util.ArrayList;

public class EmpWageBuilder implements IEmployeeWage {
    private ArrayList<CompanyEmpWage> companies;

    public EmpWageBuilder() {
        companies = new ArrayList<>();
    }

    @Override
    public void addCompany(String company, int wagePerHr, int fullDayHrs, int partTimeHrs, int maxWorkingHrs, int maxWorkingDays) {
        companies.add(new CompanyEmpWage(company, wagePerHr, fullDayHrs, partTimeHrs, maxWorkingHrs, maxWorkingDays));
    }

    @Override
    public void calculateWages() {
        for (CompanyEmpWage company : companies) {
            int totalWage = calculateWageForCompany(company);
            company.setTotalWage(totalWage);
            System.out.println(company);
        }
    }

    private int calculateWageForCompany(CompanyEmpWage company) {
        int totalHrs = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHrs < company.getMaxWorkingHrs() && totalDays < company.getMaxWorkingDays()) {
            int attendance = (int) Math.floor(Math.random() * 10) % 3;
            int dailyWage = 0;
            totalDays++;

            switch (attendance) {
                case 1:
                    if (totalHrs + company.getFullDayHrs() <= company.getMaxWorkingHrs()) {
                        totalHrs += company.getFullDayHrs();
                        dailyWage = company.getFullDayHrs() * company.getWagePerHr();
                    }
                    break;
                case 2:
                    if (totalHrs + company.getPartTimeHrs() <= company.getMaxWorkingHrs()) {
                        totalHrs += company.getPartTimeHrs();
                        dailyWage = company.getPartTimeHrs() * company.getWagePerHr();
                    }
                    break;
                default:
                    break;
            }
            totalWage += dailyWage;
            company.addDailyWage(dailyWage);
        }

        return totalWage;
    }

    @Override
    public int getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage company : companies) {
            if (company.getCompany().equals(companyName)) {
                return company.getTotalWage();
            }
        }
        return -1; // If company is not found
    }
}
