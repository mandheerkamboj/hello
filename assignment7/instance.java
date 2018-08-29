class Parent 
{
	Parent()
	{
		check();
	}
	public void check()
	{
		System.out.println("In instancce block of parent class");
	}	
}
class Child extends Parent
{
	Child()
	{
	super();
	}
	public static void main(String args[])
	{
		new Child();
	}
}