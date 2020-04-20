//In Real-Time Cloning process can be performed in 2 ways:
//(i) Shallow Cloning Process(in cloning1 package):In this type of Cloning, OuterClass (Employee1
//    class)object are cloned but referred class (Address Class) objects will not be cloned
//(ii)Deep Cloning Process(in this package): In this type of Cloning, OuterClass as well as
//    ReferredClass objects, i.e. all the objects of Application are cloned

//Note: To perform Deep-Cloning process, 
//(i) all the referred classes also must implement java.lang.Cloneable interface 
//(ii)& also referred classes must be declared with user-defined Object-return-type method

package cloning2;

public class Address2 implements Cloneable //cloning in referred class, step (i)
{
	public String hNo;
	
	public Object cloning()//cloning in referred class, step (ii)
	                       //user-defined Object-return-type method  
	{
		Object o = null;
		try
		{
			o = this.clone();
		}
		catch(CloneNotSupportedException cnse)
		{
			cnse.printStackTrace();
		}
		return o;
	}
}