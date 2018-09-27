import java.util.*;
class RetainElements
{
	public static void main(String args[])
	{
		HashSet<String> se=new HashSet<String>();
		se.add("this");
		se.add("is");
		se.add("a");
		se.add("test");
		HashSet<String> s=new HashSet<String>();
		s.add("this");
		s.add("is");
		s.add("an");
		s.add("apple");
		se.retainAll(s);
		System.out.print(se);
	}
}