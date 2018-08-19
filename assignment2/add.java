import java.util.Scanner;
class Add
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	double x,y,z;
	System.out.println("Enter any two numbers :");
	x=sc.nextDouble();
	y=sc.nextDouble();
	z=x+y;
	System.out.println("Sum of numbers is: "+z);
}
}