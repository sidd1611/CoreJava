//Object State into File Storage:In the process of recording object state onto File Storage, the 
//object state must be available in the form of Stream/Binary Stream/Byte Stream

//Serialization Process:It is the process of converting object state into BinaryStream/ByteStream

//DeSerialization Process:It is the process of converting BinaryStream into Object State

//Note: To perform Serialization & DeSerialization processes, the Class must be implemented from
//"java.io.Serializable" interface and also both class & its members must be declared "final"

//"transient" keyword:This keyword is used to restrict the components from Serialization Process
//The components which are declared with "transient" keyword are restricted from Serialization
//process

//though we cannot understands the content stored in file by just opening it but we can understand
//the serialized content by printing these contents after de-serializing them and can check that
//"transient" components of serialized object have default values assigned to them not the values
//given at the time of serialization

package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization2
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("E:\\Recent\\ObjectStore.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			TransLog2 ob4 = (TransLog2)ois.readObject();//DeSerialization
			System.out.println("===Displaying Log Details===\n");
			System.out.println(ob4);
			ois.close();
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
