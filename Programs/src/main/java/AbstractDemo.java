


public class AbstractDemo {
	public static void main(String[] args) {
//		Employee e= new Employee("Vikas Thange",101,1234);
//		e.getSalary();
		
		Tester t = new Tester("Vikas", 342, 342342,"Barclay");
		t.getSalary();
//		
//		Accountant a = new Accountant("Acc", 23, 5000);
//		a.getSalary();
		
		Employee e = new Tester("acc2", 23, 23,"CS");
		e.getSalary();
	}

}

abstract class Employee{
	String name;
	int empId;
	float salary;
	
	public Employee(String name,int empid, float salary) {
		System.out.println("In employee constructor");
		this.name = name;
		this.salary=salary;
		this.empId=empid;
	}
	
	void logIn(){
		System.out.println("Employee logged in");
	}
	void logOut(){
		System.out.println("Employee logged out");
	}
	abstract void getSalary();
	
//	abstract void payTax();
}
class Tester extends Employee{
	
	String project;
	public Tester(String name, int empid, float salary,String project) {
		super(name,empid,salary);
		this.project= project;
		System.out.println("IN tester constructor");
	}
	void createTestCase(){
		System.out.println("Test case created..");
	}
	void executeTestCase(){
		System.out.println("Test case executed..");
	}
	
	void getSalary() {
		System.out.println("Tester salary:"+salary);
		
	}
}
class Accountant extends Employee{
	
	public Accountant(String name, int empid, float salary) {
		super(name,empid,salary);
		System.out.println("IN accountant construtor");
	}
	
	public void depositeMoneyToBank(){
		System.out.println("Money deposited to bank");
	}
	public void getSalary(){
		System.out.println("Accountant get extra 20% salary:"+ (salary+(salary * .20)) );
	}
}