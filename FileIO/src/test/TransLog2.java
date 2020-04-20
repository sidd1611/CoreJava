//Serialization Process:It is the process of converting object state into BinaryStream/ByteStream

//DeSerialization Process:It is the process of converting BinaryStream into Object State

//"transient" keyword:This keyword is used to restrict the components from Serialization Process
//The components which are declared with "transient" keyword are restricted from Serialization
//process

//though we cannot understands the content stored in file by just opening it but we can understand
//the serialized content by printing these contents after de-serializing them and can check that
//"transient" components of serialized object have default values assigned to them not the values
//given at the time of serialization

package test;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public final class TransLog2 implements Serializable //as class is final, it means this class is
                   //Immutable. Immutable class generates Immutable objects, i.e. objects once 
                   //created cannot be modified
{
	
	private final double tId;
	private final long bAccNo;
	private final transient int amt; //this variable's value will not be stored or serialized
	private final Date d;
	
	public TransLog2(double tId, long bAccNo, int amt, Date d)
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