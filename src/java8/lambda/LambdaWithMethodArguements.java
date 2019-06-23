package java8.lambda;
//-------------------------------------------------------------------------
@FunctionalInterface
interface Bodmas
{	
	public void add(int a,int b);
}
class Maths implements Bodmas
{
	@Override
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition is="+c);
	}
	
}
//--------------------------------------------------------------------------
@FunctionalInterface
interface LengthCheck
{
	public int getLength(String s);
}
class Demo implements LengthCheck
{
	@Override
	public int getLength(String s) {
		return s.length();
	}
}

public class LambdaWithMethodArguements {

	public static void main(String[] args) {
		
		Bodmas bodmas = new Maths();
		bodmas.add(10,20);
		Bodmas bodmas1 =(a,b)->System.out.println("Lambda Expression Addition is="+(a+b));
		bodmas1.add(10,20);
		
		LengthCheck lengthCheck = new Demo();
		System.out.println("Without Lambda Expression--"+lengthCheck.getLength("balmukund"));
		
		LengthCheck lengthCheck1 =s->s.length();
		System.out.println("Lambda Expression--"+lengthCheck1.getLength("balmukund"));
		
		

	}

}
