//clone():The process of creating the duplicate copy of an object is known as "Cloning Process"
//This method is protected & throws CloneNotSupportedException. Steps for Cloning Process are:
//Step1:The user-defined class must be implemented from "java.lang.Cloneable" interface
//Step2:The user-defined class must be declared with [user-defined "Object return-type"] method
//Step3:This [user-defined "Object return-type"] method will call clone() method for Cloning Process
//Step4:To start Cloning Process, call [user-defined "Object return-type"] method

//In Real-Time Cloning process can be performed in 2 ways:
//(i) Shallow Cloning Process(in cloning1 package):In this type of Cloning, OuterClass (Employee1
//    class)object are cloned but referred class (Address Class) objects will not be cloned
//(ii)Deep Cloning Process(in this package): In this type of Cloning, OuterClass as well as
//    ReferredClass objects, i.e. all the objects of Application are cloned

//Note: To perform Deep-Cloning process, 
//(i) all the referred classes also must implement java.lang.Cloneable interface 
//(ii)& also referred classes must be declared with user-defined Object-return-type method

package cloning2;

public class Employee2 implements Cloneable //OuterClass
{
	public String empId, empName;
	public Address2 add = new Address2();
	
	public Employee2(String empId, String empName, String hNo) {
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
		Employee2 emp = null;//(all local variables must be initialized), referred objects has 
		               //to be cloned also, so instead of "Object", Employee2 reference is used
		               //otherwise "referred" objects couldn't be accessed
		try
		{
			emp = (Employee2)this.clone(); //step3
			emp.add = (Address2)emp.add.cloning();
		}
		catch(CloneNotSupportedException cnse)
		{
			cnse.printStackTrace();
		}
		return emp; 
	}
}