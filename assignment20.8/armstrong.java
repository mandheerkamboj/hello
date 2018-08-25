import java.util.Scanner;
import java.lang.Math;
class Armstrong 
{
    public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        int num, number, temp,n=0; 
		double sum = 0;
		System.out.print("Enter the number :");
		num=sc.nextInt();
        number = num;
		 while (number != 0)//to find digits of number 
		{
        number =number/ 10;
        ++n;
		}
		//System.out.println(n);
		number = num;
        while (number != 0)
        {
            temp = number % 10;
            sum = sum + (Math.pow(temp,n));
            number =number/ 10;
        }

        if(sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
		
    }
}