import java.util.Scanner;
class Sort
{

    public static void main(String args[]) 
	{
        int n, tmp;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of elements :");
			n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elements :");
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[i] > arr[j])
                    {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            System.out.print("Ascending Order:");
            for (int i=0;i<=n -1;i++) 
            {
                System.out.print(arr[i] + ",");
            }
        }
    }