import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int x,i,count=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number:");
  x=sc.nextInt();
  for(i=2;i<x;i++)
  {
   if(x%i==0)
   {
    count=count+1;
   }
  }
  if(count>0)
  {
   System.out.println("it is not prime");
  }
  else if(count ==0)
   {
   System.out.println("it is prime");
   }
  
 }
}