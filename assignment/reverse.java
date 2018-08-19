import java.util.Scanner;
class Reverse
{
 public static void main(String args[])
 {
  int x,temp=0,y;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number to reverse:");
  x=sc.nextInt();
  while(x>0)
  {
   y=x%10;
   temp=temp*10+y;
   x=x/10;
  }
  System.out.println("the reversed number is "+temp);
 }
}