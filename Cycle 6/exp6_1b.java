class experiment1b
{
	public static void main(String[] args)
	{
		try
		{
			
			int a[] = {1,2,3};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
/*
OUTPUT
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
*/
