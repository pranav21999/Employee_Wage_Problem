package employeewage;

import java.util.*;

public class EmployeeWageBuilder implements EmpWageInterface {
	// declaring static variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;


	private ArrayList<CompanyEmpWage> companyEmpArrayList;
	

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
		companyEmpArrayList = new ArrayList<CompanyEmpWage>();
	}
	
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

		CompanyEmpWage companyEmpWage= new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		companyEmpArrayList.add(companyEmpWage);
	}
	
	
	public void computeEmpWage() {
		for (int i = 0; i < companyEmpArrayList.size(); i++) {
			CompanyEmpWage companyEmpwage = companyEmpArrayList.get(i);			
			companyEmpwage.setTotalEmpWage(this.computeEmpWage(companyEmpwage));
			System.out.println("Company Name: " + companyEmpwage.company);
			System.out.println(companyEmpwage.company + "Total Wage is " + companyEmpwage.totalWage);
		}
	}	
	
 	//method to compute Total employeeWage
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		// variables
		int empHrs, totalEmpHrs = 0, totalWorkingDays = 0, day=0;
		//array to  calculate daily wage
		int daily_wage_array[] = new int[companyEmpWage.numOfWorkingDays];
		
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
			 daily_wage_array[day] = empHrs * companyEmpWage.empRatePerHour;	
			 day++;
			System.out.println("Day#" + totalWorkingDays + "Emp Hr:" + empHrs);
			
		}
		 for (int j = 0; j < companyEmpWage.numOfWorkingDays; j++) {
	             day = j + 1;
	            System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
	           
	        }		
		// calculating total Employee wage for company
		return totalEmpHrs * companyEmpWage.empRatePerHour;

	}

	@Override
	public void computeWage() {
		
	}

}
