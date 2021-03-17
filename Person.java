/*
 * Martin Haralanov
 * 11/11/20
 * Prog 2
 * Creates object with various attributes, and has methods to modify its attributes
 */


public class Person {
	
	private int age;
	private String name;
	
	public void setName (String name) {
		//I only put parameter as name because I wanted to understand how "this." works
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAge (int years) {
		
		if(years < 0) {
			throw new IllegalArgumentException("Invalid Age");
		}
		
		age = years;
	}
	
	public int getAge () {
		
		return age;
	}
}
