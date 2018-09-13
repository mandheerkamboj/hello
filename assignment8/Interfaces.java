interface Animal
{
	void speak(String sp);
	void eat(String ea);
}
class Dog implements Animal
{
	public void speak(String s)
	{
	System.out.println("Dog lang: "+s);
	}
	public void eat(String e)
	{
	System.out.println("Dogs food: "+e);
	}
}
class Cat implements Animal
{
	public void speak(String s)
	{
	System.out.println("Cat lang: "+s);
	}
	public void eat(String e)
	{
	System.out.println("Cat food: "+e);
	}
}
class InterfaceDemo
{
	public static void main(String args[])
	{
	Dog dog=new Dog();
	dog.speak("bhow-bhow");
	dog.eat("pedigree");
	Cat cat=new Cat();
	cat.speak("meow-meow");
	cat.eat("Fish");
	}
}