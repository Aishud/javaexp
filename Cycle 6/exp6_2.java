import java.util.*;
class MinimumBalanceException extends Exception
{
	MinimumBalanceException(String str)
	{
	    super(str);
	}
}
public class exp2
{
	public static void main(String[] args ) throws MinimumBalanceException
	{
		try{
		    int b = 100;
		    if(b<500)
			  throw new MinimumBalanceException("\n LOW BALANCE!!!");
		
		}
		catch(MinimumBalanceException e)
		{
			 System.out.println(e);
			 
			 
		}
	}
}

/*
OUTPUT
MinimumBalanceException: 
 LOW BALANCE!!!
 */
