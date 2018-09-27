import java.io.*;
class PathFile {
	public static void main(String args[]) {
		try {
				FileWriter fw=new FileWriter("abc.txt");
				String str="C:/Users/Test/video.mp$";
				fw.write(str);
				fw.close();
				System.out.println("Done");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		File f=new File("new.txt");
		System.out.println("File Absolutepath: "+f.getAbsolutePath());
	}
}