package test;
//Sorting Process on User-Defined Class Objects (UDCO): To perform sorting process on UDCOs
//the class must be implemented from any of the 2 interfaces: i)Comparable ii)Comparator

//Comparator:It is an interface from "java.lang" package. 

//Structure: public interface java.util.Comparator<T> {public abstract int compare(T,T);}

//Sorting Process using Comparator interface is:
//step 1: The User-Defined class must be implemented from "java.lang.Comparator" interface
//step 2: The User-Defined class must be declared with "compare()" method, which is an
//      overriding method of Comparator interface.
//      Note(The compare() method must be written with sorting logic)
//step 3: call "sort()" method to perform sorting process

import java.util.Comparator;

public class CodeComparator implements Comparator //step 1
{
	@Override
	public int compare(Object o1, Object o2)
	{
		Product2 p21 = (Product2)o1;
		Product2 p22 = (Product2)o2;
		
		int k = p21.pCode.compareTo(p22.pCode); //step 2
		if(k==0)
			return 0;
		else if(k>0)
			return 1;
		else
			return -1;
	}
}