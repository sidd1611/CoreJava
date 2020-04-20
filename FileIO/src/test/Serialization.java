//Object State into File Storage:In the process of recording object state onto File Storage, the 
//object state must be available in the form of Stream/Binary Stream/Byte Stream

//Serialization Process: The process of converting object state into BinaryStream/ByteStream is
//known as Serialization. We use "writeObject()" method from "java.io.ObjectOutputStream" class
//to perform Serialization process. [MethodSignature: public final void writeObject(java.lang.Object)
//throws java.io.IOException], [Syntax: ObjectOutputStream oos = new ObjectOutputStream(f); 
//oos.writeObject(ob1);]

//DeSerialization Process: The process of converting BinaryStream into Object State is known as
//DeSerialization. We use "readObject()" method from "java.io.ObjectInputStream" class to perform
//DeSerialization Process [MethodSignature: public final java.lang.Object readObject() throws 
//java.io.IOException, java.lang.ClassNotFoundException], [Syntax: ObjectInputStream ois = new 
//ObjectInputStream(f); Object o = ois.readObject();]

//Note: To perform Serialization & DeSerialization processes, the Class must be implemented from
//"java.io.Serializable" interface and also both class & its members must be declared "final"

package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Serialization
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		try
		{
			TransLog ob1 = new TransLog(Math.random(), 805992367L, 12000, new Date());
			//Path given While FileObject Creation must use \\ instead of \ because this path is
			//provided & checked at compile-time & compiler can'nt differentiate between \ of
			// path & \ of escape sequence (like \t, \n etc).
			File f = new File("E:\\Recent\\ObjectStore.txt");//Path upto "E:\Recent\" must exist
			                         //If ObjectStore.txt not exists then would be created
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob1);//Serialization Process
			System.out.println("Object Stored Successfully.........");
			System.out.println("Following Details were stored:");
			System.out.println(ob1);
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
