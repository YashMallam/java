package Inheritance;
class Person{
	String name;
}
class Employee extends Person{
	String jobTitle;
	
}
class Student extends Person{
	String subject;
}
class DataBase{
	public Person getData(Person person) {// Person person=emp;->Upcasting
		if(person instanceof Employee) {
			Employee emp=new Employee();
			emp.jobTitle="software engineer";
			return emp;
		}else if(person instanceof Student) {
			Student student=new Student();
			student.subject="Maths";
			return student;		
		}else {
			return null;
		}
		
	}
}

public class InstanceOf {

	public static void main(String[] args) {
		DataBase dataBase=new DataBase();
		Employee emp=new Employee();
		emp=(Employee)dataBase.getData(emp);
		System.out.println(emp.jobTitle);
		
		
		Student student=new Student();
		student=(Student)dataBase.getData(student);
		System.out.println(student.subject);
			

	}

}
