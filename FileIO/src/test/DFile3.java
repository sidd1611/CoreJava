//Character Stream: Continuous flow of data in the form of 16-bits is known as Character Stream
//Character Stream supports text data only & is not preferable for Audio, Video, Image & Animation

//Classes related to Character Stream from java.io package:
//i)BufferedReader:This class is from java.io package & used to read CharacterStream into
// JavaAppln   syntax: BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//(ii)FileReader:This class is from java.io package & used to find the file & open it to read 
//Character Stream into JavaAppln.//syntax: FileReader fr = new FileReader("filePath&FileName");
//(iii)FileWriter:This class is from java.io package & used to create the file & open the file
//to write Character Stream in it.//syntax: FileWriter fw = new FileWriter("filePath&fileName");


package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DFile3
{
	public static void main(String[] args) {
		try
		{
			//br will read data from run-time
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//fw will write in given file with path & name given in File Object
			File f = new File("E:\\Recent\\Text.txt");
			FileWriter fw = new FileWriter(f);
			//Writing data into the file
			char ch1;
			System.out.println("Enter the data:(enter @ at the end)");
			while((ch1=(char)br.read())!='@')//read() will read character value, return ASCII 
				                             //value, so typecasting is required
			{
				fw.write(ch1);
			}
			fw.close();
			System.out.println("===Displaying data from File===");
			//fr will read from the same file used for writing
			FileReader fr = new FileReader(f);
			//Reading data from file
			int ch2;
			while((ch2=fr.read())!=-1)//read() method reads character & returns ASCII value
				                     //In case of Files in Java, -1 shows EOF (End of File)
			{
				System.out.print((char)ch2);//typecasting is required to convert ASCII to char
				  //print instead of println is used otherwise one char per line will be printed
			}//end of loop
			fr.close();
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