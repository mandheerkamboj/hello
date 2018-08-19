import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter year you want to check:");
		year=sc.nextInt();
		if (year % 4 == 0)
		{
        if (year % 100 == 0)
			{
            if (year % 400 == 0)
                System.out.println("it is a leap year.");
            else
                System.out.println( "it is not a leap year.");
        }
        else
            System.out.println("it is a leap year.");
		}
		else
			System.out.println("it is not a leap year.");
	}
}
	