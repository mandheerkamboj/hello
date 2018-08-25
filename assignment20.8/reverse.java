import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int x,temp,rem,rev=0;
		System.out.print("Enter the number:");
		x=sc.nextInt();
		temp=x;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of number is : "+rev);
	}
}