package h1;

public class H1_main {
	public static void main(String[] args) {

		int[] myArray = { 1, 2, 3, 4 };

		int[] myArrayreversed = new int[myArray.length];

		int i = 0;
		while (i < myArray.length) {
			myArrayreversed[i] = myArray[myArray.length - 1 - i];
			i = i + 1;
		}

		System.out.println("Eingabe: " + java.util.Arrays.toString(myArray));
		System.out.println("Rueckwaerts: " + java.util.Arrays.toString(myArrayreversed));

	}
}
