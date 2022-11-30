package aufgaben;

public class Aufgabe_4 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c,i;
		for(i = 2; i < 60; i++) {
			c = a + b;
			System.out.print(" "+ c);
			a=b;
			b=c;
			
		}
		
	}

}
