package OOPS.ExceptionHandling;

public class Client {

	public static void main(String[] args){
		System.out.println("hello");
		Student s1 =  new Student();
		
		try {
		s1.setAge(10);
		System.out.println("after statement"); //not executed 
		}catch(Exception e) {
			System.out.println("in catch block");
		}
		
		System.out.println("bye");
		System.out.println(s1.getAge());

	}

}
