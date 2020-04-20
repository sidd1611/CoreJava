//Stream: The continuous flow of data is known as Stream. Stream in javaLanguage is of 2 types:
//(i) ByteStream:The continuous flow of data in the form of 8-bits is known as byte-stream. It
//          can supports all kind of multi-media data formats like text, audio, video, image etc.
//(ii)Character Stream:The continuous flow of data in the form of 16-bits or 2 bytes is knows as
//                     Character Stream. It supports only text data.

//Following are the classes from the Byte Stream:
//(i)DataInputStream:This class is from java.io package & used to read Byte-Stream into JavaAppln
//					 syntax: DataInputStream dis = new DataInputStream(source);
//(i)DataOutputStream:This class is from java.io package & used to send Byte-Stream out of JavaAppln
//	                  syntax: DataOutputStream dos = new DataOutputStream(destination);
//(i)FileInputStream:This class is from java.io package and used to find the file & open the 
//                   file to read the ByteStream.
//					 syntax: FileInputStream fis = new FileInputStream(FileName&FilePath);
//(i)FileOutputStream:This class is from java.io package and used to create file & write/record
//					  Byte-Stream into it
//					 syntax: FileOutputStream fos = new DataInputStream(source);

//File Storage:The smallest permanent storage of Computer System, which is controlled & managed
//             by Operating System is known as File Storage (note: In the process of establishing
//             communication between JavaProgram & FileStorage, the JavaProgram must be constructed 
//             using classes & interfaces available from "java.io" package

//Input Stream: It is the continuous flow of data into a JavaApplication
//Output Stream: It is the continuous flow of data out of a JavaApplication

package test;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DFile1
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			
			System.out.println("Enter the source file-path along with file-name to be read:");
			File fsrc = new File(dis.readLine());
			FileInputStream fis = new FileInputStream(fsrc);
			
			System.out.println("Enter the destination file-path along with file-name:");
			File fdest = new File(dis.readLine());
			FileOutputStream fos = new FileOutputStream(fdest);
			
			int k;
			while((k=fis.read())!=-1)//in java-language, -1 represents EOF (End of File)
			{
				fos.write(k);
			}//end of loop
			fos.close();
			fis.close();
			System.out.println("File Copied successfully...........");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
		
}
