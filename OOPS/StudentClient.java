package OOPS;

public class StudentClient {

	public static void main(String[] args) throws Exception {
		Student[] students = new Student[1000];
		
		for(int i=0;i<students.length;i++) {
			students[i]= new Student( i + "th");
			System.out.println(Student.GeNumofStudents());
		}
		
		//Able to access static field but can't change the value
		//Student.MAX_STUDENTS=2000;
		
		//students[250].rollno=10;
		System.out.println(students[250].rollno);
		
		System.out.println(students[250].getname());
		students[250].setName("ABC");
		System.out.println(students[250].getname());
		
		students[250].ANonStaticFunction();
		students[250].AStaticFunction();
		Student.AStaticFunction();
		
		students[250].setUniformcolor("Blue");
		System.out.println(students[350].getUniformcolor());
		

	}

}
