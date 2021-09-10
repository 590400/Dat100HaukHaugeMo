package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.text.DecimalFormat;

public class O3 {

	public static void main(String[] args) {
		long nFak = 1;
		int n = Integer.parseInt(showInputDialog("skriv inn ett heltall fra 1 til 20 (n! over 20 blir for stort tall for \"lang\" variabel"
				+ ""));
		while (n <= 0 || n > 20) {
			showMessageDialog(null, "Ugyldig input");
			n = Integer.parseInt(showInputDialog("skriv inn ett heltall over 0"));
	
		}

		for (int i = 0; i < n; i++) {
			nFak *= i + 1;
		}
		DecimalFormat nFakFormat = new DecimalFormat("#.##");
		nFakFormat.setGroupingUsed(true);
        nFakFormat.setGroupingSize(3);
		showMessageDialog(null, "N fakultet er: " + nFakFormat.format(nFak));
		
		
	}
	
}
