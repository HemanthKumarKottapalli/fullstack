class ConditionaloperDemo 
{
	public static void main(String[] args) 
	{
		int x=10;
		x+s=(++x) + (++x) + (x++) + (++x); //11+12+12+14+10+59  x+=x+10
		System.out.println(x);
	}
}
