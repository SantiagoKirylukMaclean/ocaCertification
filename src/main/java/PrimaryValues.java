package main.java;

public class PrimaryValues {
	
	public static void main (String args[]) {
		byte _byte = 127;
		short _short = 32767;
		int _int = 2147483647;
		long _long = 9223372036854755807L;
		System.out.println(_byte + 2147483647);
		System.out.println(_short++);
		System.out.println(_int++);
		System.out.println(_long++);
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.print(2147483647+1); // -2147483648
	}

}
