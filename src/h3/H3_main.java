package h3;

public class H3_main {
	public static void main(String[] args) {

		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		int input = 457349;
		int rest = input;

		int i = 0;
		while (i < 15 && rest > 0) {
			einheiten[1][i] = rest / einheiten[0][i];
			rest = rest % einheiten[0][i];
			i = i + 1;
		}

		System.out.println("Input: " + input);
		System.out.println("Zerlegung: ");
		
		int j = 0;
		while (j < einheiten[0].length) {

			int wert = einheiten[0][j];
			int anzahl = einheiten[1][j];

			if (anzahl > 0) {

				if (wert >= 100) {

					int euro = wert / 100;

					if (euro >= 5) {

						System.out.println(anzahl + " x " + euro + " Euro-Schein");
					} else {

						System.out.println(anzahl + " x " + euro + " Euro-Münze");
					}

				} else {

					System.out.println(anzahl + " x " + wert + " Cent-Münze");
				}
			}

			j = j + 1;
		}
	}
}