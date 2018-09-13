import java.util.Scanner;
class Vowels
{
	public static void main(String args[])
	{
		String str,vow="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		str=sc.nextLine();
		vow=str.replaceAll("[aeiouAEIOU]","");

		System.out.println(vow);
	}
}