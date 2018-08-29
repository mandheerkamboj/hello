class Animal
{
	static String breed, color;
	public void speak()
	{
		System.out.println("this is an animal");
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("this is a dog");
	}
}
class Cat extends Animal
{
	public void speak()
	{
		System.out.println("this is a cat");
	}
}
class Demo
{
	public static void main (String args[])
	{
		Animal ob= new Dog();
		ob.speak();
		Animal obj=new Cat();
		obj.speak();
	}
}