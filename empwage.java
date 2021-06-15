class empwage
{
	public static void main(String args[])

	{
	 System.out.println("Welcome to empwage computation");
	
		int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

        int empHrs = 0;
        int empwage = 0;

        double empcheck = Math.floor(Math.random() * 10) % 3; // generate random no 0 or 1 or 2 

        if (empcheck == IS_FULL_TIME)//comdition to check full time
		{
                empHrs = 8;
				System.out.println("Employee is present full time");
	    }
		else if (empcheck == IS_PART_TIME)//comdition to check part time
		{
			
                empHrs = 4;
				System.out.println("Employee is present part time");
	    }
		else
		{	
				System.out.println("Employee is absent");
                empHrs = 0;
		}
				empwage = empHrs * EMP_RATE_PER_HOUR;//calculate empwage 
				System.out.println("Employee Wage : " + empwage);
	}
}
