package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {
		int input;
		char karakter;

		for (int i = 0; i < 10; i++) {
			do {

				input = Integer.parseInt(showInputDialog("Skriv inn poengsumm fra prøve"));
				karakter = '0';
				if (input < 0 || input > 100) {
					showMessageDialog(null, "Ugyldig poengsum les inn på nytt");
				}
			} while (input < 0 || input > 100);

			if (input < 40) {
				karakter = 'F';
			} else if (input < 50) {
				karakter = 'E';
			} else if (input < 60) {
				karakter = 'D';
			} else if (input < 80) {
				karakter = 'C';
			} else if (input < 90) {
				karakter = 'B';
			} else {
				karakter = 'A';
			}

			showMessageDialog(null, "Din karakter er: " + karakter);
		}
	}

}
