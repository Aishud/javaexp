class exp1a 
{
	public static void main(String[] args)
	{
		try
			{
		     int a = 5/0;		
			}
		catch(ArithmeticException e)
			{
				System.out.println(e);
			}
	}	
}	
/*
OUTPUT
java.lang.ArithmeticException: / by zero
*/
