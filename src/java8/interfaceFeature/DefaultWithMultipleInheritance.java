package java8.interfaceFeature;
interface Left{
	default void m1() {
		System.out.println("Left default method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Right default method");
	}
}
public class DefaultWithMultipleInheritance implements Left,Right {
	
public static void main(String[] args) {
	DefaultWithMultipleInheritance a=new DefaultWithMultipleInheritance();
	a.m1();
}

	/*
	 * Note:To avoid ambiguity problem (diamond problem) in the implementation class
	 *  we can provide complete new implementation
	 * or we can call any interface method as follows. interfacename.super.m1();
	 */
@Override
public void m1() {
	System.out.println("implementation class method..");
	Left.super.m1();
}
}
