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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Serialization2
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		try
		{
			TransLog2 ob3 = new TransLog2(Math.random(), 805992367L, 12000, new Date());
			//Path given While FileObject Creation must use \\ instead of \ because this path is
			//provided & checked at compile-time & compiler can'nt differentiate between \ of
			// path & \ of escape sequence (like \t, \n etc).
			File f = new File("E:\\Recent\\ObjectStore.txt");//Path upto "E:\Recent\" must exist
			                         //If ObjectStore.txt not exists then would be created
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob3);//Serialization Process
			System.out.println("Object Stored Successfully.........");
			System.out.println("Following Details were stored:");
			System.out.println(ob3);
			oos.close();
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

