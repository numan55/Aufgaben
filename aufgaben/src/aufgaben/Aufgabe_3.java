package aufgaben;

public class Aufgabe_3 {

	public static void main(String[] args) {
		// 1,1,2,4,7,11,16,22,29,37,....

		int b = 0;
		for (int i = 1; i <= 60; i = b + i) {
			b = b + 1;
			System.out.print(i);
			if (i != 56)
				System.out.print(",");
		}
	}

}
