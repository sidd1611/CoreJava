//Sorting Process on User-Defined Class Objects (UDCO): To perform sorting process on UDCOs
//the class must be implemented from any of the 2 interfaces: i)Comparable ii)Comparator

//Comparator:It is an interface from "java.lang" package. 

//Structure: public interface java.util.Comparator<T> {public abstract int compare(T,T);}

//Sorting Process using Comparator interface is:
//step 1: The User-Defined class must be implemented from "java.lang.Comparator" interface
//step 2: The User-Defined class must be declared with "compare()" method, which is an
//        overriding method of Comparator interface.
//        Note(The compare() method must be written with sorting logic)
//step 3: call "sort()" method to perform sorting process

package test;

public class Product2
{
	public String pCode, pName;

	public Product2(String pCode, String pName)
	{
		this.pCode = pCode;
		this.pName = pName;
	}
	
	@Override
	public String toString()
	{
		return pCode+"\t"+pName;
	}
	
}