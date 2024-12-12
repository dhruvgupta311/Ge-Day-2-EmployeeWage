public class Main {
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompany("Company A", 20, 8, 4, 100, 20);
        empWageBuilder.addCompany("Company B", 25, 9, 5, 120, 25);
        empWageBuilder.addCompany("Company C", 30, 7, 3, 90, 18);

        empWageBuilder.calculateWages();

        String companyName = "Company A";
        int totalWage = empWageBuilder.getTotalWageByCompany(companyName);
        if (totalWage != -1) {
            System.out.println("Total Wage for " + companyName + ": " + totalWage);
        } else {
            System.out.println("Company " + companyName + " not found.");
        }
    }
}
