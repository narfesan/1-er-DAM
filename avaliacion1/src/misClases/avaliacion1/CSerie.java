package misClases.avaliacion1;

public class CSerie {

	private int i;

//compi35
	public void amosa1_10() {
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

//compi36
	public void amosa10_1() {
		for (i = 10; 1 <= i; i--) {
			System.out.println(i);
		}
	}

//compi37
	public void amosaAta20(int i) {

		for (; i <= 20; i++) {
			System.out.println(i);
		}
	}

//compi38
	public void amosaDende20(int num) {

		while (num <= i) {
			System.out.println(i);
			i--;
		}
	}

//compi39
	public void amosaA_B(int numA, int numB) {

		while (numA <= numB) {
			System.out.println(numA);
			numA++;
		}
	}

//compi40
	public void amosaB_A(int a, int b) {

		while (b >= a) {
			System.out.println(b);
			b--;
		}
	}

//prepara06
	public void amosaB_AsumaAimpares(int a, int b) {
		i = b;
		while (i >= a) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			} else {
				System.out.print(a + "+" + i + " ");
			}
			i--;
		}
	}

//prepara07
	public void amosaA_BrestaBtres(int a, int b) {

		i = a;
		while (i <= b) {

			if (i % 3 != 0)
				System.out.print(i + " ");
			else
				System.out.print("(" + b + "-" + i + ") ");
			i++;
		}
	}

//prepara12
	public void amosaB_Bsuma500seis(int a, int b) {
		i = a;
		while (i < b) {
			if (a % 6 == 0) {
				System.out.print(a + 500 + " ");
			} else if (a % 2 == 0) {
				System.out.print(a + " ");

			}
			a++;
		}
	}

// prepara16
	// void amosaA_Bmulti4partido(int a,int b)
	public void amosaA_Bmulti4partido(int a, int b) {
		for (i = a; i <= b; i++) {

			if (i % 4 == 0) {

				System.out.print("(" + i / 4 + "*4) ");
			} else {
				System.out.print(i + " ");
			}

		}
	}

}
