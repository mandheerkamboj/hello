import java.util.Scanner;
import java.util.Arrays;
class Arr
{
	public void lar()
	{
		Scanner sc=new Scanner(System.in);
		int temp;
		int[] arr =new int[10];
		System.out.println("Enter the elements :");
		for (int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		 for (int i=0;i<10;i++) //sort
        {
            for (int j=i+1;j<10;j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		System.out.println("Second laargest element is : "+arr[10-2]);
	}
	public static void main(String args[])
	{
		Arr a=new Arr();
		a.lar();
	}
} 