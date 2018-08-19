import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
 {
  int x,y,temp,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number:");
  x=sc.nextInt();
  temp=x;
  while(x>0)
  {
    y=x%10;
	sum=sum*10+y;
	x=x/10;
  }
  if(temp==sum)
  {
   System.out.println(temp+" is a palindrome number");
  }
  else
  {
   System.out.println("No it is not a palindrome number");
  }
 }
}