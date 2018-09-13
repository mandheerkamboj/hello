import java.util.Scanner;
class Sub
{
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String str,str1;
		System.out.print("Enter string :");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)==' ')
			{
				count++;
			}
		}
		count=str.length()-count;
		System.out.println("characters :"+count);
	}
}