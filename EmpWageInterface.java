package employeewage;

public interface EmpWageInterface {

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
	public void computeWage();
}
