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

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public final class TransLog implements Serializable //as class is final, it means this class is
                   //Immutable. Immutable class generates Immutable objects, i.e. objects once 
                   //created cannot be modified
{
	
	private final double tId;
	private final long bAccNo;
	private final int amt;
	private final Date d;
	
	public TransLog (double tId, long bAccNo, int amt, Date d)
	{
		this.tId = tId;
		this.bAccNo = bAccNo;
		this.amt = amt;
		this.d = d;
	}
	
	@Override
	public final String toString()
	{
		return "tId: "+tId+"\nbAccNo: "+bAccNo+"\namt: "+amt+"\nDate & Time: "+d;
	}
	
}