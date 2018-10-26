import java.util.Scanner;

public class DynamicArr{
	 int initialcapacity=10;
	int i=0;
	int arr[]=new int[initialcapacity];
	public void add(int item){
		if(i<arr.length){
			arr[i]=item;
			i++;
		}
		else{
			int newSize=(int)(initialcapacity*1.5f);
			int arr1[]=new int[newSize];
			for(int i=0;i<arr.length;i++){
				arr1[i]=arr[i];
			}
			arr1[i]=item;;
			i++;
			arr=arr1;
			
		}
	}
	public void display(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
		public static void main(String args[]){
			System.out.println("enter the no. of elements u want to enter");
			Scanner sc=new Scanner(System.in);
			DynamicArr obj=new DynamicArr();
			int n=sc.nextInt();
			System.out.println("enter the element:");
			for(int i=0;i<n;i++){
			
				int a=sc.nextInt();
				obj.add(a);
			}
			obj.display();
			
		}
	}