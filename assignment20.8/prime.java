import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int x;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number:");
  x=sc.nextInt();
  System.out.println("Prime numbers upto "+x+" are :");
  for(int i=2;i<=x;i++)
	{ 
		int count=0;
		for(int j=2;j<i;j++) 
		{
			if(i%j==0)
			{
				count=1;
				break;
			}
		}
		if (count ==0)
			{
				System.out.println(i);
			}
	}	
 }
}