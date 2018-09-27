import java.io.*;
class ReadWrite
{
    public static void main(String args[])
	{
		try (FileReader fr=new FileReader("abc.txt");
          FileWriter fw=new FileWriter("xyz.txt"))
		{
			int c=fr.read();
			while(c!=-1) 
			{
				fw.write(c);
				c=fr.read();
			}
		}  
	  catch(IOException e)
	  {
          System.out.println(e);
      } 
	  try(FileReader f=new FileReader("xyz.txt"))
		{
			int x=f.read();
			while(x!=-1)
			{
				System.out.print((char)x);
				x=f.read();
			}
		}
	catch(IOException e)
		{
          System.out.println(e);
		} 		
    }
}