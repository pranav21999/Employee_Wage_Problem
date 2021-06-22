public class EmpWage {
	// Instance variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int wagePerHour;
	private final int workingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	// Constructor
	public EmpWage(String company, int wagePerHour, int workingDays, int maxHoursPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	// Calculating working hours and total wage
	public void computeWage() {
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < workingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			// System.out.println("Day : " + totalWorkingDays + " Emp Hr : " + empHrs);
		}
		totalEmpWage = totalEmpHrs * wagePerHour;
		System.out.println ("Total Emp Wage for company " + company + " is " + totalEmpWage);
	
	}

	

	

	public static void main(String[] args) {

		EmpWage  WIPRO= new EmpWage("WIPRO", 20, 20, 100);
		EmpWage  TCS= new EmpWage("TCS", 10, 40, 200);
		WIPRO.computeWage(); // Compute for dMart
		//System.out.println(WIPRO);
		TCS.computeWage(); // Compute for reliance
		//System.out.println(TCS);
	}
}