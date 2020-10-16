/* PURPOSE: Adds part time employee and wage */
public class EmployeeWageBuilder {
	
	//CONSTANTS
	static final int IS_FULL_TIME=2;
	static final int IS_PART_TIME=1;  
	static final int EMP_RATE_PER_HOUR=20;

	public static void main(String[] args) {
	
		//VARIABLES
		int workHours;
		int employeeWage;
		int attendanceStatus=(int) Math.floor(Math.random() * 10) % 3;  //Check attendance 

		if (attendanceStatus == IS_FULL_TIME)		               
			workHours = 8;
		else if (attendanceStatus == IS_PART_TIME)
			workHours = 4;
		else
			workHours = 0;
		
		employeeWage = workHours * EMP_RATE_PER_HOUR; 			//Wage calculation
		System.out.println("Employee wage for the day is : " + employeeWage);
	}

}

