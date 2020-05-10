package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MinMaxMethodOfStreamInterface {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(0);
		list.add(3);
		list.add(15);
		
	   System.out.println("Before sorting--"+list);	
	   
	   Integer min=list.stream().min((I1,I2)->I1.compareTo(I2)).get();
	   System.out.println("After Min--"+min);	
	   
	   
	   Integer max=list.stream().max((I1,I2)->I1.compareTo(I2)).get();
	   System.out.println("After Max--"+max);	
	   
	   
//	   Using compareTO method
			   
	   Integer min1=list.stream().min((I1,I2)->(I1>I2)?1:(I1<I2)?-1:0).get();
	   System.out.println("After Min--"+min1);	
	   
	   
	   Integer max1=list.stream().max((I1,I2)->(I1>I2)?1:(I1<I2)?-1:0).get();
	   System.out.println("After Max--"+max1);	

	}

}
