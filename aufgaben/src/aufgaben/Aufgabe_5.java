package aufgaben;

public class Aufgabe_5 {

	public static void main(String[] args) {
		//-1,2,-3,4,-5,6,-7,8,-9,10,...

		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 1)
				System.out.print("-" + i);
			if (i % 2 == 0)
				System.out.print(i);
			if (i != 25)
				System.out.print(",");

		}
	}

}
