import java.util.Scanner;
class GenericSort <T extends Comparable>
{	
	private T arr[];

	void setArr(T arr[])
	{
		this.arr = arr;
	}

	void sortArray()
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

	void display()
	{
		System.out.println("\nThe array:-");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

 class Sort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int choice;
		
		GenericSort obj = new GenericSort();
		System.out.println("Enter 1 for Integer.");
		System.out.println("Enter 2 for Double.");
		System.out.println("Enter 3 for Character.");
		System.out.println("Enter 4 for String.");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
					System.out.println(" Integer array created.");
					System.out.println("\n enter the elements :-");
					Integer ints[] = new Integer[size];
					for(int i=0;i<size;i++)
					{
						ints[i] = sc.nextInt();
					}
					
					obj.setArr(ints);
					break;
			
			case 2:
					System.out.println(" Double array created.");
					System.out.println("\n enter the elements :-");
					Double doubles[] = new Double[size];
					for(int i=0;i<size;i++)
					{
						doubles[i] = sc.nextDouble();
					}
					
					obj.setArr(doubles);
					break;
					
			case 3:
					System.out.println(" Character array created.");
					System.out.println("\n enter the elements :-");
					Character chars[] = new Character[size];
					for(int i=0;i<size;i++)
					{
						chars[i] = sc.next().charAt(0);
					}
					
					obj.setArr(chars);
					break;
					
			case 4:
					System.out.println(" String array created.");
					System.out.println("\n enter the elements :-");
					String strings[] = new String[size];
					for(int i=0;i<size;i++)
					{
						strings[i] = sc.next();
					}
					
					obj.setArr(strings);
					break;
			
			default:
					System.out.println("Invalid option entered.");
		}
		
		obj.display();
		obj.sortArray();
		System.out.println("after sorting :");
		obj.display();

		System.out.println();
	}
}