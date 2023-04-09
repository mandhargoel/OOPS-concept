package OOPS;

public class Person {
	 private String name;
	 private int age;
	 
	public Person() {
		System.out.println("I am the default constructor");
	}
	public Person(int age) {
		System.out.println("I am parameterized constructor with one para");
		this.age=age;
	}
	public Person(int age, String name) {
		System.out.println("I am parameterized constructor with two para");
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}