package com.class21;
public class Employee {
/* Create a Class called Employee:
● Create three variables eID , salary
and set the CEO to “Sumair”
● Create two objects of the class
Employee
● Set the value of eID, salary for each of
the objects
● Print out the eID, salary and CEO for
each of the objects
 */
	int eID;
	int salary;
	static String CEO;

	void printInfo () {
		System.out.println("Employee id: "+eID+ ", salary is:"+salary+" CEO "+CEO);	
	}
	
	void method() {
		printInfo();
	}
	
	public static void main(String[] args) {
		Employee emp1= new Employee();
		
		emp1.printInfo();
		
		emp1.eID=5;
		emp1.salary=80000;
//		emp1.CEO="Sumair";
		Employee.CEO="Sumair";
		
		
		emp1.printInfo();
		
		Employee emp2=new Employee();
		emp2.eID=8;
		emp2.salary=85000;
//		emp2.CEO="Sumair";
		
		emp1.printInfo();
		
		
		
		
		
		
		//with default values
//		Employee emp1=new Employee();
//		emp1.eID=201;
//		emp1.printInfo();
//		
//		Employee emp2=new Employee();
//		emp2.printInfo();
//		
//		System.out.println("Let's change emp2");
//		
//		emp2.eID=3;
//		emp2.salary=300;
//		emp2.CEO="Asel";
//		emp2.printInfo();
//		emp1.printInfo();
		
	}
	
	
}
