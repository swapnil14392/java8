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
	
	
	//You cant override
//	default String toString()
//	{
//		System.out.println("default method phone");
//		return "phone";
//	}
}


public class DefaultMethodOfInterface implements  Interef
{
	@Override
	public void mobile()
	{
		System.out.println("custom implementation mobile");
	}

	public static void main(String[] args) {
		
		DefaultMethodOfInterface t = new DefaultMethodOfInterface();
		t.mobile();
        t.phone();
	}

}
