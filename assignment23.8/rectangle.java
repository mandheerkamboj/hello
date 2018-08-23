import java.util.Scanner;;
class Rectangle
{
	public float CalculateArea()
	{
		float len,bre,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input length and breadth:");
		len=sc.nextFloat();
		bre=sc.nextFloat();
		area=len*bre;
		return area;
	}
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		System.out.println("Area of rectangle is "+r.CalculateArea());
	}
}