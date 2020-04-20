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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("E:\\Recent\\ObjectStore.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			TransLog ob2 = (TransLog)ois.readObject();//DeSerialization
			System.out.println("===Displaying Log Details===\n");
			System.out.println(ob2);
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
