class Print 
{
	public void print()
	{
		System.out.println("Null print function");
	}
	public void print(int x)
	{
		x=x+5;
		System.out.println("integer value:"+x);
	}
	public void print(float y)
	{
		y=y+5;
		System.out.println("float value:"+y);
	}
	public static void main(String args[])
	{
		Print ob=new Print();
		ob.print();				// Null
		ob.print(10);			//Int 
		ob.print(10.5f);			//float
	}
}