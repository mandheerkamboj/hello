import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		char c;
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		str=sc.nextLine();
		System.out.println("Reverse of string is :");
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
}