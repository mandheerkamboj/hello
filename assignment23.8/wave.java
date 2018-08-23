import java.util.Scanner;
import java.util.Arrays;
class Wave
{
	public void Display()
	{
		Scanner sc=new Scanner(System.in);
		int temp;
		int[] arr =new int[10];
		System.out.println("Enter the elements :");
		for (int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Wave : ");
		outer:for(int i=1;i<10;i=i+2)
		{
			System.out.print(arr[i]+" ");
			inner:for(int j=i-1;j<10;j=j+2)
			{
				System.out.print(arr[j]+" ");
				continue outer;
			}
			
		}
	}
	public static void main(String args[])
	{
		Wave wa=new Wave();
		wa.Display();
	}
}