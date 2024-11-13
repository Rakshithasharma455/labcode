package day2;
class student
{
	String name;
	int age;
	String department;
	// creating default constructor
	public student()
	{
		this.name = "unknown";
		this.age = 20;
		this.department = "unassigned";
	}
	//creating a constructor with two parameter
	public student(String name,int age)
	{
		this.name = name;
		this.age = age;
		this.department = "IT";
	}
	//creating a constructor with three parameter
	public student(String name,int age,String department)
	{
		this.name = name;
		this.age = age;
		this.department = department;
	}
	//method to display student details
	public void displaydetails()
	{
		System.out.println("name:"+name +",age:"+age +",department:"+department);
	}
}

public class studentdetails {

	public static void main(String[] args) {
		//creating instances of student using different constructor
		student s1 = new student();
		student s2 = new student("aryan",20);
		student s3 = new student("rakshitha",23,"mathematics");
		s1.displaydetails();
		s2.displaydetails();
		s3.displaydetails();

	}

}
