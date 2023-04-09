package OOPS;

public class Student {
	private String name;
	
	public String getname(){
		return this.name;
	}

	public void setName(String name) throws Exception {
		//business rules checked 
		if(name.equals(" ")||name==null) {
			throw new Exception("Names can't be null");
		}
		this.name=name;
	}
	
	//final means value can be only set once
	public final int rollno;
	
	//static means it belongs to the class
	private static int NumOfStudents = 0;
	
	public static int GeNumofStudents() {
		return Student.NumOfStudents;
	}
	
	private static String Uniformcolor = "White";
	
	
	public static String getUniformcolor() {
		return Uniformcolor;
	}

	public static void setUniformcolor(String uniformcolor) {
		Uniformcolor = uniformcolor;
	}

	public static final int MAX_STUDENTS = 1000;
	
	public Student(String name) throws Exception{
		if(Student.NumOfStudents==Student.MAX_STUDENTS) {
			throw new Exception("Max limit Reached");
		}
		this.setName(name);
		
		Student.NumOfStudents++;
		this.rollno=Student	.NumOfStudents;
	}
	//can access both static and non static members
	public void ANonStaticFunction() {
		System.out.println(this.name+ " says Hello to " + Student.NumOfStudents + "Student.");
	}
	//can access only static data mambers
	//can't use this
	//can't use non-static data member
	//no need to create object can be directly  via class name
	public static void 	AStaticFunction() {
		System.out.println(Student.NumOfStudents + " out of Possible" + Student.MAX_STUDENTS);
	}
	
	
	
	

	

}
