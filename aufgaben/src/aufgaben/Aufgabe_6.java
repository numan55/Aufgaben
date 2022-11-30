package aufgaben;

public class Aufgabe_6 {

	public static void main(String[] args) {
		// Schreiben Sie ein Programm, das die Summe aller Zahlen von 1 bis einschließlich  100 zurückliefert.
		

		for (int i = 1; i <= 100; i++) {
			for(int a = 1; a <= 100; a++) {
				System.out.print(i + a);
				if(i + a != 200)
					System.out.print(",");
			}

		}
	}

}
