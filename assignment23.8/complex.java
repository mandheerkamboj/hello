import java.util.Scanner;
class Complex
{
	static int real,imag;
	public void Display(int real,int imag)
	{
		System.out.println("OUTPUT : "+real+"+"+imag+"i");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Complex c=new Complex();
		System.out.print("Enter the real part : ");
		real=sc.nextInt();
		System.out.print("Enter the imaginary part : ");
		imag=sc.nextInt();
		c.Display(real,imag);
	}
}