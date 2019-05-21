package main.java;

public class Bear {
	protected void finalize() {
		System.out.println("Roar!");
	}

	public static void main(String[] args) {
		Bear bear = new Bear();
		System.out.println("Roar!2");
		bear = null;
		System.out.println("Roar!3");
		System.gc();
		System.out.println("Roar!3");
	}
}
