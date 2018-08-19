import java.util.Scanner;
class Biggest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float x,y,z;
		System.out.println("Enter three numbers :");
		x=sc.nextFloat();
		y=sc.nextFloat();
		z=sc.nextFloat();
		if(x>y && x>z)
			System.out.println("Biggest of three number is :"+x);
		else if (y>x && y>z)
			System.out.println("Biggest of three number is :"+y);
		else if(z>x && z>y)
			System.out.println("Biggest of three number is :"+z);
	}
}
			