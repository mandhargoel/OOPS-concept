package OOPS.Overloading;

public class FunOverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println(sum(2, 3));
		System.out.println(sum(5, 10, 20));
		System.out.println(sum(2.5, 3.5));
		System.out.println(sum(3.20, "hello"));
		System.out.println(sum(2,3,4,5,1));

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	//public static void sum(int a, int b) {
	//System.out.println(a+b);
	//}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static double sum(double a, String b) {
		return a;
	}
	
	public static int sum(int... args) { // one type of type and at last
		int sum=0;
		for(int val : args) {
			sum+=val;
		}
		return sum;
	}

}
