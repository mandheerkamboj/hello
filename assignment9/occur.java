import java.util.Scanner;
class Occurrence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str = sc.nextLine();
		System.out.println("enter the string to be checked: ");
		String str2 = sc.nextLine();
		int x = 0;
		int count = 0;
		while(x != -1)
		{
		    x = str.indexOf(str2,x);
		    if(x != -1)
		    {
		        count ++;
		        x += str2.length();
		    }
		}
		System.out.println(str2+" appears "+count+" times");
	}
}