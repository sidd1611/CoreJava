//Enum<E>: It is an abstract class from "java.lang" package, which is implemented from 
//"Comparable" and "Serializable" interfaces

//We use "enum" keyword to declare Enum<E>
//Enum<E> is a collection of elements, variables, constructors & methods. It is used when we
//want to have a collection of similar data and it is preferable to use when we have defined/
//fixed list of elements like week-days, Months in a years, Gender etc.

//We use values() method to read the data from the Enum<E> object

package test;

public enum Cars
{
	Figo(600), Alto(200), Dezire(400);
	
	public int price;
	
	//Cars(int price)                    //Enum<E> constructor without using "private" keyword
	private Cars(int price)//Constructors declared within an Enum<E> are automatically private
	{              //even if "private" keyword is  not used.If any other keyword like "public"
		this.price = price;        //or "protected" is used then Compiler-error will be raised
	}
	
	public int getPrice()
	{
		return price;
	}
	
}
