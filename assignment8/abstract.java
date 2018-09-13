abstract class Animal
{
	String color;
	String breed;
	String name;
	abstract void eat(String e);
	public void speak(String s)
	{	}
}
class Dog extends Animal
{
	public void disp(String color, String breed, String name)
	{
	super.color=color;
	super.breed=breed;
	super.name=name;
	System.out.println("Animal: Dog \nColor: "+color+"\nBreed: "+breed+"\nName: "+name);
	}
	public void eat(String food)
	{
	System.out.println("Food : "+food);
	}
	public void speak(String s)
	{
	System.out.println("Speak : "+s);
	}
}
class AnimalDemo
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.disp("black","german","tysen");
		d.speak("bhow-bhow");
		Animal a=new Dog();
		a.eat("pedigree");
	}
}