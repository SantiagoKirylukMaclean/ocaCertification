package main.java;

public class Cases {
	
	public static void main (String args[]) {
		int dayOfWeek = 0;
		switch(dayOfWeek) {
		default:
		System.out.println("Weekday");
		
		case 0:
		System.out.println("Sunday");

		case 6:
		System.out.println("Saturday");
		break;
		}
	}
	
	public static void getTurno(int dia) {
		switch (dia) {
		case 0:
		case 1:
		case 2:
			System.out.println("Turno 1");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Turno 2");
		case 6:
		default:
			System.out.println("Turno 3");
		}
	}

}
