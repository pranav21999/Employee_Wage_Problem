class empwage
{
	public static void main(String args[])

	{
	 System.out.println("Welcome to empwage computation");
	
		int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        int empHrs = 0;
        int empwage = 0;

        double empcheck = Math.floor(Math.random() * 10) % 2; // generate random no 0 or 1 

        if (empcheck == IS_FULL_TIME) // condition to check emp is present or not
                empHrs = 8;
        else
                empHrs = 0;
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage : " + empwage);
	}
}
