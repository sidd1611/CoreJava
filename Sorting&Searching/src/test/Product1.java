//Sorting Process on User-Defined Class Objects (UDCO): To perform sorting process on UDCOs
//the class must be implemented from any of the 2 interfaces: i)Comparable ii)Comparator

//Comparable:It is an interface from "java.lang" package.

//Structure: public interface java.lang.Comparable<T> {public abstract int compareTo(T);}

//Sorting Process using Comparable interface is:
//step 1: The User-Defined class must be implemented from "java.lang.Comparable" interface
//step 2: The User-Defined class must be declared with "compareTo()" method, which is an
//        overriding method of Comparable interface. 
//        Note(The compareTo() method must be written with sorting logic)
//step 3: call "sort()" method to perform sorting process

package test;

public class Product1 implements Comparable //step 1
{
	public String pCode, pName;

	public Product1(String pCode, String pName)
	{
		this.pCode = pCode;
		this.pName = pName;
	}
	
	@Override
	public String toString()
	{
		return pCode+"\t"+pName;
	}
	
	@Override
	public int compareTo(Object o)//step 2
	{
		Product1 p = (Product1)o;
		
		int k = pCode.compareTo(p.pCode);
		
		if(k==0)
			return 0;
		else if(k>0)
			return 1;
		else
			return -1;
	}
}