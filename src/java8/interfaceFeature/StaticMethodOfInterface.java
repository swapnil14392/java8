package java8.interfaceFeature;
interface interfStatic{
	public static void staticMethod() {
		System.out.println("first static method ");
	}
	 static void staticMethod2() {
		System.out.println(" second static method....");
	}
	/* Illegal combination of modifiers for the interface method defStatic; 
	only one of abstract, default, or static permitted*/
	/* default static void defStatic() {
		 System.out.println();
	 }
	*/
	 
 /*	we can’t override static method in the implementation classes.
  /* Note: We can’t define interface static method for Object class methods, 
    we will get compiler error as “This static method cannot hide the instance method from Object”. 
    This is because it’s not allowed in java, since Object is the base class for all the classes and
    we can’t have one class level static method and another instance method with same signature.*/
  /* static String toString()
	{
		System.out.println("static toString method");
		return "phone";
	}*/
	
}
public class StaticMethodOfInterface implements  interfStatic{
	
	 void staticMethod2() {
		System.out.println(" second override static method....");
	}
	public static void main(String[] args) {
		interfStatic.staticMethod();
		
		StaticMethodOfInterface i =new StaticMethodOfInterface();
		i.staticMethod2();
	}
	
}
