//Define "File" class: File class is from "java.io" package & which is used to find the properties
//of the file like file length, file exists or not, file path, file readable or not, file's parent
//folder, etc. [syntax: File f = new File("filePath&FileName");

//length() method of java.io.File class is used in cases like, checking size of file while uploading it
//on the Website to restrict its size to a certain limit 

package test;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class DFile2
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the file name along with file path (absolute path): ");
			File f = new File(dis.readLine());
			if(f.exists())
			{
				System.out.println("FileExists? status: "+f.exists());
				System.out.println("File Path: "+f.getAbsolutePath());
				System.out.println("File Length: "+f.length());
				System.out.println("File Name: "+f.getName());
				System.out.println("File last modified: "+f.lastModified());
				System.out.println("File's parent: "+f.getParent());
				System.out.println("Can Execute?: "+f.canExecute());
				System.out.println("Can Read?: "+f.canRead());
				System.out.println("Can Write?: "+f.canWrite());
				System.out.println("Is Absolute?: "+f.isAbsolute());
				System.out.println("Is Directory?: "+f.isDirectory());
				System.out.println("Is File: "+f.isFile());
				System.out.println("Is Hidden?: "+f.isHidden());
			}
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
