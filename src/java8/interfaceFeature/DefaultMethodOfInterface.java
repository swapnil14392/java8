package java8.interfaceFeature;

interface Interef
{
	default void mobile()
	{
		System.out.println("default method mobile");
	}
	
	default String phone()
	{
		System.out.println("default method phone");
		return "phone";
	}
	
	
	// default method cannot override a method from java.lang.Object 
	/*
	 * Note: Object is the base class for all the java classes. 
	 * Object class methods are by-default available to every Java class
	 *  hence it’s not required to bring through default methods*/
	
	/*default String toString()
	{
		System.out.println("default method phone");
		return "phone";
	}*/
}


public class DefaultMethodOfInterface implements  Interef
{
	@Override
	public void mobile()
	{
		System.out.println("custom implementation mobile");
	}

	public static void main(String[] args) {
		
		Interef t = new DefaultMethodOfInterface();
		t.mobile();
        t.phone();
        
        
	}

}
