package h2;

public class H2_main {
	public static void main(String[] args) {

		int n = 574297;
		int digits = 0;
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};

		if (n == 0) {
			digits = 1;
			a[a.length - 1] = 0;
		} else {

			int m = n;
			int k = a.length - 1;

			do {
				a[k] = m % 10;
				m = m / 10;

				digits = digits + 1;
				k = k - 1;

			} while (m > 0);
		}

		System.out.println("digits = " + digits);
		System.out.println(java.util.Arrays.toString(a));
	}
}