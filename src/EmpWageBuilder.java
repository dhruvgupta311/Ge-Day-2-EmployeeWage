import java.util.ArrayList;

class EmpWageBuilder implements IEmployeeWage {
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
            totalDays++;

            switch (attendance) {
                case 1:
                    if (totalHrs + company.getFullDayHrs() <= company.getMaxWorkingHrs()) {
                        totalHrs += company.getFullDayHrs();
                        totalWage += company.getFullDayHrs() * company.getWagePerHr();
                    }
                    break;
                case 2:
                    if (totalHrs + company.getPartTimeHrs() <= company.getMaxWorkingHrs()) {
                        totalHrs += company.getPartTimeHrs();
                        totalWage += company.getPartTimeHrs() * company.getWagePerHr();
                    }
                    break;
                default:
                    break;
            }
        }

        return totalWage;
    }
}
