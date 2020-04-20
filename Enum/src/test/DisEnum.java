//Enum<E>: It is an abstract class from "java.lang" package, which is implemented from 
//"Comparable" and "Serializable" interfaces

//We use "enum" keyword to declare Enum<E>
//Enum<E> is a collection of elements, variables, constructors & methods. It is used when we
//want to have a collection of similar data and it is preferable to use when we have defined/
//fixed list of elements like week-days, Months in a years, Gender etc.

//We use values() method to read the data from the Enum<E> object

package test;

public class DisEnum {

	public static void main(String[] args)
	{
		System.out.println("==Displaying from Enum<E> object==");
		
		for(Cars k : Cars.values())
		{
			System.out.println(k+" Costs "+k.getPrice()+" thousand Dollars....");
		}//end of loop
	}

}
