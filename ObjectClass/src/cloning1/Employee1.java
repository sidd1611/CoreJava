//java.lang.Object class: It is the parent class of all the classes declared within the javaApp
//Method of Object class are: hashCode(), toString(), clone(), equals(), wait(), notify(), 
//notifyAll(), finalized() and getClass()

//hasdCode():The unique numeric number, generated while object creation is known as hashCode. 

//toString():This method is used to display the data from the object

//clone():The process of creating the duplicate copy of an object is known as "Cloning Process"
//This method is protected & throws CloneNotSupportedException. Steps for Cloning Process are:
//Step1:The user-defined class must be implemented from "java.lang.Cloneable" interface
//Step2:The user-defined class must be declared with [user-defined "Object return-type"] method
//Step3:This [user-defined "Object return-type"] method will call clone() method for Cloning Process
//Step4:To start Cloning Process, call [user-defined "Object return-type"] method

//In Real-Time, Cloning process can be performed in 2 ways:
//(i) Shallow Cloning Process(in this package):In this type of Cloning, OuterClass (Employee1
//    class)object are cloned but referred class (Address Class) objects will not be cloned
//(ii)Deep Cloning Process(in cloning2 package): In this type of Cloning, OuterClass as well as
//    ReferredClass objects, i.e. all the objects of Application are cloned

package cloning1;

public class Employee1 extends Object implements Cloneable //"extends Object" is optional
{
	public String empId, empName;
	public Address1 add = new Address1();
	
	public Employee1(String empId, String empName, String hNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.add.hNo = hNo;
	}
	
	@Override
	public String toString()
	{
		return "EmpId: "+empId+"\nEmpName: "+empName+"\nHouseNo. "+add.hNo;
	}
	
	public Object cloning() //Step2, declaring a user-defined "Object return-type" method
	{
		Object o = null; //all local variables must be initialized
		try
		{
			o = this.clone(); //step3
		}
		catch(CloneNotSupportedException cnse)
		{
			cnse.printStackTrace();
		}
		return o; 
	}
}
