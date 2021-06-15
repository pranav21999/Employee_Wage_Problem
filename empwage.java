class empwage1
{
	public static void main(String args[])

	{
	 System.out.println("Welcome to empwage computation");
	
		int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

        int emphrs = 0;
        int empwage = 0;

        int empcheck = (int) Math.floor(Math.random() * 10) % 3; // generate random no 0 or 1 or 2 

		
		switch (empcheck)
			{
				case 1:  //check for full time
					emphrs=8;
					System.out.println("Employee is present full time");
					break;
				 
				case 2:  //chech for part time
					emphrs=4;
					System.out.println("Employee is present part time");
					break; 
				
				default:
					emphrs=0;
					System.out.println("Employee is absent");	
					break; 
				
					
			}
		
		
				empwage = emphrs * EMP_RATE_PER_HOUR;//calculate empwage 
				System.out.println("Employee Wage : " + empwage);
	}
}
