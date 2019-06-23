package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorImpl implements Comparator<ComputerModel>
{
	@Override
	public int compare(ComputerModel o1, ComputerModel o2) {
		
		if(o1.getPrice()>o2.getPrice())
			return 100;
		else if(o1.getPrice()<o2.getPrice())
		return -200;
		return 0;
	}
}

public class CustomClassSortingWithLambdaExpression {

	public static void main(String[] args)
	{
//		Comparator<ComputerModel> comp = new ComparatorImpl();
		
//		If smaller value should come first the 1 
//		If Bigger value comes first then -1
		
		Comparator<ComputerModel> comp=(o1,o2)->(o1.getPrice()>o2.getPrice())?1: (o1.getPrice()<o2.getPrice())?-1:0;

		
		List<ComputerModel> list= new ArrayList<ComputerModel>();
		list.add(new ComputerModel("16","HP",45000));
		list.add(new ComputerModel("12","Acer",50000));
		list.add(new ComputerModel("4","Lenevo",30000));
		list.add(new ComputerModel("8","Dell",60000));
		
		System.out.println("Showroom Rates-------------------------"+list.toString());
		
		
		Collections.sort(list,comp);
		System.out.println("Showroom Rates--After Lambda Expression"+list.toString());
	}

}

class ComputerModel
{
	private String ram;
	private String name;
	private int price;
	
	public ComputerModel(String ram, String name, int price) {
		super();
		this.ram = ram;
		this.name = name;
		this.price = price;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ComputerModel [ram=" + ram + ", name=" + name + ", price=" + price + "]";
	}
	
	
}


