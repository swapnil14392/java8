package java8.lambda;

@FunctionalInterface
interface GrandFather
{
	public void m1();
}

@FunctionalInterface
interface Father1 extends GrandFather
{
	
}

@FunctionalInterface
interface Father2 extends GrandFather
{
	public void m1();
}

/*@FunctionalInterface          
interface Father3 extends GrandFather
{
	public void m2();
}

Note: Father3 will receive one method from GrandFather and another method he has m2().
      @FunctionalInterface  cannot have multiple abstract method
*/

//Note:  interface Father4 is not  @FunctionalInterface , thats y it can compile code
interface Father4 extends GrandFather
{
	public void m2();
}

class Son implements Father1
{
	@Override
	public void m1() {
		System.out.println("m1() implemented");
	}
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		GrandFather grandFather = new Son();
		grandFather.m1();
		
		Father1 father1 = new Son();
		father1.m1();
		
		Father2 father2 = ()->{System.out.println("m1() implemented using lambda Expression"); };
		father2.m1();
		
	}

}
