package main.java;

public class OrderInitClass {
	double test = 0;

	private String name = "Fluffy";
	
	{
		System.out.println("setting field");
	}

	public OrderInitClass() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	{
		System.out.println("post Constructor");
	}

	public static void main(String[] args) {
		System.out.println("pre Chick chick = new Chick();");
		OrderInitClass chick = new OrderInitClass();
		System.out.println(chick.name);
		/*
		SysOut
		pre Chick chick = new Chick();
		setting field
		post Constructor
		setting constructor
		Tiny
		 */
	}
}