package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int tabI : tabell) {
			System.out.print("[ ");
			System.out.print(tabI + " ");
			System.out.println("]");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String output = "[";
		for (int i = 0; i < tabell.length-1; i++) {
			output += (tabell[i] + ",");
		}
		if (tabell.length > 0) {
			output += tabell[tabell.length-1];
		}
		output += "]";
		return output;
	}

	// c)
	public static int summer(int[] tabell) {
		int output = 0;
		for (int tabI : tabell) {
			output += tabI;
		}

		int output2 = 0;
		for (int i = 0; i < tabell.length; i++) {
			output2 += tabell[i];
		}

		int output3 = 0;
		int i = 0;
		while(i < tabell.length) {
			output3 += tabell[i];
			i++;
		}
		
		System.out.println("sum1: " + output);
		System.out.println("sum2: " + output2);
		System.out.println("sum3: " + output3);

		return output;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean found = false;
		int i = 0;

		while (!found && i < tabell.length) {
			if (tabell[i] == tall) {
				found = true;
			}

			i++;
		}

		return found;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		int i = 0;
		while (pos < 0 && i < tabell.length) {
			if (tabell[i] == tall) {
				pos = i;
			}

			i++;
		}

		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] output = new int[tabell.length];

		for (int i = tabell.length-1; i >= 0;  i--) {
			output[(tabell.length - 1) - i] = tabell[i];
		}

		return output;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sorted = true;

		int i = 0;
		while (sorted && i < tabell.length-1) {
			if (tabell[i] > tabell[i+1] ) {
				sorted = false;
			}
			i++;
		}

		return sorted;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] output = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			output[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			output[tabell1.length + i] = tabell2[i];
		}

		return output;
	}
}
