import java.util.*;
@SuppressWarnings("unchecked")
class Keyvalue
{
	public static void main(String args[])
	{
		HashMap h=new HashMap();
		h.put("Mandheer",512);
		h.put("Anmol",501);
		h.put("Shubham",509);
		h.put("Akash",1426);
		Iterator it=h.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.print(mp.getKey()+" : ");
			System.out.println(mp.getValue());
		}
	}
}