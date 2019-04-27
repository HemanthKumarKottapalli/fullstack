class TryCatchDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hello..welcome to try block");
			System.out.println(10/2);
			System.out.println("Try block executed");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Denominator doesn't given as zero");
		}
		finally
		{
		System.out.println("Thank you");
		}
	}
}
