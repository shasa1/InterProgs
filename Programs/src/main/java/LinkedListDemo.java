

import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> list= new LinkedList<Student>();
		Student s1 = new  Student("Vikas",30,"X",89);
		Student s2 = new  Student("Shrikant",33,"XI",90);
		Student s3 = new  Student("Salman",28,"IIX",93);
		Student s4 = new  Student("Yogesh",56,"XXXI",34);
		float sum =0.0f;
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		
//		for (Student stud : list) {
//			System.out.println("Student name:"+stud.getName()+" -> "+stud.percentages);
//		}
		
		for (int i=0; i < list.size() ;i++) {
			System.out.println("Student name:"+list.get(i).getName()+" -> "+list.get(i).percentages);
			sum += list.get(i).percentages;
		}
		System.out.println("Average marks of students: "+ (sum/list.size()) );
		System.out.println("Before adding:"+list);
		list.add(1,new Student("xx", 1, "C", 87));
		System.out.println("After adding:"+list);
	
	}

}
class Student{
	private String name;
	int age;
	String className;
	float percentages;
	
	@Override
	public String toString() {
		return "Student-> "+name;
	}
	Student(String name,int age,String className,float percentages){
		this.name=name;
		this.age=age;
		this.className=className;
		this.percentages=percentages;
	}
	String getName(){
		return name;
	}
}