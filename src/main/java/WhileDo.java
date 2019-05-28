package main.java;

public class WhileDo {

	public static void main(String[] args) {
		int x = 20;
		while (x > 0) {
			System.out.println("Primer paso del while");
			do {
				System.out.println("primer paso del Do");
				x -= 2;
			} while (x > 5);
			System.out.println("Primer paso del segundo while");
			x--;
			System.out.println(x + "\t");
		}
		System.out.println("");
		int y = 0;
		while (y < 10) {
			System.out.println("Primer paso del while");
			do {
				System.out.println("primer paso del Do");
				y += 1;
				System.out.println("Valor de y"+y+" en el primer while");
			} while (y < 5);
			System.out.println("Primer paso del segundo while");
			x--;
			System.out.println("Valor de y "+y+" en el segundo while");
		}

	}
	
	
}
