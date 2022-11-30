package aufgaben;

public class Aufgabe_7 {

	public static void main(String[] args) {
		//Schreiben Sie ein Programm, das die Summe der Quadratzahlen von 1 bis einschließlich  25 zurückliefert.


		for (int i = 1; i <= 25; i++) {
			System.out.print(i*i + i*i);
			if(i*i + i*i != 1250)
				System.out.print(",");
		}
	}

}
