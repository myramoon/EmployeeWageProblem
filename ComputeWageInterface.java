/* PURPOSE: Refactor to have map storing wage*/

public interface ComputeWageInterface {
	
	public void addCompanyDetails(String company,int empRatePerHour, int maxWorkingDays, int maxMonthlyHours);
	public void computeEmployeeWage();
	
}

