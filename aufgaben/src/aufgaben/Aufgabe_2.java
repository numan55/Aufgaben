package aufgaben;

public class Aufgabe_2 {

	public static void main(String[] args) {
	//	2,4,6,8,10,12,14,16,...

		for (int i = 2; i <= 25; i = i + 2) {
			System.out.print(i);
			if (i != 24)
				System.out.print(",");
		}
	}

}
