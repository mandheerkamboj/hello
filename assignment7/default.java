class Parent 
{
	static int x;
	Parent()
	{
		System.out.println("In default constructor of parent class");
	}
	Parent(int x)
	{
		this();
		this.x=x;
	}	
	public static void main (String args[])
	{
		int x=5;
		new Parent(x);
	}
}