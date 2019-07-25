package java8.predicateFeature;

import java.util.ArrayList;
import java.util.function.Function;

public class PredicateEmployeeManagement {

	public static void main(String[] args) {
		
		ArrayList<EmployeeModel> list = new ArrayList<>();
		
		EmployeeModel e1= new EmployeeModel("K L Rahul","CEO","Delhi",1000.00);

	}

}

class EmployeeModel
{
  private String name;	
  private String designation;
  private String city;
  private double salary;
  
public EmployeeModel(String name, String designation, String city, double salary) {
	super();
	this.name = name;
	this.designation = designation;
	this.city = city;
	this.salary = salary;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
  
public String toString()
{
	String s=String.format("(%s,%s,%s,%.2f)",name,designation, city,salary);
	return s;
}
  
  
}
