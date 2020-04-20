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

import java.util.ArrayList;
import java.util.Collections;

public class UDCOSorting_Comparable
{
	public static void main(String[] args)
	{
		ArrayList<Product1> a1 = new ArrayList<Product1>();
		
		a1.add(new Product1("A121", "ABC"));
		a1.add(new Product1("A119", "KB"));
		a1.add(new Product1("A120", "Mouse"));
		
		System.out.println("==List before Sorting==");
		a1.forEach((k)->
		{
			System.out.println(k);
		});
		
		Collections.sort(a1); //step 3 , Merge Sorting Process
		
		System.out.println("==List after Sorting==");
		a1.forEach((k)->
		{
			System.out.println(k);
		});
	}
}