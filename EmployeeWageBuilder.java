package employeewage;

public class EmployeeWageBuilder implements EmpWageInterface {
	// declaring static variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	

	//main method
	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wage calculation");
		EmployeeWageBuilder empwage = new EmployeeWageBuilder();
		empwage.addCompanyEmpWage(" Dmart ", 20, 2, 10);//passing arguments to the method
		System.out.println("\n");
		
		empwage.addCompanyEmpWage(" Reliance ", 5, 25, 25);////passing arguments to the method
		empwage.computeEmpWage();
	}

   //constructor
	public EmployeeWageBuilder() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		numOfCompany++;
	}
	//method to pass the values of no of companies in Array
 	public void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

 	//method to compute Total employeeWage
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		// variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {

			totalWorkingDays++;
			//Random function to check Employee is present(partTime or fullTime) or absent
			int empCheck = (int) (Math.random() * 10) % 3;
			// using switch statement to check the employee working time
			switch (empCheck) {

			case IS_FULL_TIME:
				empHrs = 8;
				System.out.println("Employee is present as Full time");
				break;
			case IS_PART_TIME:

				empHrs = 4;
				System.out.println("Employee is working as part time");
				break;
			default:
				empHrs = 0;
				System.out.println("Employee is Absent");
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#" + totalWorkingDays + "Emp Hr:" + empHrs);
			
		}
		// calculating total Employee wage for company
		return totalEmpHrs * companyEmpWage.empRatePerHour;

	}

	@Override
	public void computeWage() {
		
	}

}