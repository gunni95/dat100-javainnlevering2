package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.println("[ ");
		for (int[] tabell : matrise) {
			System.out.print("[ ");
			for (int tabI : tabell) {
				System.out.print(tabI + " ");
			}
			System.out.println("]");
		}
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String output = "";
		for (int[] tabell : matrise) {
			for (int tabI : tabell) {
				output += (tabI + " ");
			}
			output += "\n";
		}

		return output;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] output = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			int[] outputA = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				outputA[j] = matrise[i][j]  * tall;
			}
			output[i] = outputA;
		}

		return output;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length == b.length) {
			boolean equal = true;

			int i = 0;
			while (equal && i < a.length) {
				if (a[i] != b[i]) {
					equal = false;
				}
				i++;
			}

			return equal;
		} else {
			return false;
		}
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] output = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			int[] revered = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				revered[j] = matrise[j][i];
			}
			output[i] = revered;
		}

		return output;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] output = new int[a.length][b[0].length];

		if (a[0].length == b.length) {
			for (int aH = 0; aH < a.length; aH++) {
				int[] outputA = new int[b[aH].length];
				for (int aL = 0; aL < a.length; aL++) {
					for (int i = 0; i < a[0].length; i++) {
						outputA[aL] += a[aH][i] * b[i][aL];
					}
				}
				output[aH] = outputA;
			}
		} else {
			output = new int[0][];
			System.out.println("Ikke gyldig array tilsendt");
		}

		return output;
	}
}
