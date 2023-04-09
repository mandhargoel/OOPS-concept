package OOPS.Inheritance;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("case1");
		P obj1 =new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		
		System.out.println("case2");
		P obj2 =new C();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(((C)obj2).d2);
		obj2.fun();
		obj2.fun1();
		((C)obj2).fun2();
		
//		System.out.println("case3");
// 		C obj3 =new P(); // run time error so not allowed in java
//		System.out.println(obj3.d);
//		System.out.println(obj3.d1);
//		System.out.println(obj3.d2);
//		obj3.fun();
//		obj3.fun1();
//		obj3.fun2();
		
		System.out.println("case4");
		C obj4 =new C();
		System.out.println(obj4.d);
		System.out.println(obj4.d1);
		obj4.fun();
		obj4.fun1();
		obj4.fun2();

	}

}
