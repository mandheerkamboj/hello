import java.util.Scanner;
class Even
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the number :");
		n=sc.nextInt();
		System.out.println("Even numbers upto "+n+" are: ");
		for(int i=1;i<=n;i++)
		{
			if (i%2==0)
			{
			 System.out.println(i);
			}
		}			
	}
}