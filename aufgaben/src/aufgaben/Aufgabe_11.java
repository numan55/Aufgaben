package aufgaben;

public class Aufgabe_11 {

	public static void main(String[] args) {
	/*  1	2	3	4	5	6	7
		8	9	10	11	12	13	14
		15	16	17	18	19	20	21 */

		for (int i = 1; i <= 21; i++) {
			System.out.print(i + "   ");
			if(i % 21 == 7 || i % 21 == 14)
				System.out.println();
			
		}
	}

}
