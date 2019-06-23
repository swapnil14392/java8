package java8.lambda;

interface Parent
{
	public void m1(int a);
//	public void m2(int a);
}


public class NonFunctionalInterface {

	public static void main(String[] args) {
		
		Parent parent=a->System.out.println(a*a);
		parent.m1(10);
		

	}

}
