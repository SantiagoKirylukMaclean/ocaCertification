package main.java;

public class Salmon {
	static int count;
	int x = 2 * 5 + 3 * 4 - 8;
	int y = 2 * ((5 + 3) * 4 - 8);

	public Salmon() {
		count = 4;
	}

	public static void main(String[] args) {
		int test;
		String hola;
		Salmon s = new Salmon();
		System.out.println(s.count); // Outputs 4
		System.out.println(s.x); // Outputs 14
		System.out.println(s.y); // Outputs 48
		int counter = 0;
		System.out.println(counter); // Outputs 0
		System.out.println(++counter); // Outputs 1
		System.out.println(counter); // Outputs 1
		System.out.println(counter--); // Outputs 1
		System.out.println(counter); // Outputs 0
		int counter2 = 0;
		System.out.println(counter2); // Outputs 0
		System.out.println(++counter2); // Outputs 1
		System.out.println(counter2); // Outputs 1
		System.out.println(counter2--); // Outputs 1
		System.out.println(counter2); // Outputs 0
	}
	
	public void Test() {
		int x = 2 * 5 + 3 * 4 - 8;
		System.out.println(x);
	}
}
