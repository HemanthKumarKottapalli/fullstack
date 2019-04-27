class AdditionVarArgMethod 
{
	public  void sum()
	{
	sum(a);
	sum(a,b);
	}
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[0]);
	
		System.out.println("Addition is:" +(a+b));
	}
}
