//clone():The process of creating the duplicate copy of an object is known as "Cloning Process"
//This method is protected & throws "CloneNotSupportedException". Steps for Cloning Process are:
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

public class DCloning2
{
	public static void main(String[] args)
	{
		//original Object
		Employee2 e21 = new Employee2("A121", "Raj", "12-34/h");
		System.out.println("===Original Object===");
		System.out.println(e21);
		System.out.println("HashCode of e21:"+e21.hashCode());
		System.out.println("HashCode of add of e21: "+e21.add.hashCode());
		
		//cloned outer & referred Objects
		Employee2 e22 = (Employee2)e21.cloning();//step4
		System.out.println("==Cloned Object==");
		System.out.println(e22);
		System.out.println("hashCode of e22: "+e22.hashCode());
		System.out.println("hashCode of add of e22: "+e22.add.hashCode());
	}
}
