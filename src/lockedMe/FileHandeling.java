package lockedMe;

import java.io.File;
import java.io.IOException;

public class FileHandeling {
	
	public static void addfile(String filename) throws IOException {
		//File dir =new File("dir");
		//dir.mkdir();
		File file = new File("dir",filename);
		if(file.exists())
			System.out.println("The file already exists \n");
			else {
			file.createNewFile();
			System.out.println("The file with the name " + filename + " has been created successfully \n\n");
			}
	}
	
	
	public static void deletefile(String filename) throws IOException {
		File file = new File("dir",filename);
		if(file.exists()) {
			file.delete();
			System.out.println("The file with the name " + filename + " has been deleted successfully \n\n");
		}else
			System.out.println("Incorrect File name \n");	
	}
	
	
	public static void getfile(String filename) throws IOException {
		File file = new File("dir",filename);
		if(file.exists()) 
			System.out.println("File path is: " +file.getPath());	
		else
			System.out.println("Incorrect File name \n");
	}
	
	
	public static void ASCsort(File[] s) {					// Selection Sort Algorithm
		for(int i=0;i<s.length;i++)
		{
			int idx = i;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[idx].compareTo(s[j]) > 0)
				{
					idx = j;
				}
			}
			File t = s[i];
			s[i] = s[idx];
			s[idx] = t;
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
